public class sumGivenRange {
    public static void main(String[] args) {
        int start = 5;
        int end = 15;
        int sum = 0;

        for (int i = start; i <= end; i++) {
            sum += i;
        }

        System.out.println("The sum of numbers from " + start + " to " + end + " is: " + sum);
    }
    
}
