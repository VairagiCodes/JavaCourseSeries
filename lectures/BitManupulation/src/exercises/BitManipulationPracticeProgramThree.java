package exercises;

import java.util.Scanner;

//Write a program to find if a number is a power of 2 or not.
public class BitManipulationPracticeProgramThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check if it's a power of 2 or not: ");
        int number = scanner.nextInt();


        if (number > 0) {
            int bitMask;
            int countOnesInNumber = 0;
            for (int i = 0; i < 32; i++) {
                if (countOnesInNumber > 1) {
                    System.out.println("Number is not power of 2");
                    return;
                }
                bitMask = 1 << i;
                if ((bitMask & number) != 0) {
                    ++countOnesInNumber;
                }
            }
            if (countOnesInNumber == 1) {
                System.out.println("Number is power of 2");
            }
        } else {
            System.out.println("Number is zero or a negative number");
        }


    }
}
