import java.util.ArrayList;
import java.util.LinkedList;

public class Problem4 {

    // Sorting arraylist
    public static void sort(ArrayList<Integer> list){

        //implement
        for (int i = 0; i < list.size(); i++) {
            for (int j = list.size() - 1; i > 0; i--) {
                if (list.get(i) > list.get(j)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }

        for (int n : list) {
            System.out.println(n);
        }
    }


    // Sorting linked-list
    public static void sort(LinkedList<Integer> list){

        //implement
        for (int i = 0; i < list.size(); i++) {
            for (int j = list.size() - 1; j > 0; j--) {
                if (list.get(i) > list.get(j)) {
                    int temp = list.get(i);
                    list.set(i, list.get(i));
                    list.set(j, temp);
                }
            }
        }

    }

}
