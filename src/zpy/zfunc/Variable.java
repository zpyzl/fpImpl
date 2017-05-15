package zpy.zfunc;

import zpy.zfunc.Type.Type;
import zpy.zfunc.expression.Expression;


/**
 * can be variable or function
 *
 * Created by zpy on 2017/4/16.
 */
public class Variable {
    private Type type;
    private String name;
    //function's value: expr, variable's value: expr
    private Expression value;

    public Variable(String name){
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String toString(){
        return getName()+":"+this.value.getType()+"="+getValue();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Expression getValue() {
        return value;
    }

    public void setValue(Expression value) {
        this.value = value;
    }
}
