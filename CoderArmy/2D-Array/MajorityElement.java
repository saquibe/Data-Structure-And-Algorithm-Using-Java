//moore voting algorithm

public class MajorityElement {
    public static int majorityElement(int arr[]){
        int n = arr.length;
        int candidate = 0, count = 0;
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                count = 1;
                candidate = arr[i];
            }else{
                if (candidate == arr[i]) {
                    count++;
                }else{
                    count--;
                }
            }
        }
        return candidate;

        // //verify
        // count = 0;
        // for (int i = 0; i < n; i++) {
        //     if (arr[i] == candidate) {
        //         count++;
        //     }else if (count > n/2) {
        //         return candidate;
        //     }else{
        //         return -1;
        //     }
        // }
        // return -1;
    }
    public static void main(String[] args) {
        int arr[] = {3,3,3,2,3,1,3,2,2,1,3};

        System.out.println(majorityElement(arr));
    }
}
//time complexity: O(N)
//space complexity: O(1)
