package input.usingbufferedreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * This program accepts a string (username)
 * from the standard input device (keyboard)
 * using InputStreamReader and BufferedReader.
 */

public class InputString {

    public static void main(String[] args) throws IOException {

        // System.in is an InputStream object connected to the keyboard.
        // InputStreamReader converts the input bytes into characters.
        // BufferedReader buffers the characters and provides the readLine() method.
        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));

        /*
         * We can also create the BufferedReader object by first creating
         * an InputStreamReader object separately, but combining them into
         * a single statement makes the code shorter and is commonly used.
         */

        // Display a message asking the user to enter a username.
        System.out.print("Enter Username: ");

        // readLine() reads the entire line entered by the user
        // until the Enter key is pressed and returns it as a String.
        String userName = bufferedReader.readLine();

        // Display the username entered by the user.
        System.out.println("Username: " + userName);
    }
}