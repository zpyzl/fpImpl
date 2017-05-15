package zpy.zfunc.Type;

import java.util.Map;

/**
 * Created by zpy on 2017/4/15.
 */
public class Composite extends Type{
    private Type constructor;
    private Type argument;

    public Composite(Type constructor, Type argument) {
        this.constructor = constructor;
        this.argument = argument;
    }
    @Override
    public String toString(){
        if( argument instanceof Composite){
            return this.constructor + " ( " + this.argument + " )";
        }else{
            return this.constructor + " " + this.argument ;
        }
    }

    @Override
    public Type applySub(Map<Type, Type> typeSubs) {
        return new Composite( this.constructor.applySub(typeSubs), this.argument.applySub(typeSubs)) ;
    }
    @Override
    public boolean equals(Object t) {
        if( t instanceof Composite ){
            Composite c = (Composite) t;
            return constructor.equals(c.getConstructor()) && argument.equals(c.getArgument());
        }else{
            return false;
        }
    }

    public Type getConstructor() {
        return constructor;
    }

    public void setConstructor(Type constructor) {
        this.constructor = constructor;
    }

    public Type getArgument() {
        return argument;
    }

    public void setArgument(Type argument) {
        this.argument = argument;
    }
}
