public class TrappedRainWater {
    public static int getTrappedWater(int height[]){
        int n = height.length;
        //calculate left max boundary store in auxilary array
        int leftMax[] = new int[n]; //this is auxilary array
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        //calculate right max boundary store in auxilary array
        int rightMax[] = new int[n]; //this is auxilary array
        rightMax[n-1] = height[n-1];
        for (int i = n-2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }
        int trapedWater = 0;
        //loop
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trapedWater += waterLevel - height[i];
        }
        return trapedWater;
    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,2,5};
        System.out.println("My trapped water is : "+getTrappedWater(height));
    }
}

//time complexity is O(n)