public class prefixvspostfixincrementexample {

    public static void main(String[] args) {

        int x = 5;
        int y = 8;


        int sumPrefix = ++x + y;
        System.out.println("Using prefix increment (++x):");
        System.out.println("Sum: " + sumPrefix);
        System.out.println("Value of x after increment: " + x);
        System.out.println();


        x = 5;


        int sumPostfix = x++ + y;
        System.out.println("Using postfix increment (x++):");
        System.out.println("Sum: " + sumPostfix);
        System.out.println("Value of x after increment: " + x);
    }

}