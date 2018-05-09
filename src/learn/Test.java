package learn;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

/**
 * Created by qqins on 2017/9/19 14:36
 */
public class Test {
    private static final Logger LOGGER = LogManager.getLogger(Test.class.getName());

    public static void main(String[] args) throws IOException, InterruptedException {
       /* for(int i = 0; i < 50000; i++) {
            LOGGER.trace("trace level");
            LOGGER.debug("debug level");
            LOGGER.info("info level");
            LOGGER.warn("warn level");
            LOGGER.error("error level");
            LOGGER.fatal("fatal level");
        }
        try {
            Thread.sleep(1000 * 61);
        } catch (InterruptedException e) {}
        LOGGER.trace("trace level");
        LOGGER.debug("debug level");
        LOGGER.info("info level");
        LOGGER.warn("warn level");
        LOGGER.error("error level");
        LOGGER.fatal("fatal level");*/
      LOGGER.debug("hello");
    }
}
