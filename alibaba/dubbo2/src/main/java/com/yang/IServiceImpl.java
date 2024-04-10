package com.yang;

/**
 * @author Mr.Yang
 * @desc IServiceImpl
 * @date 2023/3/23 20:08
 */
public class IServiceImpl implements IService {

    @Override
    public String execute(String str) {
        return "IServiceImpl#" + str;
    }

    @Override
    public void doit(String str) {
        System.out.println("str=" + str);
    }

}
