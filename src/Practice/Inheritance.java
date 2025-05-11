package Practice;
class Base {
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base setting X now");
        this.x = x;
    }

    public void printMe(){
        System.out.println("I am constructor");
    }
}
class Derived extends Base{
    int y ;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class Inheritance {
    public static void main(String[] args) {
      Base base = new Base();
      base.setX(4);
      System.out.println("The value of X is "+base.getX());

      Derived derived = new Derived();
      derived.setY(43);
      System.out.println("The value of Y is "+derived.getY());
       // base.setY();
    }
}
