
import bean.Cat;
import bean.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class ConfigAll {
@Bean(name = "dog1")
public Dog getDog() {
    return new Dog();
}

@Bean(name = "cat1")
public Cat getCat() {
    return new Cat();
}
}
