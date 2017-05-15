package zpy.zfunc.Type;

import java.util.Map;

/**
 * Created by zpy on 2017/4/15.
 */
public abstract class Type {

    public abstract Type applySub(Map<Type,Type> typeSubs);

}
