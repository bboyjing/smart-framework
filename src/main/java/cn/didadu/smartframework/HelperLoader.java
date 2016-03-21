package cn.didadu.smartframework;

import cn.didadu.smartframework.helper.*;
import cn.didadu.smartframework.util.ClassUtil;

/**
 * Created by jinggg on 16/3/21.
 */
public class HelperLoader {

    public static void init() {
        Class<?>[] classList = {
                ClassHelper.class,
                BeanHelper.class,
                AopHelper.class,
                IocHelper.class,
                ControllerHelper.class
        };
        for (Class<?> cls : classList) {
            ClassUtil.loadClass(cls.getName());
        }
    }

}
