public class VerifyGmail {
    public static void main(String[] args) {
        String str = "saquibe@gmail.com";
        int i = str.indexOf("@");
        String username = str.substring(0, i);
        String domain = str.substring(i+1, str.length());

        System.out.println("Username: "+username);
        System.out.println("Domain: "+domain);

        //to check valid gmail or not

        int j = domain.indexOf(".");
        String name = domain.substring(0, j);
        System.out.println(name.equals("gmail"));
    }
}
