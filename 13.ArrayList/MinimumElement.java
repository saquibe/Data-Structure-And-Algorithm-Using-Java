//Find min value in ArrayList

import java.util.ArrayList;

public class MinimumElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(4);
        list.add(18);
        list.add(3);
        list.add(10);
        
        int minVal = Integer.MAX_VALUE;
        for(int i = 0; i < list.size(); i++){
            minVal = Math.min(minVal, list.get(i));
        }
        System.out.println(minVal);
    }
}
