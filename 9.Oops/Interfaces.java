public class Interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}
interface ChessPlayer{
    void moves(); //by default it is abstract and public
}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right (diagonal all 4 direction)");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right (one step in diagonal)");
    }
}
