package com.yang;

import java.util.HashMap;
import java.util.Map;

public class Demo {



    public static void main(String[] args) {

       /* Map<String,Boolean> temp = new HashMap<>();
        for(Map.Entry<> test : temp){
            System.out.println(isValidIPv4("0.1.0.1"));
        }*/
    }



    public final static boolean isValidIPv4(String ip){
            //255.255.255.255
           if(null == ip || ip.length() > 16) return false;
            String[] split = ip.split("\\.");
            if(split.length == 4){
                for(String id : split){
                    Integer integer = Integer.valueOf(id.trim());
                    if(integer > 255 ||  integer < 0){
                        return false;
                    }
                }
                return true;
            }
            return false;
    }

}
