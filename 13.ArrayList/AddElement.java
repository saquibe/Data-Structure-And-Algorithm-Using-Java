import java.util.ArrayList;

public class AddElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        list.add(2,9);
        System.out.println(list);

        //Get operation
        int getElement = list.get(2);
        System.out.println(getElement);

        //Remove Operation or delete

        // int removeElement = list.remove(3);
        // System.out.println(removeElement);
        list.remove(2);
        System.out.println(list);

        //Set Elemenmt At Index
        list.set(2, 7);
        System.out.println(list);

        //Contains Element
        System.out.println(list.contains(2));
        System.out.println(list.contains(9));

        //Size of ArrayList
        System.out.println(list.size());

        //print the arraylist
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
    }
}
