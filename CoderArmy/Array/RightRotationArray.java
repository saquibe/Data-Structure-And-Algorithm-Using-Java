public class RightRotationArray {
    public static void rotateArray(int arr[]){
        int temp = arr[arr.length-1];
        for (int i = arr.length-2; i >= 0; i--) {
            arr[i+1] = arr[i];
        }
        arr[0] = temp;
    }
    public static void printArr(int arr[]){
        for (int x : arr) {
            System.out.print(x+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {4,6,7,9,3,5};
        printArr(arr);
        rotateArray(arr);
        printArr(arr);
    }
}
