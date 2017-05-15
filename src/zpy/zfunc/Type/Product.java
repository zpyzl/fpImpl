package zpy.zfunc.Type;

/**
 * Created by zpy on 2017/5/9.
 */
public class Product extends Composite{
    public Product(Type para, Type ret){
        super( new Composite(new Primitive("[*]"), para ), ret);
    }
}
  