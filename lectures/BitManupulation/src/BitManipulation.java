import java.util.Scanner;

public class BitManipulation {
    static int getBit(int number, int position) {
        int bitMask = 1 << position;
        number = number & bitMask;
        if (number == 0) {
            System.out.println("The bit is 0");
        } else {
            System.out.println("The bit is 1");
        }
        return number;
    }

    static int setBit(int number, int position) {
        int bitMask = 1 << position;
        number |= bitMask;
        return number;
    }

    static int clearBit(int number, int position) {
        int bitMask = 1 << position;
        number &= (~bitMask);
        return number;
    }

    static int updateBit(int number, int position) {
        if (getBit(number, position) == 0) {
            number = setBit(number, position);
        } else {
            number = clearBit(number, position);
        }

        return number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operationNumber;
        int number, position;
        do {
            System.out.println("Enter 1 to Get bit " +
                    "\nEnter 2 to Set bit " +
                    "\nEnter 3 to Clear bit " +
                    "\nEnter 4 to Update bit " +
                    "\nEnter 0 to Exit");
            operationNumber = scanner.nextInt();
            if (operationNumber == 1) {
                System.out.println("Enter a number and position to get the bit: ");
                number = scanner.nextInt();
                position = scanner.nextInt();
                getBit(number, position);
            } else if (operationNumber == 2) {
                System.out.println("Enter a number and position to set the bit: ");
                number = scanner.nextInt();
                position = scanner.nextInt();
                System.out.println("After setting the bit of number " + number);
                number = setBit(number, position);
                System.out.println("The number became : " + number);
            } else if (operationNumber == 3) {
                System.out.println("Enter a number and position to clear the bit: ");
                number = scanner.nextInt();
                position = scanner.nextInt();
                System.out.println("After clearing the bit of number " + number);
                number = clearBit(number, position);
                System.out.println("The number became : " + number);
            } else if (operationNumber == 4) {
                System.out.println("Enter a number and position to update the bit: ");
                number = scanner.nextInt();
                position = scanner.nextInt();
                System.out.println("After updating the bit of number " + number);
                number = updateBit(number, position);
                System.out.println("The number became : " + number);
            }

        } while (operationNumber != 0);


    }
}
