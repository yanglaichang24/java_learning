package sdk.java.io;

import org.junit.Test;

import java.io.FilterOutputStream;
import java.io.IOException;

public class FilterOutputStream_test {

    @Test
    public void hello(){
        new FilterOutputStream(System.out){
            @Override
            public void write(int b) throws IOException {
                super.write(b);
            }
        };
    }


}
