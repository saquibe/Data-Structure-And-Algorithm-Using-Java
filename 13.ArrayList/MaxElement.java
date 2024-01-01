//Find max element in ArrayList

import java.util.ArrayList;

public class MaxElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(1);
        list.add(5);
        list.add(9);
        list.add(8);
        list.add(10);

        int maxVal = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            // if (maxVal < list.get(i)) {
            //     maxVal = list.get(i);
            // }

            maxVal = Math.max(maxVal, list.get(i));
        }
        System.out.println("Max element : "+maxVal);
    }
}
