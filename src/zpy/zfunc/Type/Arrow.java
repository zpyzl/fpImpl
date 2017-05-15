package zpy.zfunc.Type;

/**
 * Created by zpy on 2017/5/9.
 */
public class Arrow extends Composite{
    public Arrow(Type para, Type ret){
        super( new Composite(new Primitive("[->]"), para ), ret);
    }
}
  