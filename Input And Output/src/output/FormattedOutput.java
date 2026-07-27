package output;

/*
 * Formatted output allows us to display data
 * in a specific format using format specifiers.
 *
 * Java provides two common ways to create
 * formatted output:
 *
 * 1. System.out.printf()
 * 2. String.format()
 */

public class FormattedOutput {

    public static void main(String[] args) {

        // Student details
        int rollNo = 10;
        String studentName = "VairagiCodes";
        char classRoom = 'A';

        /*
         * printf() prints formatted output directly
         * to the standard output device (monitor).
         *
         * Common format specifiers:
         * %d  -> int
         * %f  -> float/double
         * %c  -> char
         * %s  -> String
         * %b  -> boolean
         * %n  -> New line
         */

        System.out.printf(
                "Student Name      : %s%n" +
                        "Student Roll No.  : %d%n" +
                        "Student Classroom : %c%n",
                studentName, rollNo, classRoom
        );

        System.out.println();

        /*
         * String.format() creates and returns
         * a formatted String instead of printing it.
         *
         * We can store the formatted String
         * in a variable and use it later.
         */
        String formattedString = String.format(
                "Student Name      : %s%n" +
                        "Student Roll No.  : %d%n" +
                        "Student Classroom : %c%n",
                studentName, rollNo, classRoom
        );

        // Print the formatted String.
        System.out.println(formattedString);

        /*
         * Common format specifiers:
         *
         * %d  - int
         * %f  - float or double
         * %c  - char
         * %s  - String
         * %b  - boolean
         * %x  - Hexadecimal integer
         * %o  - Octal integer
         * %%  - Prints the '%' symbol
         * %n  - New line
         *
         * printf() prints the formatted output directly.
         * String.format() returns the formatted output
         * as a String.
         */
    }
}