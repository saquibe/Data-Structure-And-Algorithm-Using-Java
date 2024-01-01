//add all numbers upto given number using recursion 
public class AddAllNum {
    public static int sum(int k){
        if (k>0) {
            return k+sum(k-1);
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
        int result = sum(20);
        System.out.println(result);
    }
}

