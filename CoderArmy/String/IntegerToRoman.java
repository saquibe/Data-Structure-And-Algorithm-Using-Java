public class IntegerToRoman{
    public static String integerRoman(int num){
        int val[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String roman[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder rins = new StringBuilder();
        
        for (int i = 0; i < val.length; i++) {
            while (num >= val[i]) {
                num -= val[i];
                rins.append(roman[i]);
            }
        }
        return rins.toString();
    }

    public static void main(String[] args) {
        int n = 784;
        System.out.println(integerRoman(n));
    }
}