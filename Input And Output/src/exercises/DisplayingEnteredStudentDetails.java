package exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * This program accepts a student's details such as
 * roll number, classroom, and name from the
 * standard input device (keyboard)
 * using InputStreamReader and BufferedReader.
 */

public class DisplayingEnteredStudentDetails {

    public static void main(String[] args) throws IOException {

        // System.in is an InputStream object connected to the keyboard.
        // InputStreamReader converts the input bytes into characters.
        // BufferedReader buffers the characters and provides the readLine() method.
        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));

        // Ask the user to enter the student's roll number.
        System.out.print("Enter a student roll number: ");

        // readLine() returns the input as a String.
        // Integer.parseInt() converts the String into an int.
        int studentRollNo = Integer.parseInt(bufferedReader.readLine());

        // Ask the user to enter the student's classroom.
        System.out.print("Enter a student class (A, B, C, D): ");

        /*
         * We use readLine().charAt(0) instead of read()
         * because read() reads only one character and leaves
         * the newline character (\n) in the input buffer.
         *
         * readLine() reads the entire line entered by the user,
         * and charAt(0) extracts the first character from that line.
         */
        char classRoomName = bufferedReader.readLine().charAt(0);

        // Ask the user to enter the student's name.
        System.out.print("Enter a student name: ");

        // readLine() reads the complete line entered by the user.
        String studentName = bufferedReader.readLine();

        // Display the entered student details.
        System.out.println("\n----- Student Details -----");
        System.out.println("Roll Number      : " + studentRollNo);
        System.out.println("Student Name     : " + studentName);
        System.out.println("Classroom        : " + classRoomName);

    }
}