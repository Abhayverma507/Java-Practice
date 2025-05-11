package Practice;
abstract class Parent{
     public Parent(){
         System.out.println(" i am the constructor of parent class ");
     }
     public  void seyHello(){
         System.out.println("HELLO");
     }
     abstract public void greet();
     abstract public void greet(int x , int y);

}
class Child extends Parent{

    @Override
    public void greet() {
        System.out.println("GOOD MORNING");
    }

    @Override
    public void greet(int x, int y) {
        int add= x+y;
        System.out.println("GOOD MORNING"+add+"TIMES");
    }
}
abstract class Child2 extends Parent{
public void th(){
    System.out.println("i am the  good ");
}
}

public class Abstract {
    public static void main(String[] args) {
        Child child = new Child();
         child.greet(2,3);

    }
}
