package zpy.zfunc.common;

/**
 * Created by zpy on 2017/4/16.
 */
public class InterpreterException extends Exception{
    private String msg;
    public InterpreterException(String msg){
        this.msg = msg;
    }
}
