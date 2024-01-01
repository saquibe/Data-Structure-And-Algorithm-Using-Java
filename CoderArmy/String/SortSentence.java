//A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each word consists of lowercase and uppercase English letters.

// A sentence can be shuffled by appending the 1-indexed word position to each word then rearranging the words in the sentence.

// For example, the sentence "This is a sentence" can be shuffled as "sentence4 a3 is2 This1" or "is2 sentence4 This1 a3".
// Given a shuffled sentence s containing no more than 9 words, reconstruct and return the original sentence.



public class SortSentence {
    public static String sortSentence(String s) {
        String [] words = s.split(" ");
        String [] ans = new String[9];
        int count = 0;
        for(int i = 0; i < words.length; i++){
            int pos = words[i].charAt(words[i].length()-1)-'0';
            ans[pos-1] = words[i].substring(0, words[i].length()-1)+" ";
            count++;
        }
        s = "";
        for(int i = 0; i < count; i++){
            s += ans[i];
        }
        return s.substring(0, s.length()-1);
    }
    public static void main(String[] args) {
        String sentence = "is2 sentence4 This1 a3";

        System.out.println(sortSentence(sentence));
    }
}
