public class SumofdigitNumber {
    public static void main(String[] args) {
        int number = 12345;
        int sum = 0;

        while (number != 0) {
            sum += number % 10; // Add the last digit to sum
            number /= 10; // Remove the last digit
        }

        System.out.println("The sum of digits is: " + sum);
    }
}
