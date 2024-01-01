public class ArrayDeclration {
    public static void main(String[] args) {
        int arr[] = {2,5,7,8,6,3};
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        int arr1[] = new int[5];
        arr1[0] = 74;
        arr1[1] = 44;
        arr1[2] = 43;
        arr1[3] = 43;
        arr1[4] = 24;
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        //printing using for each loop
        for (int x : arr1) {
            System.out.print(x+" ");
        }
        System.out.println();        
    }
}
