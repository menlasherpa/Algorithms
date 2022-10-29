import java.util.Arrays;

public class Problem4C {

    public static void main(String[] args) {
        int[] sample = {2,3,6,4,5,7};
        int[] sorted = new int[sample.length];
        sorted = recursiveSort(sample);
        System.out.println(sorted);
    }

    public static int[] recursiveSort(int[] arr) {
        int right = arr.length;
        int mid = arr.length / 2;

        if (arr.length > 1) {
            int[] arr1 = recursiveSort(partition(arr, 0, mid));
            int[] arr2 = recursiveSort(partition(arr, mid, right));
            merge(arr1, arr2);
        }

        return arr;
    }

    public static int[] partition(int[] arr, int left, int right) {
        int size = right - left;
        int[] newArray = new int[size];

        for (int i = 0; i < size && left <= right; i++, left++)
            newArray[i] = arr[left];

        return arr;
    }


    public static int[] merge(int[] arr1, int[] arr2) {
        int x = arr1.length;
        int y = arr2.length;
        int[] newArray = new int[x+y];

        int i = 0, j = 0, k = 0;

        while (i < x && j < y) {
            if (arr1[i] < arr2[j]) {
                newArray[k] = arr1[i];
                i++;
            }
            else {
                newArray[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < x) {
            newArray[k] = arr1[i];
            i++;
            k++;
        }

        while (j < y) {
            newArray[k++] = arr2[j++];
            j++;
            k++;
        }

        return newArray;
    }

}
