package Practice;

import java.util.Scanner;

class MyExciption extends Exception{
    public String toString(){
        return " i am the to string ";
    }
     public String getMessage(){
         return "I am the get Messege";
       }
}

public class ExciptionRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = scanner.nextInt();
        if (num < 9) {
            try {
                throw new MyExciption();
                 //throw  new ArithmeticException("exciption hai ye ");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println("ag");
            }
        }
    }
}