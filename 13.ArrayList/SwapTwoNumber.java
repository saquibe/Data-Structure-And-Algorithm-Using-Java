import java.util.ArrayList;

public class SwapTwoNumber {
    public static void swap(ArrayList<Integer> list, int indx1, int indx2){
        int temp = list.get(indx1);
        list.set(indx1, list.get(indx2));
        list.set(indx2, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(3);
        list.add(8);
        list.add(6);
        list.add(5);

        System.out.println("Befor swapping : "+list);
        int indx1 = 1;
        int indx2 = 3;
        swap(list, indx1, indx2);
        System.out.println("After swapping"+list);
    }
}
