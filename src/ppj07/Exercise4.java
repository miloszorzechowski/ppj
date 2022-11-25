package ppj07;

public class Exercise4 {
    public static void main(String[] args) {
        int[] arr = {153, 333, 370, 515, 407, 80};

        for (int i = 0, num=arr[i], digit_count=0; i < arr.length; i++) {
            while (num > 0) {
                digit_count++;
                num /= 10;
            }

            int sum = 0;
            num = arr[i];

            while (num > 0) {
                sum += Math.pow(num % 10, digit_count);
                num /= 10;
            }

            System.out.printf("%d %s narcissistic number%n", arr[i], sum == arr[i] ? "is" : "is not");
        }
    }
}