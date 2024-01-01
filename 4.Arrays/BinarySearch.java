// package Arrays;

public class BinarySearch {
    public static int binarySearch(int number[], int key){
        int start = 0, end = number.length-1;
        
        while (start<=end) {
            int mid = (start+end)/2;
            //comparision
            if (number[mid]==key) {
                return mid;
            }
            if (number[mid]<key) {//for right 
                mid = mid+1;
            }else{//for left
                mid = mid-1;
            }
        }
        return -1;   
    }
    public static void main(String[] args) {
        int number [] = {2,4,6,9,10,20,};
        int key = 10;
        System.out.println("key is at index : "+binarySearch(number, key));
    }
}
