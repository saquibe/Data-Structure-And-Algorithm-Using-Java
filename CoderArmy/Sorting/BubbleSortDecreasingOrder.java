public class BubbleSortDecreasingOrder{
    public static void bubSortDec(int arr[]){
        int n = arr.length;
        for (int i = n-2; i >= 0; i--) {
            for (int j = 0; j < n-1; j++) {
                if (arr[j+1] > arr[j]) {
                    //swap
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void print(int arr[]){
        for (int x : arr) {
            System.out.print(x+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {7,9,8,3,5,4,1,2};
        print(arr);
        bubSortDec(arr);
        print(arr);
    }
}