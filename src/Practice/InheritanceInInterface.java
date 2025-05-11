package Practice;
interface SampleInterface{
    void method1();
    void method2();
}
interface ChildSample extends SampleInterface {
    void method3();
    void method4();
}
 class SampleClass implements ChildSample{

     @Override
     public void method3() {
         System.out.println("method3");
     }

     @Override
     public void method4() {
         System.out.println("method 4");
     }

     @Override
     public void method1() {
         System.out.println("method 1");
     }

     @Override
     public void method2() {
         System.out.println("method 2");
     }
 }
public class InheritanceInInterface {
    public static void main(String[] args) {
        SampleClass sampleClass = new SampleClass();
        sampleClass.method1();

    }
}
