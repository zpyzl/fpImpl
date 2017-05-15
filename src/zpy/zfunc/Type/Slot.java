package zpy.zfunc.Type;

import java.util.Map;

/**
 * Created by zpy on 2017/4/17.
 */
public class Slot extends Type {
    private String name ;

    public Slot(String name){
        this.name = name;
    }
    @Override
    public Type applySub(Map<Type, Type> typeSubs) {
        Type sub = typeSubs.get(this);
        if (sub == null || sub.equals( this )){
            return this;
        }else{
            return sub.applySub(typeSubs);
        }
    }
    @Override
    public String toString(){
        return "#"+this.name;
    }
    @Override
    public boolean equals(Object t) {
        if( t instanceof Slot){
            return ((Slot) t).getName().equals(this.name);
        }else{
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
