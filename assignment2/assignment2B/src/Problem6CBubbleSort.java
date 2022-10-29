import java.util.Arrays;

public class Problem6CBubbleSort {

    public static void main(String[] args) {
        int[] array = {3,5,2,6,4,7};
        System.out.println(Arrays.toString(sort(array)));
    }

    public static int[] sort(int array[]) {
        boolean swappedOnPrevRun = true;

        while (swappedOnPrevRun) { //this forces exit when sorting is complete
            swappedOnPrevRun = false;

            for(int i = 0; i < array.length - 1; i++) {
                if(array[i] > array[i + 1]) {
                    swappedOnPrevRun = true;
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }

        }
        return array;

    }

}
