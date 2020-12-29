import com.subodh.javatraining.oop.inheritanceExamples.Box;
import com.subodh.javatraining.oop.inheritanceExamples.BoxWeight;

public class BoxWeightDemo {
    public static void main(String[] args) {
        BoxWeight boxWeight = new BoxWeight(10,20,30,40);
        System.out.println(boxWeight.volume());
        Box box = boxWeight;
        System.out.println(box.volume());
        //System.out.println("Height is "+box.height);
        //System.out.println("Weight is "+box.weight);
        System.out.println("Height is "+box.getHeight());
    }
}
