package yang.boot;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ConditionalOnWebApplication(type = ConditionalOnWebApplication.Type.SERVLET)
public class Config_Condition {

    @Bean
    //@ConditionalOnWebApplication(type = ConditionalOnWebApplication.Type.SERVLET)
    public Object test() {
        System.out.println("----------------");
        return new Object();
    }


}
