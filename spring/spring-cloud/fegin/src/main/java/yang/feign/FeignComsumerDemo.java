package yang.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Mr.Yang
 * @desc FeginComsumerDemo
 * @date 2023/2/17 16:43
 */
@FeignClient("server-demo")
public interface FeignComsumerDemo {

    @GetMapping("/api")
    String test();


}
