// package CoderArmy.TwoPointer;
//segregate 0 and 1
public class SegregateZeroAndOne {
    public static void segregate(int arr[]){
        int count0 = 0, count1 = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                count0++;
            }else{
                count1++;
            }
        }
        for(int i = 0; i<count0; i++){
            arr[i] = 0;
            System.out.print(arr[i]+" ");
        }
        for(int i = count0; i < arr.length; i++){
            arr[i] = 1;
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String [] args){
        int arr[] = {0,1,1,1,0,0,1,0,1,0};
        segregate(arr);
    }
}
//time complexity: O(n)