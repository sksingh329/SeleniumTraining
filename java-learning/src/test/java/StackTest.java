import com.subodh.javatraining.oop.classExamples.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack stack1 = new Stack();
        stack1.pop();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.pop();
        System.out.println(stack1.peek());
    }
}
