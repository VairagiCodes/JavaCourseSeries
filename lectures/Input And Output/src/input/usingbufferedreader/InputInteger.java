package input.usingbufferedreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * This program accepts an integer from the
 * standard input device (keyboard)
 * using InputStreamReader and BufferedReader.
 *
 * Since BufferedReader reads input as a String,
 * we use Integer.parseInt() to convert the String
 * into an int.
 */

public class InputInteger {

    public static void main(String[] args) throws IOException {

        // System.in is an InputStream object connected to the keyboard.
        // InputStreamReader converts the input bytes into characters.
        // BufferedReader buffers the characters and provides the readLine() method.
        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));

        // Display a message asking the user to enter a number.
        System.out.print("Enter a number: ");

        /*
         * readLine() reads the entire line entered by the user and returns it as a String.
         * Integer.parseInt() converts the String into an int.
         * BufferedReader always reads input as a String.
         * Integer.parseInt() converts that String into an int.
         */
        int number = Integer.parseInt(bufferedReader.readLine());

        /*
         * Similarly, we can convert the input String into other data types
         * using their corresponding wrapper class methods:
         *
         * float decimalNumber = Float.parseFloat(bufferedReader.readLine());
         * double largeDecimal = Double.parseDouble(bufferedReader.readLine());
         * long largeNumber = Long.parseLong(bufferedReader.readLine());
         * short smallNumber = Short.parseShort(bufferedReader.readLine());
         * byte smallByte = Byte.parseByte(bufferedReader.readLine());
         * boolean isValid = Boolean.parseBoolean(bufferedReader.readLine());
         *
         * Each parseXXX() method converts the String returned by readLine()
         * into the required primitive data type.
         */

        // Display the entered number.
        System.out.println("Entered number: " + number);
    }
}