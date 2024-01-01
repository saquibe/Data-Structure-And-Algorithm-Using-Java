// package Arrays;

public class LinearSearch1 {
    public static int lineaSearch1(String fruits[], String key){
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i]==key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String fruits [] = {"mango","banana","strawberry","apple","orange"};
        String key = "apple";
        int index = lineaSearch1(fruits, key);
        if (index==-1) {
            System.out.println("Key not found");
        }else{
            System.out.println("Key at index : "+index);
        }
    }
}
