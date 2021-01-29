package config;

import com.mchange.v2.log.log4j.Log4jMLog;
import lombok.extern.log4j.Log4j;
import org.springframework.context.annotation.*;

import java.util.logging.Logger;

/**
 * @Configuration
 *     标注该Class为配置文件，Spring会读取Class的内容，加入IOC容器
 * @ComponentScan
 *     告诉Spring需要扫描的包，Spring扫描后将注解的Class加入IOC容器
 *     等同于配置文件中的 <context:component-scan base-package="com.spring.sample"/>
 * @Import
 *     引入其他配置文件Class，Spring会读取设定Class的内容，加入IOC容器
 * @PropertySource
 *     引入外部properties文件
 * @Value
 *     注入初始值(例子参考JdbcConfig)
 */
@Configuration
@ComponentScan("com.spring.sample")
@Import(JdbcConfig.class)
@PropertySource("classpath:properties/jdbc.properties")
public class SpringConfiguar {

    @Bean
    public Logger createLog() {
        return Logger.getLogger("test");
    }
}
