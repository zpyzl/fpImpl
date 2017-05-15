package zpy.zfunc.test;

import zpy.zfunc.evaluation.Evaluator;
import zpy.zfunc.Type.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zpy on 2017/5/9.
 */
public class Test1 {
    public static void main(String[] args){
        Type type1 = new Arrow(
                new Product(
                        new Arrow(new Slot("a1"), new Slot("a2")),
                        new Composite(new Primitive("list"), new Slot("a3"))),
                new Composite(new Primitive("list"), new Slot("a2")));

        Type type2 = new Arrow(
                        new Product(
                                    new Arrow(new Slot("a3"), new Slot("a4")),
                                    new Composite(new Primitive("list"), new Slot("a3"))),
                        new Slot("a5"));

        Map<Type,Type> typeSubs = new HashMap<>();
        System.out.println("Type 1     -> " + type1);
        System.out.println("Type 2     -> " + type2);
        System.out.println(Evaluator.unifyTypes(type1, type2, typeSubs));
        System.out.println(typeSubs);
        System.out.println("Type 1     -> "+ type1);
        System.out.println("Type 2     -> "+ type2);
        System.out.println("applySub 1 -> "+ type1.applySub(typeSubs));
        System.out.println("applySub 2 -> "+ type2.applySub(typeSubs));
    }
}
