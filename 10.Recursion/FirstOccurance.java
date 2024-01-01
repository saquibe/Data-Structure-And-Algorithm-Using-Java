//write a recursive function that gives first occurance of a number
public class FirstOccurance {
    public static int firstOccurance(int arr[], int key, int i){
        if (i==arr.length) { //base case
            return -1;
        }
        if (arr[i]==key) {
            return i;
        }
        return firstOccurance(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {4,3,2,5,7,8,4,6,8,3,4};
        System.out.println(firstOccurance(arr, 5, 0));
    }
}

//time complexity--> O(n)
//space complexity--> O(n)
