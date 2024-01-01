//Find if any pair in sorted and roatated array is equal to target sum
//Two pointer approach
import java.util.ArrayList;

public class PairSumTwo {
    public static boolean pairSumTwo(ArrayList<Integer> list, int target){
        //to find piviot point in sorted rotated array
        int bp = -1; //breaking point
        int n = list.size();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i+1)) {
                bp = i;
                break;
            }
        }

        int rp = bp; //largest
        int lp = bp+1; //smallest

        while (rp != lp) {
            //case 1
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }//case 2
            if (list.get(lp) + list.get(rp) < target) {
                lp = (lp+1) % n; //update left pointer
            }//case 3
            else{
                rp = (n+rp-1) % n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11); list.add(15); list.add(6); list.add(8); list.add(9); list.add(10);

        int target = 16;
        System.out.println(pairSumTwo(list, target));
    }
}
