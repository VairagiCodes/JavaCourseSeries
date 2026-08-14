package input.usinginputstreamreader;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputSingleCharacter {
    public static void main(String[] args) throws IOException {

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);

        System.out.print("Enter a single character: ");
        char ch = (char) inputStreamReader.read();

        System.out.println("Entered character: " + ch);

    }
}
