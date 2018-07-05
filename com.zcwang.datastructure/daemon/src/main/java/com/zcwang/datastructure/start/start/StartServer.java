package $

{package}.start;

    import com.wisdombud.core.helper.ApplicationContextHelper;
    import org.slf4j.Logger;
    import org.slf4j.LoggerFactory;
    import org.springframework.beans.BeanUtils;
    import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能 :
 * date : 2016-08-01 13:54
 *
 * @author : xdwang@wisdombud.com
 * @version : 0.0.4-snapshot
 * @since : JDK 1.8
 */
public final class StartServer {
    private static final Logger LOGGER = LoggerFactory.getLogger(StartServer.class);

    public static void main(final String[] args) {
        new ClassPathXmlApplicationContext("classpath*:/config/**/*applicationContext*.xml");

    }
}
