public class sumNnumber {
    public static void main(String[] args) {
        int n = 15;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("The sum of first " + n + " natural numbers is: " + sum);
    }
    
}
