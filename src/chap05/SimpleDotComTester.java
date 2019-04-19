package chap05;

public class SimpleDotComTester {
    public static void main(String[] args)
    {
        SimpleDotCom dot = new SimpleDotCom();
        int[] locations = {};
        dot.setLocationCells(locations);
        String userGuess = "2";
        String result = dot.checkYourself(userGuess);
    }
}
