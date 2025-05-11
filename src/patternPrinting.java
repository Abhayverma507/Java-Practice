import java.util.Scanner;

public class patternPrinting {
     static int fibonacci(int n){
           if(n==1||n==2){
               return n-1 ;
           }else {
              return fibonacci(n-1)+fibonacci(n-2);
              }

           }
           static int num(int...arr){
                int result =0;
                 for(int a :arr ){
                       result =a+result;
                 }
                 return result;
           }
    static void printStars(int stars) {
        if (stars == 0)
            return;
        System.out.print("*");
        printStars(stars - 1);
    }
           static  void pattenPrintRec(int n){
           if(n==6){
               return;
           } else if (n>0) {
               pattenPrintRec(n+1);
               for(int a=0; a<n;a++){
                   System.out.print("*");
               }
               System.out.println();

                 }
           }
           static float thermometer(float celsius){
           float a = (celsius*9/5)+32 ;
           return a;
    }
    public static void main(String[] args) {
        System.out.println(fibonacci(7));
        System.out.println(num(4,5,6,7));
        pattenPrintRec(1);
        System.out.println(thermometer(78f));
     }
}


