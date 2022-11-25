package ppj07;

public class Exercise6 {
    public static void main(String[] args) {
        int[] arr1 = getRandomArray();
        int[] arr2 = getRandomArray();

        int[] concatenatedArr = concatenate(arr1, arr2);
        int commonElems = countCommonElements(arr1, arr2);
        int[] intersectedArr = intersect(arr1, arr2);
        int[] extremeValues = getExtremeValues(concatenatedArr);
        int[] rangeArray = getRangeArray(extremeValues[0], extremeValues[1]);

        System.out.println("arr1: " + convertToString(arr1));
        System.out.println("arr2: " + convertToString(arr2));
        System.out.println("concatenatedArr: " + convertToString(concatenatedArr));
        System.out.println("commonElements: " + commonElems);
        System.out.println("intersectedArr: " + convertToString(intersectedArr));
        System.out.println("minValue: " + extremeValues[0]);
        System.out.println("maxValue: " + extremeValues[1]);
        System.out.println("rangeArray: " + convertToString(rangeArray));
    }

    public static int[] getRandomArray() {
        int[] arr = new int[(int) (Math.random() * 10 + 1)];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10 + 1);
        }

        return arr;
    }

    public static int[] concatenate(int[] arr1, int[] arr2) {
        int max_length = arr1.length > arr2.length ? arr1.length : arr2.length;
        int[] concatenatedArr = new int[arr1.length + arr2.length];

        for (int i = 0, j = 0; i < max_length; i++) {
            if (i < arr1.length) {
                concatenatedArr[j++] = arr1[i];
            }

            if (i < arr2.length) {
                concatenatedArr[j++] = arr2[i];
            }
        }

        return concatenatedArr;
    }

    public static int countCommonElements(int[] arr1, int[] arr2) {
        int[] smallerArr;
        int[] largerArr;

        if (arr1.length < arr2.length) {
            smallerArr = arr1;
            largerArr = arr2;
        } else {
            smallerArr = arr2;
            largerArr = arr1;
        }

        int common_elements = 0;

        for (int j : smallerArr) {
            for (int k : largerArr) {
                if (j == k) {
                    common_elements++;
                    break;
                }
            }
        }

        return common_elements;
    }

    public static int[] intersect(int[] arr1, int[] arr2) {
        int[] smallerArr;
        int[] largerArr;

        if (arr1.length < arr2.length) {
            smallerArr = arr1;
            largerArr = arr2;
        } else {
            smallerArr = arr2;
            largerArr = arr1;
        }

        int[] intersectedArr = new int[countCommonElements(arr1, arr2)];

        for (int i = 0, added_elems = 0; i < smallerArr.length; i++) {
            for (int k : largerArr) {
                if (smallerArr[i] == k) {
                    intersectedArr[added_elems] = smallerArr[i];
                    added_elems++;
                    break;
                }
            }
        }

        return intersectedArr;
    }

    public static int[] getExtremeValues(int[] arr) {
        int[] extremeValues = {arr[0], arr[0]};

        for (int j : arr) {
            extremeValues[0] = j < extremeValues[0] ? j : extremeValues[0];
            extremeValues[1] = j > extremeValues[1] ? j : extremeValues[1];
        }

        return extremeValues;
    }

    public static int[] getRangeArray(int start, int stop) {
        int[] arr = new int[stop - start];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = start++;
        }

        return arr;
    }

    public static String convertToString(int[] arr) {
        if (arr.length == 0) {
            return "[]";
        }

        String result = "[";

        for (int i = 0; i < arr.length - 1; i++) {
            result += arr[i] + ", ";
        }

        return result + arr[arr.length - 1] + "]";
    }
}