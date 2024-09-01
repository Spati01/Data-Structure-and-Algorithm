package String;

public class CheckIfTwoChessboardSquaresHaveTheSameColor {
    public boolean checkTwoChessboards(String c1, String c2) {
        int s1 = (c1.charAt(0) - 'a') + (c1.charAt(1) - '0');
        int s2 = (c2.charAt(0) - 'a' ) + (c2.charAt(1) - '0');

        return s1 % 2 == s2 % 2;

    }


}
