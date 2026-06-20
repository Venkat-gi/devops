public class Primary_number {
    public static void main(String[] args) {
        int number = 17; // The number you want to check
        boolean isPrime = true;

        // Numbers less than or equal to 1 are not prime
        if (number <= 1) {
            isPrime = false;
        } else {
            // Check if any number from 2 up to (number - 1) divides it evenly
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false; // Found a factor, so it is not prime
                    break;           // Exit the loop early to save time
                }
            }
        }

        // Print the final result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is NOT a prime number.");
        }
    }
}
