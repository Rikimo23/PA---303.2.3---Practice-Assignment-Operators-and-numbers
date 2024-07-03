public class incrementexample {

    public static void main(String[] args) {

        int count = 0;


        System.out.println("Initial value (using ++): " + count);
        count++;
        System.out.println("Value after increment (using ++): " + count);
        count++;
        System.out.println("Value after another increment (using ++): " + count);
        System.out.println();


        count = 0;
        System.out.println("Initial value (using +=): " + count);
        count += 1;
        System.out.println("Value after increment (using +=): " + count);
        count += 1;
        System.out.println("Value after another increment (using +=): " + count);
        System.out.println();


        count = 0;
        System.out.println("Initial value (using +): " + count);
        count = count + 1;
        System.out.println("Value after increment (using +): " + count);
        count = count + 1;
        System.out.println("Value after another increment (using +): " + count);
    }

}