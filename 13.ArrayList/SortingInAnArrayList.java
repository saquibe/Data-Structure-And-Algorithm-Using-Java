import java.util.ArrayList;
import java.util.Collections;

public class SortingInAnArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(4);
        list.add(1);
        list.add(9);
        list.add(5);
        list.add(3);
        list.add(7);
        list.add(6);

        System.out.println("Befor sorting"+list);
        //sorting in ascending order
        Collections.sort(list);
        System.out.println("Acending order"+list);
        //sorting in decending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Decending order"+list);
    }
}
