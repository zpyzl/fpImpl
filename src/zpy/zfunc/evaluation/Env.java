package zpy.zfunc.evaluation;

import zpy.zfunc.Variable;

import java.util.HashMap;

/**
 * Created by zpy on 2017/4/15.
 */
public class Env extends HashMap<String,Variable> {

    private Env innerEnv;

    public Env getInnerEnv() {
        return innerEnv;
    }

    public void setInnerEnv(Env innerEnv) {
        this.innerEnv = innerEnv;
    }

}
