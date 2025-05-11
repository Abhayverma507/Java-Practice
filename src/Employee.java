
class EmployeeAttribute{
    String name ;
    int salary;

    public String getName() {
        return name;
    }

    public  void setName(String n){
        name=n;
    }
    public int getSalary() {
        return salary;
    }
}

class cellphone {
    public void ringing(){
        System.out.println("ringing....");
    }
public void vibrating(){
        System.out.println("vibrating....");
    }
public void callFriend(){
        System.out.println("ringing....");
    }
}
class square{
      public void area(int s1,int s2 ){
          if(s1==s2) {
              int areaOfSquare = s1 * s2;
              System.out.println("Area of square is"+areaOfSquare);
          }else {
              System.out.println(" square side are not equal");
          }

      }
      public void perimeter(int side ){
          int perimeterOfSquare = 4*side;
          System.out.println("Perimeter of Square is "+perimeterOfSquare);
      }
}
class rectangle {
    int length;
    int breath;
     public void area(){
        int rectangleArea = length*breath;
         System.out.println("Area of rectangle in "+rectangleArea);
     }
     public  void perimeter(){
         int rectangleArea= 2*(length+breath);
         System.out.println("perimeter of rectangle "+rectangleArea);
     }
}
class tommyGame {
    public void hit(){
        System.out.println("Hitting the enemy....");
    }
    public void fire(){
        System.out.println("hitting on the enemy....");
    }
    public void run(){
        System.out.println("running from the enemy....");
    }
}


public class Employee {
    public static void main(String[] args) {
  //employee
        /*
        EmployeeAttribute employee= new EmployeeAttribute();
        employee.setName("abhay");
        employee.salary=55;
        System.out.println(employee.getName());
        System.out.println(employee.getSalary());
 //cellphone
        cellphone vivo= new cellphone();
        vivo.ringing();
        vivo.vibrating();
        vivo.callFriend();
 //square
        square squareArea =new square();
        squareArea.area(43 ,43);
        square squarePerimeter =new square();
        squarePerimeter.perimeter(43);

   rectangle
        rectangle rectangle = new rectangle();
        rectangle.length=8;
        rectangle.breath=4;
      rectangle.perimeter();
      rectangle.area();
     */
      tommyGame player =new tommyGame();
      player.hit();
      player.fire();
      player.run();
    }
}
