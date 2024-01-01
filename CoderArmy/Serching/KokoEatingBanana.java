public class KokoEatingBanana {
    public static int minHoursToEatBanana(int piles[], int h){
        int start = 0, end = 0, n = piles.length, mid, ans = 0;

        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += piles[i];
            end = Math.max(end, piles[i]);
        }
        //hadling exception
        start = (int)(sum/h);
        if (start==0) {
            start = 1;
        }
        
        while (start<=end) {
            mid = start + (end-start)/2;

            int total_time = 0;
            for (int i = 0; i < n; i++) {
                total_time += piles[i]/mid;
                if (piles[i]%mid == 0) {
                }else{
                    total_time++;
                }
            }
            if (total_time > h) {
                start = mid+1;
            }else{
                ans = mid;
                end = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        // int piles[] = {3,6,7,11};
        // int h = 8;

        int piles[] = {30, 11, 23, 4, 20};
        int h = 5;

        System.out.println(minHoursToEatBanana(piles, h));
    }
}
