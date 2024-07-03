public class prefixvspostfixincrementexample {

    public static void main(String[] args) {
        // Declare and assign values to variables x and y
        int x = 5;
        int y = 8;

        // Using prefix increment operator (++x)
        int sumPrefix = ++x + y;
        System.out.println("Using prefix increment (++x):");
        System.out.println("Sum: " + sumPrefix); // Output should be 14
        System.out.println("Value of x after increment: " + x); // x should be incremented to 6
        System.out.println(); // Blank line for clarity

        // Reset x to 5 for the next part
        x = 5;

        // Using postfix increment operator (x++)
        int sumPostfix = x++ + y;
        System.out.println("Using postfix increment (x++):");
        System.out.println("Sum: " + sumPostfix); // Output should be 13
        System.out.println("Value of x after increment: " + x); // x should be incremented to 6 after this statement
    }

}