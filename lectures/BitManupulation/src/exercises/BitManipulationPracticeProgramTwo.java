package exercises;

import java.util.Scanner;

/*Write a program to count the number of 1’s
  in a binary representation of the number
*/
public class BitManipulationPracticeProgramTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check 1's in binary representation: ");
        int number = scanner.nextInt();
        if (number != 0) {
            int bitMask;
            int countOnes = 0;
            for (int i = 0; i <= 31; i++) {
                bitMask = 1 << i;
                int currentNumber = number & bitMask;
                if (currentNumber != 0) {
                    countOnes++;
                }
            }
            System.out.println("Number of 1's is: " + countOnes);
        } else {
            System.out.println("Number is zero");
        }
    }
}
