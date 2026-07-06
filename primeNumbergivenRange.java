public class primeNumbergivenRange {
    public static void main(String[] args) {
        int lowerBound = 10;
        int upperBound = 50;

        System.out.println("Prime numbers between " + lowerBound + " and " + upperBound + " are:");

        for (int num = lowerBound; num <= upperBound; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
