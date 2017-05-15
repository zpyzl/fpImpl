package zpy.zfunc;

import zpy.zfunc.Type.Type;
import zpy.zfunc.expression.Expression;
import zpy.zfunc.expression.Lambda;

import java.util.List;

/**
 * Variables are also funcDefs.
 *
 * Created by zpy on 2017/4/15.
 */
public class FuncDef extends Lambda {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
