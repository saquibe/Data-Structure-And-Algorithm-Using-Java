//ship packages, book allocation, painter's problem all problem are same
public class CapacityToShipPackagesWithinDdays {
    public static int shipPackagesWithInDays(int[] weights, int days){
        int start = 0, end = 0, mid, ans = 0;
        for (int i = 0; i < weights.length; i++) {
            start = Math.max(start, weights[i]);
            end += weights[i];
        }

        while (start<=end) {
            mid = start + (end-start)/2;

            int packg = 0, count = 1;
            for (int i = 0; i < weights.length; i++) {
                packg += weights[i];
                if (packg>mid) {
                    count++;
                    packg = weights[i];
                }
            }
            if (count<=days) {
                ans = mid;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;

        System.out.println(shipPackagesWithInDays(arr, days));
    }
}

//time complexity: O(nlogn);
//solved using binary search approach