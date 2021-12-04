import com.spring.service.inter.ProviderTest;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author yuanyu
 * @title: SpringRun
 * @description: TODO
 * @date 2021/5/14 17:31
 */
public class SpringRun {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext("provider.xml");
        cp.start();
        //ProviderTest providerTest = (ProviderTest)cp.getBean("providerTest");
        //providerTest.test();
        synchronized (SpringRun.class) {

            try {

                SpringRun.class.wait();

            } catch (Throwable e) {

            }

        }

    }
}
