import java.util.Scanner;

//Check if the number is odd or even
public class BitManipulationPracticeProgramFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check even or odd: ");
        int number = scanner.nextInt();
            if((number & 1)==0) {
                System.out.println("The given number is even");
            }
            else {
                System.out.println("The number is odd");
            }

    }
}
