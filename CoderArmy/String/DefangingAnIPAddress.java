// package CoderArmy.String;

public class DefangingAnIPAddress {
    public static String defangingIPAdd(String address){
        StringBuilder ans = new StringBuilder("");
        for (char ch : address.toCharArray()) {
            if (ch == '.') {
                ans.append("[.]");
            }else{
                ans.append(ch);
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String ipAddress = "255.255.255.255";

        System.out.println(defangingIPAdd(ipAddress));
    }
}

//time complexity: O(N)
//space complexity: O(N)
