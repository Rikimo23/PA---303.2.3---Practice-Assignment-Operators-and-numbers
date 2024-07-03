public class RightShiftExample {

    public static void main(String[] args) {
        // Exercise with value 225
        int x = 225;
        System.out.println("Initial value for x = 225:");
        printDecimalAndBinary(x);

        // Right shift by 2
        x = x >> 2; // Shift right by 2
        // Predicted: Decimal value = 56, Binary string = "111000"
        System.out.println("\nAfter right shift by 2:");
        printDecimalAndBinary(x);

        // Exercise with value 1555
        x = 1555;
        System.out.println("\nInitial value for x = 1555:");
        printDecimalAndBinary(x);

        // Right shift by 2
        x = x >> 2; // Shift right by 2
        // Predicted: Decimal value = 388, Binary string = "110000100"
        System.out.println("\nAfter right shift by 2:");
        printDecimalAndBinary(x);

        // Exercise with value 32456
        x = 32456;
        System.out.println("\nInitial value for x = 32456:");
        printDecimalAndBinary(x);

        // Right shift by 2
        x = x >> 2; // Shift right by 2
        // Predicted: Decimal value = 8114, Binary string = "111111010010"
        System.out.println("\nAfter right shift by 2:");
        printDecimalAndBinary(x);
    }

    // Method to print decimal value and binary string of a number
    public static void printDecimalAndBinary(int num) {
        System.out.println("Decimal: " + num);
        System.out.println("Binary : " + Integer.toBinaryString(num));
    }

}
