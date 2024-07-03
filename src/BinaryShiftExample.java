public class BinaryShiftExample {

    public static void main(String[] args) {

        int x = 9;
        System.out.println("Initial value for x = 9:");
        printDecimalAndBinary(x);


        x = x << 1;

        System.out.println("\nAfter left shift by 1:");
        printDecimalAndBinary(x);

        x = 17;
        System.out.println("\nInitial value for x = 17:");
        printDecimalAndBinary(x);


        x = x << 1;
        System.out.println("\nAfter left shift by 1:");
        printDecimalAndBinary(x);


        x = 88;
        System.out.println("\nInitial value for x = 88:");
        printDecimalAndBinary(x);


        x = x << 1;

        System.out.println("\nAfter left shift by 1:");
        printDecimalAndBinary(x);
    }


    public static void printDecimalAndBinary(int num) {
        System.out.println("Decimal: " + num);
        System.out.println("Binary : " + Integer.toBinaryString(num));
    }

}