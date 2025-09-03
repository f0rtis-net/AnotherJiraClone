package rc.test.server;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.startup.Tomcat;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

import java.io.File;

@Component
public class EmbeddedTomcat implements SmartLifecycle {

    @Value("${tomcat.port:8080}")
    private int port;

    private final Tomcat tomcat = new Tomcat();
    private boolean running = false;

    @Override
    public void start() {
        try {
            tomcat.setPort(port);
            tomcat.getConnector();

            StandardContext ctx = (StandardContext) tomcat.addWebapp("", new File("src/main/webapp").getAbsolutePath());
            ctx.setParentClassLoader(getClass().getClassLoader());

            tomcat.start();
            running = true;

            System.out.println("Tomcat started on port: " + port);

        } catch (Exception e) {
            throw new RuntimeException("Failed to start Tomcat", e);
        }
    }

    @Override
    public void stop() {
        try {
            tomcat.stop();
            tomcat.destroy();
            running = false;
        } catch (LifecycleException e) {
            throw new RuntimeException("Failed to stop Tomcat", e);
        }
    }

    @Override
    public boolean isRunning() {
        return running;
    }
}