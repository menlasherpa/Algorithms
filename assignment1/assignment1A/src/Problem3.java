import lab1.powerset.PowerSet;

import java.util.List;
import java.util.Set;

public class Problem3 {

    public static boolean sumFound(List list, int k) {

        //implement
        List<Set<Integer>> powerSet = PowerSet.powerSet(list);
        for (Set<Integer> set : powerSet) {
            int sum = 0;
            for (int n : set)
                sum += n;
            if (sum == k)
                return true;
        }

        return false;
    }

}
