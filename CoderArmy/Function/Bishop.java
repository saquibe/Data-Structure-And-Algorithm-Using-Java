public class Bishop {
    public static int totalCount(int A, int B){
        int count = 0;
        count += Math.min(8-A, 8-B);
        count += Math.min(8-A, B-1);
        count += Math.min(A-1, B-1);
        count += Math.min(A-1, 8-B);

        return count;
    }
    public static void main(String[] args) {
        int A=4, B=3; // 8x8 chessboard
        System.out.println(totalCount(A, B));
    }
}
