package Practice;
class Base1{
    Base1(){
        System.out.println("I am a constructor of base class");
    }
    Base1(int x ){
        System.out.println("I am a constructor of base class with value of x =x "+ x);
    }

}
class Derived1 extends Base1{
    Derived1(){
        //  super(3);
        System.out.println(" I am a constructor of derived class");
    }

    Derived1(int x , int y){
          super(x);
        System.out.println(" I am a constructor of Derived class with value of y = "+ y);
    }
}
class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("I am constructor of ChildOfDerived class ");
    }
    ChildOfDerived(int x, int y , int z ){
        super(x,y);
        System.out.println("I am a constructor of ChildOfDerived class with value of z= "+ z);
    }
}
public class Constructor {
    public static void main(String[] args) {
       // Base1 base1 = new Base1();
       // Derived1 derived1 = new Derived1(2,5);
        ChildOfDerived childOfDerived = new ChildOfDerived(2,7,4);
    }
}
