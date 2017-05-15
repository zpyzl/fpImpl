package zpy.zfunc.expression;

import java.util.List;

/**
 * Created by zpy on 2017/4/16.
 */
public class LambdaApp extends Expression {
    private Lambda function;
    private List<Expression> parameters;

    public Lambda getFunction() {
        return function;
    }

    public void setFunction(Lambda function) {
        this.function = function;
    }

    public List<Expression> getParameters() {
        return parameters;
    }

    public void setParameters(List<Expression> parameters) {
        this.parameters = parameters;
    }
}
