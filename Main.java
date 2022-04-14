import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import bean.Cat;
import bean.Dog;
import bean.Color;
//import config.ApplicationContextConfig;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(ConfigAll.class);
        Cat cat1= ctx.getBean(Cat.class);
        Color color = new Color();
        color.setBase_color("White");
        color.setTexture_color("Golden Brown");
        cat1.setCat_name("Bunny");
        cat1.setBreed_name("Miniature bean.Cat");
        cat1.setOwner_name("Anusha");
        cat1.setColor(color);
        System.out.println(cat1);

        Dog dog1=ctx.getBean(Dog.class);
        Color color1 = new Color();
        color1.setBase_color("Brown");
        color1.setTexture_color("White");
        dog1.setDog_name("Julie");
        dog1.setBreed_name("Dolmation");
        dog1.setOwner_name("Anusha");
        dog1.setColor(color1);
        System.out.println(dog1);
    }
}
