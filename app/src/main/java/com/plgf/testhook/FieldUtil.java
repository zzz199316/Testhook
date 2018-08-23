package com.plgf.testhook;

import java.lang.reflect.Field;

/**
 * 作者：zzz on 2018/8/14 0014 09:33
 * 邮箱：1038883524@qq.com
 * 功能：反射工具类
*/

public class FieldUtil {

    public static Object getField(Class clazz, Object target, String name) throws Exception {
        Field field = clazz.getDeclaredField(name);
        field.setAccessible(true);
        return field.get(target);
    }
    public static Field getField(Class clazz, String name) throws Exception{
        Field field = clazz.getDeclaredField(name);
        field.setAccessible(true);
        return field;
    }
    public static void setField(Class clazz, Object target, String name, Object value) throws Exception {
        Field field = clazz.getDeclaredField(name);
        field.setAccessible(true);
        field.set(target, value);
    }
}
