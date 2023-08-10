package modules;

import java.util.Scanner;

public class DataReader {
    public static Scanner scan = new Scanner(System.in);

    public static int[] readInt(String message, int quantity) {
        /*
         * Used to read and return numbers
         * Params:
         * message: Passed message that will be displayed before reading the number
         * quantity: Number of numbers to be read
         */
        if (quantity <= 0)
            quantity = 1;

        int[] numbers = new int[quantity];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(message);
            numbers[i] = scan.nextInt();
        }
        System.out.println(quantity + " numbers read!");

        scan.close();
        return numbers;
    }

    public static String readStr(String message) {
        /*
         * Used to read and return one string
         * Params:
         * message: Passed message that will be displayed before reading the number
         */
        System.out.println(message);
        scan.nextLine();
        String text = scan.nextLine();

        return text;
    }
}
