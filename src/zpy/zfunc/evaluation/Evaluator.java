package zpy.zfunc.evaluation;

import zpy.zfunc.FuncDef;
import zpy.zfunc.Variable;
import zpy.zfunc.common.InterpreterException;
import zpy.zfunc.Type.Composite;
import zpy.zfunc.Type.Primitive;
import zpy.zfunc.Type.Slot;
import zpy.zfunc.Type.Type;
import zpy.zfunc.expression.Expression;
import zpy.zfunc.expression.Let;
import zpy.zfunc.expression.FunctionNameApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * evaluate expression
 *
 * Created by zpy on 2017/4/15.
 */
public class Evaluator {

    /**
     * evaluate an expression
     *
     * @param returnType the expression's return type if passed by outer expression
     * @param env
     */
    public static Expression eval(zpy.zfunc.expression.Expression expr, Type returnType, Env env,
                                Map<String, Expression> symbolTable, Map<Type,Type> typeSubs)
            throws InterpreterException {
        //expr pattern
        //eval each parts
        //check & infer types
        //exec this

        if( expr instanceof FunctionNameApp){
            FunctionNameApp funcNameExpr = (FunctionNameApp) expr;
            FuncDef funcDef = (FuncDef)((symbolTable.get(funcNameExpr.getFuncName()) != null)
                                    ? symbolTable.get(funcNameExpr.getFuncName())
                                    : env.get(funcNameExpr.getFuncName()));
            if( funcDef == null ) {
                throw new InterpreterException( "When evaluating " + expr +
                        ""+"Unsolved funcDef name! " + funcNameExpr.getFuncName());
            }else{
                if( funcNameExpr.getOperands().size() != funcDef.getParameterTypes().size() ){
                    throw new InterpreterException( "When evaluating " + expr +
                            ", Not matched number of parameters ");
                }else{
                    List<Expression> parameters = new ArrayList<>();
                    int i = 0;
                    for( zpy.zfunc.expression.Expression subExp : funcNameExpr.getOperands() ) {
                        Expression parameter = eval( subExp, funcDef.getParameterTypes().get(i),
                                env, symbolTable,typeSubs );
                        parameters.add(parameter);
                        i++;
                    }

                    //after eval value, check or unificate/specialize type with outer assigned returnType
                    //TODO does unification means substitute with subtype锛�
                    unifyTypes(funcDef.getReturnType(), returnType, typeSubs);

                    zfuncFuncCall(funcDef, parameters);

                }
            }
        }else if( expr instanceof Let ){
            Let let = (Let)expr;
            env.put(let.getNewDef().getName(), let.getNewDef());

        }
        return new Expression();
    }

    public static boolean unifyTypes(Type t1, Type t2, Map<Type,Type> typeSubs){
        if( t1 instanceof Primitive && t2 instanceof Primitive && t1.equals(t2)){
            return true;
        }else if( t1 instanceof Slot && t2 instanceof Slot &&
              t1.applySub(typeSubs).equals( t2.applySub(typeSubs)) ){
            return true;
        }else if( t1 instanceof Composite && t2 instanceof Composite ){
            return unifyTypes(((Composite) t1).getConstructor(), ((Composite) t2).getConstructor(), typeSubs)
                    && unifyTypes( ((Composite) t1).getArgument(), ((Composite) t2).getArgument(), typeSubs);
        }else if( t1 instanceof Slot ){
            typeSubs.put(t1, t2);
            return true;
        }else if( t2 instanceof Slot){
            typeSubs.put(t2,t1);
            return true;
        }else{
            return false;
        }
    }

    public static Expression zfuncFuncCall(FuncDef funcDef, List<Expression> parameters){
        return new Expression();
    }
}
