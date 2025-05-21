package Practice;

import java.util.ArrayList;
import java.util.Set;

class MaxInputException extends Exception {
    public String getMessage() {
        return "YOUR GIVEN VALUE IS GREATER THAN 100000";
    }
}
class InvalidInputException extends Exception {
    public String getMessage() {
        return "YOUR GIVEN INPUT IS INVALID";
    }
}

class MaxMultiplicationReach extends Exception {
        public String getMessage() {
            return "YOUR GIVEN VALUE IS GREATER THAN 7000";
        }
}


class Calculator{
    public static int Addition(int Number1 , int Number2 ) throws MaxInputException, InvalidInputException {
        if(Number1>100000||Number2>100000){
            throw new MaxInputException();
        } if( Number1==8 ||Number2==9){
            throw new InvalidInputException();
        }
        return Number1+Number2;
    }
    public static int subtraction(int Number1 , int Number2 ) throws MaxInputException, InvalidInputException {
        if(Number1>100000||Number2>100000){
            throw new MaxInputException();
        } if( Number1==8 ||Number2==9){
            throw new InvalidInputException();
        }
        return Number1-Number2;
    }
    public static int Multiplication(int Number1 , int Number2 ) throws  InvalidInputException, MaxMultiplicationReach {
        if(Number1>7000||Number2>7000){
            throw new MaxMultiplicationReach();
        } if( Number1==8 ||Number2==9){
            throw new InvalidInputException();
        }
        return Number1*Number2;
    }
    public static int Division(int Number1 , int Number2 ) throws MaxInputException, InvalidInputException ,ArithmeticException{
        if(Number1>100000||Number2>100000){
            throw new MaxInputException();
        } if( Number1==8 ||Number2==9){
            throw new InvalidInputException();
        }
        if(Number1==0 || Number2==0){
            throw new  ArithmeticException();
        }
        return Number1/Number2;
    }


}
public class Runner3 {
    public static void main(String[] args) throws MaxInputException ,InvalidInputException ,MaxMultiplicationReach,ArithmeticException {
       //   int addNum= Calculator.Addition(5,5);
        //System.out.println("YOU ANSWER IS "+addNum);
        //int sub = Calculator.subtraction(6,3);
       // System.out.println("YOU ANSWER IS "+ sub);
       int multi = Calculator.Multiplication(7000000,4);
        System.out.println("YOUR ANSWER IS "+ multi);
     //int divide = Calculator.Division(6,0);
       // System.out.println("YOUR ANSWER IS "+divide);

    }
}
