import java.util.Arrays;

public class Problem3CMergeSortedArrays {

    public static void main(String[] args) {
        int[] a = {1, 4, 5, 8, 17};
        int[] b = {2, 4, 8, 11, 13, 21, 23, 25};
        System.out.println(Arrays.toString(merge(b,a)));
    }

    static int[] merge(int[] arr1, int[] arr2) {
        int a = arr1.length;
        int b = arr2.length;
        int n = a + b;
        int i = 0;
        int j = 0;
        int k = 0;

        // creating a new array to put the merged elements
        int[] arr3 = new int[n];

        // putting smaller elements from (either arr1 or arr2) to arr3
        while (i < a && j < b) {
            if (arr1[i] < arr2[j]) {
                arr3[k] = arr1[i];
                i++;
            } else {
                arr3[k] = arr2[j];
                j++;
            }
            k++;
        }

        // putting remaining elements of arr1 into arr3
        while (i < a) {
            arr3[k] = arr1[i];
            i++;
            k++;
        }

        // putting remaining elements of arr2 into arr3
        while (j < b) {
            arr3[k] = arr2[j];
            j++;
            k++;
        }

        return arr3;
    }

}
