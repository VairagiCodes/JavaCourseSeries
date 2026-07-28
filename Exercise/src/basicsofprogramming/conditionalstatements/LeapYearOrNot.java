package basicsofprogramming.conditionalstatements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeapYearOrNot {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a year to check leap or not: ");
        int givenYear = Integer.parseInt(bufferedReader.readLine());

        if (givenYear % 400 == 0) {
            System.out.println(givenYear + " is a leap year");
        } else if (givenYear % 100 == 0) {
            System.out.println(givenYear + " is not a leap year");
        } else if (givenYear % 4 == 0) {
            System.out.println(givenYear + " is a leap year");
        } else {
            System.out.println(givenYear + " is not a leap year");
        }
    }
}
