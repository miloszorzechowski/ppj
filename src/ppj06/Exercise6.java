package ppj06;

public class Exercise6 {
    public static void main(String[] args) {
        double[] arr = new double[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random() * 10;
        }

        System.out.print("Content: ");
        for (double v : arr)
            System.out.print(v + ", ");

        System.out.print("\nElements with an even indexes: ");
        for (int i = 0; i < arr.length; i = i + 2)
            System.out.print(arr[i] + ", ");

        System.out.print("\nElements that are odd when converted to int: ");
        for (double v : arr)
            System.out.print((int) v % 2 > 0 ? v + ", " : "");
    }
}