package Practice;
class Rectangle1{
   int length;
   int width;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    Rectangle1(int LengthOfRectangle, int WidthOfRectangle){
       setLength(LengthOfRectangle);
       setWidth(WidthOfRectangle);
   }
   public void areaOfRectangle(){
      int areaRectangle = getWidth()+getLength();
       System.out.println("Area of rectangle is "+ areaRectangle);
   }
}
class Square extends Rectangle1{
    int side ;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    Square(int LengthOfRectangle, int WidthOfRectangle, int SideOfSquare) {
        super(LengthOfRectangle,WidthOfRectangle);
        setSide(SideOfSquare);
    }
    public void areaOfSquare(){
        int areaSquare =getSide()*getSide() ;
        System.out.println("Area of square is "+areaSquare  );
    }
}

class Circle extends Square {
   int radius ;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    Circle(int LengthOfRectangle, int WidthOfRectangle, int SideOfSquare, int RadiusOfCircle ){
        super(LengthOfRectangle,WidthOfRectangle,SideOfSquare);
        setRadius(RadiusOfCircle);
    }
    public void areaOfCircle(){
        double areaCircle= Math.PI*getRadius()*getRadius();
        System.out.println("Area of circle is "+areaCircle);
    }
}
class Cylinder1 extends Circle {

    int radiusOfCylinder;
    int heightOfCylinder;


    public int getHeightOfCylinder() {
        return heightOfCylinder;
    }
    public void setHeightOfCylinder(int heightOfCylinder) {
        this.heightOfCylinder = heightOfCylinder;
    }


    public int getRadiusOfCylinder() {
        return radiusOfCylinder;
    }

    public void setRadiusOfCylinder(int radiusOfCylinder) {
        this.radiusOfCylinder = radiusOfCylinder;
    }


    Cylinder1(int LengthOfRectangle, int WidthOfRectangle, int SideOfSquare, int RadiusOfCircle, int RadiusOfCylinder, int HeightOfCylinder) {
        super(LengthOfRectangle,WidthOfRectangle,SideOfSquare,RadiusOfCircle);
        setHeightOfCylinder(HeightOfCylinder);
        setRadiusOfCylinder(RadiusOfCylinder);
    }


    public void surfaceAreaOfCylinder(){
        double surfaceAreaCylinder = (2*Math.PI*radiusOfCylinder*radiusOfCylinder)+(2*Math.PI*radiusOfCylinder*heightOfCylinder);
        System.out.println("Surface Area of Cylinder is "+surfaceAreaCylinder);
    }
    public void volumeOfCylinder(){
        double volumeCylinder = Math.PI*radiusOfCylinder*radiusOfCylinder*heightOfCylinder;
        System.out.println("Volume of Cylinder is " + volumeCylinder);
    }
}


public class SetAllDimensions extends Cylinder1 {
    SetAllDimensions(int LengthOfRectangle, int WidthOfRectangle, int SideOfSquare, int RadiusOfCircle, int RadiusOfCylinder, int HeightOfCylinder) {
        super(LengthOfRectangle, WidthOfRectangle, SideOfSquare, RadiusOfCircle, RadiusOfCylinder, HeightOfCylinder);
    }

    public static void main(String[] args) {
       SetAllDimensions allDimensions = new SetAllDimensions(2,2,2,2,2,2);
           allDimensions.areaOfRectangle();
           allDimensions.areaOfSquare();
           allDimensions.areaOfCircle();
           allDimensions.surfaceAreaOfCylinder();
           allDimensions.volumeOfCylinder();
   }

}
