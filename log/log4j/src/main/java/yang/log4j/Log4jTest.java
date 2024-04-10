package yang.log4j;

import java.util.logging.Logger;

/**
 * @author Mr.Yang
 * @desc Log4jTest
 * @date 2023/3/17 14:08
 */
public class Log4jTest {

    static Logger logger = Logger.getLogger(Log4jTest.class.getName());

    public static void main(String[] args) {
        logger.info(" ****** ");
    }

}
