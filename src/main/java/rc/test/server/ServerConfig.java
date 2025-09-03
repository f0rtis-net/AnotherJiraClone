package rc.test.server;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = { "rc.test.server"})
@PropertySource("classpath:server.properties")
public class ServerConfig {
}
