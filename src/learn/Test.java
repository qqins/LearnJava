package learn;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by qqins on 2017/9/19 14:36
 */
public class Test {
    private static final Logger LOGGER = LogManager.getLogger(Test.class.getName());

    public static void main(String[] args)  {
        LOGGER.trace("trace level");
        LOGGER.debug("debug level");
        LOGGER.info("info level");
        LOGGER.warn("warn level");
        LOGGER.error("error level");
        LOGGER.fatal("fatal level");
    }
}
