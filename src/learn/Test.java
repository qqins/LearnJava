package learn;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.atomic.AtomicLong;

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
        int x=1;
        double y=2.5;
        x+=y;
        System.out.println(x);
        AtomicLong count = new AtomicLong(0);
        count.incrementAndGet();
    }
}
