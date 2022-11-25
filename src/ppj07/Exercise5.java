package ppj07;

import java.util.Arrays;

public class Exercise5 {
    public static void main(String[] args) {
        // Generates a random array size between 10 and 15
        byte arr_size = (byte) (Math.random() * (16 - 10) + 10);

        // Creates an array with a size between 10 and 15
        int[] arr = new int[arr_size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        // Creates copy of an arr and shuffles it
        int[] shuffledArr = new int[arr.length];
        copyArray(arr, shuffledArr);
        shuffleArray(shuffledArr);

        int minValue = 0;

        for (int j : shuffledArr) {
            System.out.print(j + " ");
            minValue = j < minValue ? j : minValue;
        }
        System.out.println();

        for (int i = 0; i < arr_size; i++) {
            for (int j = 0; j < arr_size; j++) {
                if (shuffledArr[j] < 10) {
                    System.out.print(shuffledArr[j] == i ? "* " : ". ");
                }
                else {
                    System.out.print(shuffledArr[j] == i ? " * " : " . ");
                }
            }
            System.out.println();
        }

        System.out.println("\n" + "        arr: " + Arrays.toString(arr));
        System.out.println("shuffledArr: " + Arrays.toString(shuffledArr));
    }

    public static void copyArray(int[] src, int[] dest) {
        for (int i = 0; i < src.length; i++) {
            dest[i] = src[i];
        }
    }

    public static void shuffleArray(int[] arr) {
        byte indexToSwap;
        int temp;

        for (int i = 0; i < arr.length; i++) {
            indexToSwap = (byte) (Math.random() * arr.length);
            temp = arr[indexToSwap];
            arr[indexToSwap] = arr[i];
            arr[i] = temp;
        }
    }
}