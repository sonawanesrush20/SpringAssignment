import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import bean.Car;
public class TestCar {


    public class MainCar {
        public static void main(String[] args) {
            ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
            Car car1=(Car)context.getBean("car1");
            System.out.println(car1);
        }
    }
}
