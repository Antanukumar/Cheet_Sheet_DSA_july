public class armstrong {
    public static void main(String[] args) {
        int number = 153; // Example number
        int originalNumber = number;
        int sum = 0;

        while (number != 0) {
            int digit = number % 10; // Get the last digit
            sum += digit * digit * digit; // Add the cube of the digit to sum
            number /= 10; // Remove the last digit
        }

        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}
