import com.subodh.javatraining.oop.inheritanceExamples.Cylinder;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.radius = 10;
        cylinder.height = 10;
        System.out.println("Volume= "+cylinder.volume());
        System.out.println("Area= "+cylinder.area());
    }
}
