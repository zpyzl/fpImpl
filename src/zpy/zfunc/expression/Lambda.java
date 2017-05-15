package zpy.zfunc.expression;

import zpy.zfunc.Variable;

import java.util.List;

/**
 * Created by zpy on 2017/4/16.
 */
public class Lambda extends Expression{
    private List<Variable> parameters;
    private Expression body;

    public List<Variable> getParameters() {
        return parameters;
    }

    public void setParameters(List<Variable> parameters) {
        this.parameters = parameters;
    }

    public Expression getBody() {
        return body;
    }

    public void setBody(Expression body) {
        this.body = body;
    }
}
