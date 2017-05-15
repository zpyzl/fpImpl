package zpy.zfunc.expression;

import zpy.zfunc.Type.Type;

import java.util.List;

/**
 * can be function apply, closure, primitive value,
 *
 * Created by zpy on 2017/4/15.
 */
public class Expression {
    protected Type type;
    private List<Expression> operands;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public List<Expression> getOperands() {
        return operands;
    }

    public void setOperands(List<Expression> operands) {
        this.operands = operands;
    }
}
