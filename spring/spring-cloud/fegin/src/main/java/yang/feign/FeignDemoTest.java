package yang.feign;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Mr.Yang
 * @desc FeginDemoTest
 * @date 2023/2/17 16:43
 */
@RestController
public class FeignDemoTest {

    @Resource
    private FeignComsumerDemo feignComsumerDemo;

    @GetMapping("/api")
    @ResponseBody
    public String test() {
        return feignComsumerDemo.test();
    }

}
