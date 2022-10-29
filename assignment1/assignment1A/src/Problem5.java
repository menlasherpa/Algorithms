public class Problem5 {

    public static boolean find(int[] arr, int z) {

        //implement
        for (int n : arr) {
            if (z == n)
                return true;
        }
        return false;

        // Time complexity is O(n)
    }



    // if the array is sorted, we use binary search
    // time complexity is O(log n)
    // using binary search, we don't have to check every elements which reduces the run time
    public static boolean findWithBinary(int[] arr, int z) {

        //implement
        int left = arr[0];
        int right = arr.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == z)
                return true;
            else if (arr[mid] < z)
                right = mid;
            else
                left = mid + 1;
        }
        return false;
    }

}
