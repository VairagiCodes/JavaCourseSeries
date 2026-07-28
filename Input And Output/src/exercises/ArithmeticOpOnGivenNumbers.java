package exercises;

import java.util.Scanner;

/*
 Write a program to input two number A and B from the user
 and do all the basic arithmetic operations on given numbers
*/

public class ArithmeticOpOnGivenNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number A And B: ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("A + B = " + (a+b));
        System.out.println("A - B = " + (a-b));
        System.out.println("A * B = " + (a*b));
        System.out.println("A / B = " + (a/b));
        System.out.println("A % B = " + (a%b));
    }
}
