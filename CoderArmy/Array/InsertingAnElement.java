public class InsertingAnElement {
    public static void insertElement(int arr[]){
        for (int x : arr) {
            System.out.print(x+" ");
        }
        System.out.println();

        int n = 7;
        int k = 20; //to be insert
        int indx = 2;
        for (int i = n; i > indx; i--) {
            arr[i] = arr[i-1];
            arr[indx] = k;
        }
        for (int x : arr) {
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args) {
        int A[] = new int[10];
        A[0] = 2;
        A[1] = 4;
        A[2] = 7;
        A[3] = 8;
        A[4] = 9;
        A[5] = 3;
        A[6] = 1;

        insertElement(A);
    }
}
