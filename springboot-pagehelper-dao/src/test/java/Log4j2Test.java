import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by Administrator on 2017/8/14.
 */
public class Log4j2Test {

    static Logger logger = LogManager.getLogger(Log4j2Test.class);
    public static void main(String[] args) {

        logger.debug("aaaaaaaaa");
        logger.debug("bbbbbbbb");
        logger.debug("cccccccccc");
        logger.debug("ddddddddddd");
    }
}
