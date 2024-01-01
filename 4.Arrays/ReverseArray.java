// import java.util.*;
public class ReverseArray {
    public static void reverse(int number[]){
        int first = 0, last = number.length-1;
        while (first<last) {
            int temp = number[last];
            number[last] = number[first];
            number[first] = temp;

            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int number[] = {1,3,5,7,9,12,16};
        reverse(number);
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]+" ");
        }
    }
}
