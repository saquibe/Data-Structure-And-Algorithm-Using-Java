// package Arrays;

public class LinearSearch {
    public static int linearSearch(int number[], int key){
        for (int i = 0; i < number.length; i++) {
            if (number[i]==key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        //find 80 in this array through linear search
        int number [] = {10,39,48,89,83,23,42,44,50,60,80}; 
        int key = 50;
        int index = linearSearch(number, key);
        if (index==-1) {
            System.out.println("Key not found");
        }else{
            System.out.println("Key is at index "+index);
        }   
    }
}
