// import java.util.Scanner;

public class StringBasic {
    public static void main(String[] args) {
        // String str = "Physics";
        // for (int i = 2; i < 4; i++) {
        //     System.out.print(str.substring(i));
        // }

        // String s = "abcde"; //print all substring
        // for (int i = 0; i < s.length(); i++) {
        //     for (int j = i+1; j <= s.length(); j++) {
        //         System.out.print(s.substring(i,j)+" ");
        //     }
        //     System.out.println();
        // }

        // String name = "saquib";
        // String goal = "uibsaq";
        // System.out.println((name.length() == goal.length() && (name+name).contains(goal)));


        // StringBuilder sb = new StringBuilder("Hello");
        // sb.append("World");
        // System.out.println(sb);

        //change hello to mello

        // sb.setCharAt(0, 'M');
        // System.out.println(sb);

        // sb.insert(0, 'O');
        // System.out.println(sb);

        // sb.deleteCharAt(0);
        // System.out.println(sb);

        // sb.reverse();
        // System.out.println(sb);

        // sb.delete(0, 4);
        // System.out.println(sb);

        // Scanner sc = new Scanner(System.in);
        // StringBuilder sb = new StringBuilder(sc.nextLine());
        // System.out.println(sb);

        String str = "hksdjkldjkl";
        int count[] = new int[128];
        for (char ch : str.toCharArray()) {
            count[ch]++;
        }
        System.out.println(count.toString());
    }
}
