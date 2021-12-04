import com.spring.service.inter.ProviderTest;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yuanyu
 * @title: SpringRun
 * @description: TODO
 * @date 2021/5/14 17:51
 */

public class SpringRun {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext("consumer.xml");
        cp.start();
        ProviderTest providerTest = (ProviderTest) cp.getBean("consumerService");
        String test1 = providerTest.test1("123");
        System.out.println(test1);
        //本地调用远程的服务 打印也只会打印到远程的那个服务的控制台
        providerTest.test2("123");
        //本地调用远程的服务 打印也只会打印到远程的那个服务的控制台
        providerTest.test3();
    }
}
