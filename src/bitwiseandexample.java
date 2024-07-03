public class bitwiseandexample {

    public static void main(String[] args) {
        // Declare and assign values to variables x and y
        int x = 7;
        int y = 17;

        // Predicted result of bitwise AND operation: Decimal value = 1, Binary string = "0001"
        // Explanation: Bitwise AND compares corresponding bits of x and y. 7 in binary is 0111, and 17 is 0001 0001.
        // The result of ANDing these is 0001, which is 1 in decimal.

        // Perform bitwise AND operation and assign the result to z
        int z = x & y;

        // Print the results
        System.out.println("Result of bitwise AND operation (x & y):");
        System.out.println("Decimal: " + z);
        System.out.println("Binary : " + Integer.toBinaryString(z));
    }

}