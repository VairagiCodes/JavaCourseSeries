/*Write a program to toggle
 a bit at position = “position” in a number “number”.*/

import java.util.Scanner;

public class BitManipulationPracticeProgramOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number and position to toggle: ");
        int number = scanner.nextInt();
        int position = scanner.nextInt();

        int bitMask = 1 << position;
        int newNumber = bitMask & number;
        System.out.println("For number: " + number +
                " after toggle at the given position: "
                + position);
        if (newNumber != 0) {
            number &= (~bitMask);
        } else {
            number |= bitMask;
        }


        System.out.println("The new number became: " + number);


    }
}
