package com.yang;

/**
 * Created by yanglaichang1 on 2017/2/9.
 */
public class MyclassLoad extends ClassLoader {

    public Class<?> defineMyClass(byte[] b, int off, int len)
    {
        return super.defineClass(null,b, off, len, null);
    }

    public Class<?> defineMyClass(String name,byte[] b, int off, int len)
    {
        return super.defineClass(name,b, off, len, null);
    }

}
