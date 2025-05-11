public class Main {
    static int fibonacci(){
        int n = 10;
        int firstNum = 0;
        int secondNum = 1;
        int nextNum;
        for (int i = 0; i <= n; i++) {
            System.out.print(firstNum + ",");
            nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
        }
        return firstNum;
    }
        public static void main (String[]args){
            System.out.println(fibonacci());
        }
    }


