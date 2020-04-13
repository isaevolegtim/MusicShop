import java.io.Serializable;
import java.util.Map;

public class TestClass {
     static int i = 0;
}

class Main {
    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        testClass.i = 1;
        System.out.println(testClass.i);
        TestClass testClass1 = new TestClass();
        System.out.println(testClass1.i);
    }
}