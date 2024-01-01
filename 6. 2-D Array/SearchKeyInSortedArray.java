public class SearchKeyInSortedArray {
    public static boolean stairCaseSearch(int [][] matrix, int key){
        int rwo=0, col=matrix[0].length-1;
        while (rwo<matrix.length && col>= 0) {
            if (matrix[rwo][col]==key) {
                System.out.println("Key is found at index ("+rwo+","+col+")");
                return true;
            }else if (key<matrix[rwo][col]) {
                col--;
            }else{
                rwo++;
            }
        }
        System.out.println("Key is not found");
        return false;
    }
    public static void main(String[] args) {
        int [][] matrix = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key = 33;
        stairCaseSearch(matrix, key); 
    }
}
//time complexity is O(m+n)