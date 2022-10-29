import java.util.HashSet;
import java.util.Set;

public class Problem1 {

    public static boolean sumFound(int[] arr, int z) {
        if(arr==null || arr.length < 2) {
            return false;
        }
        //implement

        Set<Integer> hashSet = new HashSet<Integer>();
            for(int n : arr) {
                hashSet.add(n);
            }

            for (int val : hashSet) {
                int diff = z - val;
                if (hashSet.contains(diff) && diff != val)
                    return true;
            }
        return false;

        // time complexity is O(n)
    }

}
