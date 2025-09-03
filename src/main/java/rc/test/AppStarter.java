package rc.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import rc.test.server.ServerConfig;


public class AppStarter {
    public static void main(String[] ars) {
        try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext()) {
            ctx.register(ServerConfig.class);

            ctx.refresh();
            ctx.start();

            Thread.currentThread().join();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
