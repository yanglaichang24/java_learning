package sdk.java.util;

import org.junit.Test;

import java.util.Optional;

public class Optional_Test {



    @Test
    public void test(){
        Boolean xx = Optional
                .ofNullable(System.getProperty("xx"))
                .map(Boolean::valueOf)
                .orElse(Boolean.TRUE);

        boolean xx1 = Optional
                .ofNullable(System.getProperty("xx"))
                .isPresent();


                Optional.ofNullable(new Object())
                        .ifPresent(t-> System.out.println(t));

        Optional.ofNullable(new Object())
                .ifPresentOrElse(t-> System.out.println(t),()-> System.out.println("xx"));

        //Optional.of()


        System.out.println(xx);
    }

}
