package com.yang.api.java.map;


/**
 * Created by yanglaichang1 on 2017/4/20.
 */
public class TreeMapTest {

    public static void main(String[] args) {
        String str ="aba";
        System.out.println(validPalindrome(str));
    }


        public static boolean validPalindrome(String s) {
            char[] ch = s.toCharArray();
            boolean flag = false;
            for(int i = 0;i<ch.length;i++){
                if(flag){
                    return true;
                }
                int k = 0;
                for(int j= 0;j<=ch.length/2;j++){
                    if(i == j || i == 0){
                        continue;
                    }
                    if(j < i){
                        if(ch[j] == ch[ch.length -1-j]){
                            j++;
                        } else{
                            break;
                        }
                    } else {
                        if(ch[j] == ch[ch.length-1]){
                            j++;
                        } else {
                            break;
                        }
                    }
                }
                if(k == ch.length/2){
                    flag = true;
                }
            }
            return flag;
        }

}
