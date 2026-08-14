package input.stringtokenizer;

/*
 * Normally, using BufferedReader, we read the entire input as a single String.
 * If the input contains multiple values on the same line, we need a way
 * to separate them into individual values.
 *
 * In this program, the user enters the student's
 * name, roll number, and classroom in a single line.
 *
 * StringTokenizer then separates these values,
 * allowing us to process each one individually.
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TakingMultipleInputsInline {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Ask the user to enter all the student details in a single line.
        System.out.print("Enter Student Name, Roll Number and Class: ");

        // readLine() reads the entire line as a String.
        String enteredString = bufferedReader.readLine();

        /*
         * StringTokenizer breaks the entered String into individual tokens.
         * Here, a single space (" ") is used as the delimiter.
         *
         * Example Input:
         * VairagiCodes 10 A
         *
         * Tokens:
         * VairagiCodes
         * 10
         * A
         */
        StringTokenizer stringTokenizer = new StringTokenizer(enteredString, " ");

        String studentName = stringTokenizer.nextToken().trim();
        int studentRollNumber = Integer.parseInt(stringTokenizer.nextToken().trim());
        char studentClassRoom = stringTokenizer.nextToken().trim().charAt(0);

        System.out.println("Student Name: " + studentName);
        System.out.println("Student Roll.no: " + studentRollNumber);
        System.out.println("Student Class room: " + studentClassRoom);

    }
}
