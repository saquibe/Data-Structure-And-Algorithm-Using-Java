//write a function which returns last occurance index (i denoted index of array)
public class LastOccurance {
    public static int lastOccurance(int arr[], int key, int i){
        if (i==arr.length) {
            return -1;
        }
        int isFound = lastOccurance(arr, key, i+1);
        if (isFound == -1 && arr[i]==key) {
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[] = {3,6,4,7,9,5,6,3,2,4,6,7,8,3,2,5};
        System.out.println(lastOccurance(arr, 6, 0));
    }
}
