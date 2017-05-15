package zpy.zfunc.test;

import zpy.zfunc.FuncDef;
import zpy.zfunc.Variable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zpy on 2017/5/15.
 */
public class Test2 {
    public static void main(String[] args){
        //const f_id = translate(
                /*Object[] s =
                {"function", "crz", "x", {"seq",
                            {"letf", "crz1", "y", {"seq",
                                {"letf", "crz2", "z",
                                    {"seq", "x", {"seq", "y", "z"}}},
                            "crz2"}
                            },
                            "crz1"}};*/
                ///
        FuncDef f_id = new FuncDef();
        f_id.setName("crz");
        List<Variable> parameters1 = new ArrayList<>();
        parameters1.add(new Variable("x"));
        f_id.setParameters(parameters1);

        FuncDef crz2 = new FuncDef();
        List<Variable> parameters2 = new ArrayList<>();
        parameters2.add(new Variable("z"));
        crz2.setParameters(parameters2);
        crz2.setBody();

        f_id.setBody();

    }
}

