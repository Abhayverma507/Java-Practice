package Practice;
interface BasicAnimal{
    void eat();
    void  sleep();
}

class  Monkey{
    public  void jump(){
        System.out.println("Jump");
    }
    public void bite(){
        System.out.println("bite");
    }
}
class Human extends Monkey implements BasicAnimal{

     void speak(){
         System.out.println(" hello");
     }
    @Override
    public void eat() {
        System.out.println("eat");
    }

    @Override
    public void sleep() {
        System.out.println("sleep");
    }


}
public class PracticeSet {
    public static void main(String[] args) {
        Monkey monkey =new Human();
         monkey.jump();
         monkey.bite();
       BasicAnimal basicAnimal = new Human();
       basicAnimal.sleep();
       basicAnimal.eat();
    }

}

