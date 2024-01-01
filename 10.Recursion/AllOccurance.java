//for a given integer array of size N. You have to find all the occurance of a given element (key)
//and print them use a recursive function to solve this problem 
public class AllOccurance{
    public static void allOccurance(int arr[], int key, int i){
        if (i==arr.length) { //base case
            return;
        }
        if (arr[i]==key) {
            System.out.println(i+" ");
        }
        allOccurance(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {3,5,2,4,6,4,3,6,7,7,5,4,3,2,4,4,6,7,8,7,5,4,3};
        int key = 4;
        allOccurance(arr, key, 0);
        System.out.println();
    }
}