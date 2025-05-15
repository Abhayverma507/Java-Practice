package Practice;

class NegativeRadiusException extends Exception{
    public String getMessage(){
        return " negative argument";
    }

}
public class ThrowAndThrows {

     public  static double areaOfCircle(int r) throws NegativeRadiusException {
          if (r < 0) {
           throw new NegativeRadiusException();
         }
         double result = Math.PI * r * r;
     return result;
     }

    public static int divide(int a, int b) throws ArithmeticException {
        int result = a / b;
        return result;
    }

    public static void main(String[] args) {
        try {
            int a = divide(4, 0);
            System.out.println(a);
        }
        catch (ArithmeticException arithmeticException){
            System.out.println("ArithmeticException occor");
        }
        try {
              double a = areaOfCircle(-4);
            System.out.println(a);
        }
        catch (NegativeRadiusException negativeRadiusException) {
            System.out.println(negativeRadiusException.getMessage());
        }
    }
}