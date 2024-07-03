public class bitwiseandexample {

    public static void main(String[] args) {

        int x = 7;
        int y = 17;


        int z = x & y;

        
        System.out.println("Result of bitwise AND operation (x & y):");
        System.out.println("Decimal: " + z);
        System.out.println("Binary : " + Integer.toBinaryString(z));
    }

}