//CONTAINER WITH MOST WATER
//For given n lines on x-axis use two line to form a container such that it holds maximum water
//BRUTE FORECE APROACH

import java.util.ArrayList;

public class ContainerWithMostWater {
    public static int containerWithMostWater(ArrayList<Integer> height){
        int maxWater = 0;
        for (int i = 0; i < height.size(); i++) {
            for (int j = i+1; j < height.size(); j++) {
                int ht = Math.min(height.get(i), height.get(j));
                int width = j-i;
                int currWater = (ht * width);
                maxWater = Math.max(maxWater, currWater);
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        System.out.println("Container with most water : "+containerWithMostWater(list));
    }
}
