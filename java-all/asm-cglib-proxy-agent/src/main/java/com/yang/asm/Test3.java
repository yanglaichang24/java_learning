package com.yang.asm;

/**
 * Created by yanglaichang1 on 2017/2/14.
 */
public class Test3 {

        String str = new String("good");
        char[] ch = { 'a', 'b', 'c' };
        Test3 test = new Test3();

        public static void main(String[] args) {
            Test3 ex = new Test3();
            System.out.println(ex.test);
            ex.change(ex.str, ex.ch);
            System.out.println(ex.str);
            System.out.println(ex.ch);
            System.out.println(ex.test);

        }

        public void change(String str, char ch[]) {
            str = "test ok";
            ch[0] = 'g';
            test = new Test3();
        }
}
