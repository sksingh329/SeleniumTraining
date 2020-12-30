import com.subodh.javatraining.oop.classExamples.StaticDemo;

public class StaticDemoTest {
    public static void main(String[] args) {
        System.out.println("Count of Object are: "+StaticDemo.getCount());
        StaticDemo staticDemo = new StaticDemo();
        new StaticDemo();
        System.out.println("Count of Object are: "+StaticDemo.getCount());
    }
}
