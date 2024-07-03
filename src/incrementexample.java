public class incrementexample {

    public static void main(String[] args) {
        // Initialize a variable
        int count = 0;

        // Method 1: Using the increment operator ++
        System.out.println("Initial value (using ++): " + count);
        count++;  // Increment using ++
        System.out.println("Value after increment (using ++): " + count);
        count++;  // Increment using ++
        System.out.println("Value after another increment (using ++): " + count);
        System.out.println(); // Blank line for clarity

        // Method 2: Using the compound assignment operator +=
        count = 0; // Reset count
        System.out.println("Initial value (using +=): " + count);
        count += 1;  // Increment using +=
        System.out.println("Value after increment (using +=): " + count);
        count += 1;  // Increment using +=
        System.out.println("Value after another increment (using +=): " + count);
        System.out.println(); // Blank line for clarity

        // Method 3: Using the traditional addition operator +
        count = 0; // Reset count
        System.out.println("Initial value (using +): " + count);
        count = count + 1;  // Increment using +
        System.out.println("Value after increment (using +): " + count);
        count = count + 1;  // Increment using +
        System.out.println("Value after another increment (using +): " + count);
    }

}