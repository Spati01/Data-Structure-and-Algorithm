package Math;

public class RectanglesInNxNBoard {
    static Long rectanglesInChessBoard(Long N) {
        // code here
        long n=(N*N*(N+1)*(N+1))/4 - (N*(N+1)*(2*N+1))/6;
        return n;
    }
}
