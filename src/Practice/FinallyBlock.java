package Practice;

import java.util.Scanner;

class Finally {
 public  static  int method (){
     try{
         int a = 4;
         int b = 0;
         int c = a/b;
         return c;
     } catch (Exception e){
         System.out.println("ArithmeticException occor");
     }
     finally {

         System.out.println(" function is finish");
     }
     return  0 ;
 }
  public static int method1(){

      while(true){
          Scanner scanner = new Scanner(System.in);
          System.out.println("Enter the first number");
          int a = scanner.nextInt();
          System.out.println("Enter the  second number");
          int b = scanner.nextInt();
           try{
              int c = a /b ;
              return c;
          } catch (Exception e){
              System.out.println("ArithmeticException occor");
          }
          finally {

              System.out.println("function is finished");
          }
          return  0 ;
      }
  }
}

public class FinallyBlock {
    public static void main(String[] args) {
         //  int a = Finally.method();
        int a= Finally.method1();
        System.out.println(" YOUR ANSWER IS "+a);
    }
}
