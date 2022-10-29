import java.util.Arrays;
import java.util.Random;

public class Problem3 {

    public static void main(String[] args) {
        int[] arr = {2,5,4,6,7,9};
        System.out.println(Arrays.toString(randomRearrange(arr)));
    }

    public static int[] randomRearrange(int[] arr) {
        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
            int j = r.nextInt(i+1);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        return arr;
    }
}
