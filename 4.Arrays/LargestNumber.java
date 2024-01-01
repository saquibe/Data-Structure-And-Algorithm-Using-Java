// package Arrays;

public class LargestNumber {
    public static int getLargest(int number[]){
        int largest = Integer.MIN_VALUE; // minus infinitive minimum value
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < number.length; i++) {
            if (largest<number[i]) {
                largest = number[i];
            }
            if (smallest>number[i]) {
                smallest = number[i];
            }
        }
        System.out.println("Smallest number is : "+smallest);
        return largest;
    }
    public static void main(String[] args) {
        int number [] = {10,20,30,40,50};
        System.out.println("Largest number is : "+getLargest(number));
    }
}
