public class MergSort {
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void mergSort(int arr[], int si, int ei){ //si=starting index, ei=ending index
        if (si>=ei) {//base case
            return;
        }

        //kaam
        int mid = si+(ei-si)/2; //or (si+ei)/2
        mergSort(arr, si, mid);
        mergSort(arr, mid+1, ei);

        merg(arr, si, mid, ei);
    }

    //merg method to merge sorted part
    public static void merg(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei-si+1];
        int i = si; //inx for 1st sorted part
        int j = mid+1; //indx for 2nd sorted part
        int k = 0; //indx for temp

        while (i<=mid && j<=ei) {
            if (arr[i]<arr[j]) {
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        //for leftover element of 1st sorted part
        while (i<=mid) {
            temp[k++] = arr[i++];
        }

        //for leftover element of 1st sorted part
        while (j<=ei) {
            temp[k++] = arr[j++];
        }

        //copy temp to original array
        for (k = 0, i=si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,3,7,8,4,8,2,12,3,6,};
        mergSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
//Time Complexity-> O(N*logN)