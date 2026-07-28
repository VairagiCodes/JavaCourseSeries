package basicsofprogramming.loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
* Write a program to print fibonacci series
* Up-to the given number n.
* */

public class FibonacciSeries {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a number to print fibonacci series: ");
        int number = Integer.parseInt(bufferedReader.readLine());
        int numberOne = 0;
        int numberTwo = 1;

        if(number >= 1) {
            System.out.print("0 ");
        }

        if(number >= 2) {
            System.out.print("1 ");
        }

        for(int i = 3; i <= number; i++) {
           int finalNumber = numberOne + numberTwo;
            System.out.print(finalNumber + " ");
            numberOne = numberTwo;
            numberTwo = finalNumber;
        }
    }
}
