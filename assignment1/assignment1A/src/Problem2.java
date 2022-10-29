public class Problem2 {

    public static int secondSmallest(int[] arr) {
        if(arr==null || arr.length < 2) {
            throw new IllegalArgumentException("Input array too small");
        }
        //implement

        // searching for the smallest value
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int n : arr) {
            if (n < min) {
                min = n;
            }
        }

        // searching for the second-smallest value
        for (int n : arr) {
            if (n <= min) {
                secondMin = n;
            }
        }
        return secondMin;

        // Time complexity is O(n)
    }
}
