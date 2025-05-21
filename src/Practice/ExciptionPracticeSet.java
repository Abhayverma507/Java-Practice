package Practice;

import java.util.Scanner;

class MaxRetries extends Exception {

    public String getMessage() {
        return "MaxRetries Reach";
    }
}

public class ExciptionPracticeSet {

    public static void main(String[] args) throws MaxRetries {
        int[] array = new int[10];
        array[0] = 0;
        array[1] = 1;
        array[2] = 2;
        array[3] = 3;
        array[4] = 4;
        array[5] = 5;
        array[6] = 6;
        array[7] = 7;
        array[8] = 8;
        array[9] = 9;
        boolean name = true;
        int i = 0;
        while (name && i < 5) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the index number");
            int index = scanner.nextInt();
            try {
                System.out.println("Your index value is " + array[index]);
                name = false;
            } catch (Exception e) {
                System.out.println("Index is not valid ");
                i++;

            }
            if (i == 5) {
                try {
                    throw new MaxRetries();

                } catch (MaxRetries m) {
                    System.out.println(m.getMessage());

                }
            }

        }
    }
}