public class MyString {
    public static void main(String[] args) {
        char ch[] = {'A','B','C','D','E','F'};
        //convert array of character in string
        String str1 = new String(ch);
        System.out.println(str1);

        byte b[] = {23,45,67,89,98,7,65,43};
        String str2 = new String(b);
        System.out.println(str2);

         String str3 = new String("Java Progaram");
         System.out.println(str3);

         String str4 = "mohammad saquib";

         String name = "Mohammad Saquib";
         System.out.println(name.toLowerCase());
         System.out.println(name.toUpperCase());
         System.out.println(name.length());
         System.out.println(name.trim()); //trim remove black spaces ex. leading and trailing spaces
         System.out.println(name.substring(1));
         System.out.println(name.substring(0));
         System.out.println(name.substring(14));
         System.out.println(name.substring(3, 14));
         System.out.println(name.replace('a', 'e'));
         System.out.println(name.replace(str3, name));
         System.out.println(name.charAt(7));
         System.out.println(name.indexOf('M'));
         System.out.println(name.indexOf('a'));
         System.out.println(name.lastIndexOf('b'));
         System.out.println(name.equals(str4));
         System.out.println(name.equalsIgnoreCase(str4));
         System.out.println(name.compareTo(str4));
         System.out.println(name.concat(str3));
        //  System.out.println(name.valueOf());

         String website = "www.org.com"; 
         System.out.println(website.startsWith("www")); //check string start with www or not
         System.out.println(website.startsWith("org",4)); //check string start with www or not
         System.out.println(website.endsWith("com")); //check string end with com or not
    }
}
