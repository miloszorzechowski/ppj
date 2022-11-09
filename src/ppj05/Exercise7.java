public class Exercise7 {
    public static void main(String[] args) {
        char[] arr = {'y', 'a', 'z'};
        int max_element_index = 0;

        for (int i = 1; i < arr.length; i++) {
            max_element_index = arr[max_element_index] < arr[i] ? i : max_element_index;
        }

        System.out.println(max_element_index);
    }
}