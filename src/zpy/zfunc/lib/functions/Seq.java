package zpy.zfunc.lib.functions;

import zpy.zfunc.FuncDef;
import zpy.zfunc.Type.Arrow;
import zpy.zfunc.Type.Slot;
import zpy.zfunc.Variable;

/**
 * seq : forall a b. a -> b -> b
 * Created by zpy on 2017/5/15.
 */
public class Seq extends FuncDef{
    Variable p1 ;
    Variable p2 ;

    public Seq(Variable p1, Variable p2){
        this.p1.setType();
        this.type = new Arrow(p1.getValue().getType(), new Arrow(p2.getValue().getType(), new Slot("b")));


    }
}
