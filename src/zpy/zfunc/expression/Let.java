package zpy.zfunc.expression;

import zpy.zfunc.Variable;

/**
 * Created by zpy on 2017/4/16.
 */
public class Let extends zpy.zfunc.expression.Expression {
    private Variable newDef;
    private zpy.zfunc.expression.Expression body;

    public Variable getNewDef() {
        return newDef;
    }

    public void setNewDef(Variable newDef) {
        this.newDef = newDef;
    }

    public zpy.zfunc.expression.Expression getBody() {
        return body;
    }

    public void setBody(zpy.zfunc.expression.Expression body) {
        this.body = body;
    }
}
