public class LeftRotateArray {
    public static void leftRotate(int arr[]){
        for (int x : arr) {
            System.out.print(x+" ");
        }
        System.out.println();
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
        for (int x : arr) {
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,7,9,8,1,2};
        leftRotate(arr);
    }
}
