public class BubbleSort {
    public static void bubSort(int arr[]){
        int n = arr.length;
        boolean swaped = false;
        for (int i = n-2; i >= 0; i--) {
            for (int j = 0; j < n-1; j++) {
                if (arr[j] > arr[j+1]) {
                    //swap
                    swaped = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                if (swaped == false) {
                    break;
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
        int arr[] = {9,8,4,7,6,4,5,6,7};
        print(arr);
        bubSort(arr);
        print(arr);
    }
}

//Time Complexity
//best case: O(n)
//worst case: O(n*n)
//avg case: O(n*n)