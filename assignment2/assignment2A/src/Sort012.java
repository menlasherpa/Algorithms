import java.util.Arrays;

public class Sort012 {
    public int[] sort(int[] arr) {
        int numZeroes = 0;
        int numOnes = 0;
        int numTwos = 0;
        for(int i = 0; i < arr.length;++i) {
            if(arr[i] == 0) ++numZeroes;
            if(arr[i] == 1) ++numOnes;
            if(arr[i] == 2) ++numTwos;
        }
        int[] retval = new int[arr.length];

        for(int j=0; j < numZeroes; ++j) {
            retval[j] = 0;
        }
        for(int j = 0; j< numOnes; ++j) {
            retval[j+numZeroes] = 1;
        }
        for(int j = 0; j< numTwos; ++j) {
            retval[j+numZeroes+numOnes] = 2;
        }
        return retval;
    }

    public static void main(String[] args) {
        int[] test = {2, 1, 0, 1, 0, 2, 1, 0};
        Sort012 s = new Sort012();
        int[] ret = s.sort(test);
        System.out.println(Arrays.toString(ret));
    }
}