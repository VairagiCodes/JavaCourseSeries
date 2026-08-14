import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
This program calculates sum
of two numbers entered by user
 */

public class MultiLineComments {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter number A: ");
        int a = Integer.parseInt(reader.readLine());
        System.out.println("Enter number B: ");

        int b = Integer.parseInt(reader.readLine());
        System.out.println("A + B = " + (a + b));
    }

}
