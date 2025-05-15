package Practice;

import java.util.Scanner;

public class ExciptionHandling {
    public static void main(String[] args) {
     int [] marks= new int[5];
     marks[0]=4;
     marks[1]=3;
     marks[2]=5;
     marks[3]=7;
     marks[4]=8;
     Scanner scanner = new Scanner(System.in);
              System.out.println();
        System.out.println("Enter the value of array index");
        int index=scanner.nextInt();

        System.out.println("Enter the value you want to divide ");
        int number = scanner.nextInt();

            try {
                System.out.println("Your array index value " + marks[index]);

                try{
                    System.out.println("The answer of arrayIndex/Number " + marks[index] / number);
                }
              catch (ArithmeticException a) {
                    System.out.println("ArithmeticException");
                    System.out.println(a);
                }
            }  catch (ArrayIndexOutOfBoundsException a) {
                System.out.println("ArrayIndexOutOfBoundsException ");
                System.out.println(a);
            }
        }
    }
