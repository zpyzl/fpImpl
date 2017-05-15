package zpy.zfunc.Type;

import java.util.Map;

/**
 * Created by zpy on 2017/4/15.
 */
public class Primitive extends Type{

    private String name;

    public Primitive(String name){
        this.name = name;
    }
    @Override
    public boolean equals(Object t){
        if( t instanceof Primitive ){
            return this.name.equals(((Primitive) t).getName());
        }else{
            return false;
        }
    }
    @Override
    public String toString(){
        return this.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Type applySub(Map<Type, Type> typeSubs) {
        return this;
    }
}
