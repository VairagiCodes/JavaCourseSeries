package basicsofprogramming.loops;

import java.util.Scanner;

/*
* Write a program to reverse a given number n
* */

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to reverse it: ");
        int number = scanner.nextInt();
        int reverseNumber = 0;
        while(number > 0) {
            reverseNumber = reverseNumber * 10 + number % 10;
            number /= 10;
        }
        System.out.println("Reverse number: " + reverseNumber);

        /*
        * This is false for -ve numbers
        * Practice Question: Modify this program to support -ve numbers
        * */
    }
}
