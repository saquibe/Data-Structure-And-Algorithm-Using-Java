//input:sorted rotated array with distinct numbers in (accending order) It is rotated at a pivot point 
//find the index of given element
public class SearchInRotatedSortedArray {
    public static int search(int arr[], int targ, int si, int ei){
        if (si>ei) {
            return -1;
        }
        //kaam
        int mid = si + (ei-si)/2; // (si+ei)/2

        //case found
        if (arr[si]==mid) {
            return mid;
        }

        //mid of L1
        if (arr[si]<=arr[mid]) {
            //case:a left
            if (arr[si]<=targ && targ<=arr[mid]) {
                return search(arr, targ, si, mid-1);
            }else{
                //case:b right
                return search(arr, targ, si, mid+1);
            }
        }

        //mid on L2
        else{
            //case:c right
            if (arr[mid]<=targ && targ<=arr[ei]) {
                return search(arr, targ, mid+1, ei);
            }else{
                //case:d left
                search(arr, targ, si, mid-1);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {4,6,8,3,0,7,4,6};
        int targIndx = search(arr, 0,0, arr.length);
        System.out.println(targIndx);
    }
}
