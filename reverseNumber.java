public class reverseNumber {
    public static void main(String[] args) {
        int number = 12345;
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10; // Get the last digit
            reversed = reversed * 10 + digit; // Append the digit to reversed
            number /= 10; // Remove the last digit
        }

        System.out.println("The reversed number is: " + reversed);
    }
}
