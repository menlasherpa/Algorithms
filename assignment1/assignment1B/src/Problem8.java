public class Problem8 {

    public static void main(String[] args) {
        System.out.print(smallestCommon(9, 12));
    }

    public static int smallestCommon(int x, int y) {

        //implement
//        int lcm = 0;
//        if (x % y == 0) {
//            return x;
//        } else if (y % x == 0) {
//            return y;
//        } else {
//            for (int i = 1; i <= x * y; i++ ) {
//                if (i % x == 0 && i % y == 0) {
//                     lcm = i;
//                }
//            }
//        }
//        return lcm;

        //***** checking by max number: 7 and 14, 14 > 7, 14 * 1 = 14 and 14 % 7 == 0, so 14 is lcm ****
//        int lcm = 1;
//        int max = x;
//        int notMax = y;
//        if (y > max) {
//            max = y;
//            notMax = x;
//        }
//        for (int i = 1; i < x * y; i++) {
//            int prod = max * i;
//            if (prod % notMax == 0)
//                lcm = prod;
//        }

        // using euclidean algorithm (x * y == gcd * lcm)
        int prod = x * y;
        int lcm = prod / gcd(x,y);
        return lcm;
    }

    public static int gcd(int x, int y) {
        int result = 1;
        for (int i = 2; i <= x && i <= y; i++) {
            if (x % i == 0 && y % i == 0)
                result = i;
        }
        return result;
    }

}
