package Practice;
class Cylinder {
       int radius;
     int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public double surfaceArea(){
        return (2*Math.PI*radius*radius)+(2*Math.PI*radius*height);

    }
    public double volume(){
        return Math.PI*radius*radius*height;

    }
}
 class Rectangle{
         private int length;
        private int breath;

     public int getLength() {
         return length;
     }



     public int getBreath() {
         return breath;
     }



     public Rectangle(int length, int breath) {
         this.length = length;
         this.breath = breath;
     }
     public Rectangle() {
         this.length =5;
         this.breath = 9;
     }
}


public class Runner {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(9,12);
       // cylinder.setRadius(9);
        //cylinder.setHeight(12);
     //   System.out.println(cylinder.getRadius());
       // System.out.println(cylinder.getHeight());
        /*System.out.println(cylinder.surfaceArea());
        System.out.println(cylinder.volume());
        System.out.println(cylinder.radius);
        System.out.println(cylinder.height);
    */
        Rectangle rectangle = new Rectangle();
       System.out.println(rectangle.getLength());
        System.out.println(rectangle.getBreath());

     }
}
