//for a given string print largest string in lexicographical order

public class LargestString {
    public static void main(String[] args) {
        String fruits[] = {"mango","banana","orange","guava"};
        String largest = fruits[0];
        for (int i = 0; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i])<0) {
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
