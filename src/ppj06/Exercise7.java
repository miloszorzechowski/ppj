package ppj06;

public class Exercise7 {
    public static void main(String[] args) {
        char[] arr = {'y', 'a', 'z'};
        int max_elem_idx = 0;

        for (int i = 1; i < arr.length; i++) {
            max_elem_idx = arr[max_elem_idx] < arr[i] ? i : max_elem_idx;
        }

        System.out.println(max_elem_idx);
    }
}