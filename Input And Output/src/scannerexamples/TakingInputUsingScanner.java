package scannerexamples;

/*
 * Scanner is a class from the java.util package
 * used to accept input from different sources,
 * such as the keyboard, files, and strings.
 *
 * In this program, we use Scanner to accept
 * the student's name, roll number, and classroom
 * from the standard input device (keyboard).
 */

import java.util.Scanner;

public class TakingInputUsingScanner {

    public static void main(String[] args) {

        // Create a Scanner object connected to the keyboard.
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter all the student details.
        System.out.print("Enter Student Name, Roll Number and Class: ");

        /*
         * Scanner automatically separates the entered input
         * into tokens using whitespace (space, tab, or newline)
         * as the default delimiter.
         *
         * Example Input:
         * VairagiCodes 10 A
         *
         * Tokens:
         * VairagiCodes
         * 10
         * A
         */

        // Read the first token as the student's name.
        String studentName = scanner.next();

        // Read the second token as an integer.
        int studentRollNumber = scanner.nextInt();

        // Read the third token as a String
        // and extract its first character.
        char studentClass = scanner.next().charAt(0);

        // Display the entered student details.
        System.out.println("\n----- Student Details -----");
        System.out.println("Student Name      : " + studentName);
        System.out.println("Student Roll No.  : " + studentRollNumber);
        System.out.println("Student Classroom : " + studentClass);

        // Close the Scanner to release system resources.
        scanner.close();

        /*
         * Scanner provides many useful methods to read
         * different types of input directly.
         *
         * next()          - Reads the next word.
         * nextLine()      - Reads an entire line.
         * nextInt()       - Reads an int.
         * nextFloat()     - Reads a float.
         * nextDouble()    - Reads a double.
         * nextLong()      - Reads a long.
         * nextShort()     - Reads a short.
         * nextByte()      - Reads a byte.
         * nextBoolean()   - Reads a boolean.
         *
         * By default, Scanner uses whitespace
         * (space, tab, or newline) as the delimiter
         * to separate the input into individual tokens.
         */
    }
}