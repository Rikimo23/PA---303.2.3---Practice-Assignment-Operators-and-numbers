public class RightShiftExample {

    public static void main(String[] args) {

        int x = 225;
        System.out.println("Initial value for x = 225:");
        printDecimalAndBinary(x);


        x = x >> 2;
        System.out.println("\nAfter right shift by 2:");
        printDecimalAndBinary(x);


        x = 1555;
        System.out.println("\nInitial value for x = 1555:");
        printDecimalAndBinary(x);


        x = x >> 2;

        System.out.println("\nAfter right shift by 2:");
        printDecimalAndBinary(x);


        x = 32456;
        System.out.println("\nInitial value for x = 32456:");
        printDecimalAndBinary(x);


        x = x >> 2;

        System.out.println("\nAfter right shift by 2:");
        printDecimalAndBinary(x);
    }


    public static void printDecimalAndBinary(int num) {
        System.out.println("Decimal: " + num);
        System.out.println("Binary : " + Integer.toBinaryString(num));
    }

}
