package usingbufferedreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Input means data provided to a program.
 * Output means the result displayed by the program.
 *
 * This program accepts a single character
 * from the standard input device (keyboard)
 * using InputStreamReader and BufferedReader.
 */

public class InputSingleCharacter {
    public static void main(String[] args) throws IOException {

        // Here System.in represents InputStream Object
        // By Default the standard input device keyboard
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);

        // Connecting InputStreamReader to BufferedReader
        // So we can use read() and readline() methods.
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.print("Enter a character: ");

        // read() returns the Unicode value (an int) of the character.
        // Type casting converts that value into a char.
        char singleChar = (char) bufferedReader.read();

        // And finally print the entered character
        // This is output concept printing the final output using the method on out object
        System.out.println("Entered Character: " + singleChar);

    }
}
