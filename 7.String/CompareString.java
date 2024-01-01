public class CompareString {
    public static void main(String[] args) {
        String s1 = "mohammad";
        String s2 = "mohammad";
        String s3 = new String("mohammad");

        if (s1==s2) {
            System.out.println("String are equal");
        }else{
            System.out.println("String are not equal");
        }
        if (s1==s3) {
            System.out.println("String are equal");
        }else{
            System.out.println("String are not equal");
        }

        if (s1.equals(s3)) {
            System.out.println("String are equal");
        }else{
            System.out.println("String are not equal");
        }
    }
}
