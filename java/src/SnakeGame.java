public class SnakeGame {
    private boolean[][] game;
    private int[] headPosition;
    private static int exhaustiveChecks;
    private static int recursiveChecks;

    public SnakeGame() {
        game = new boolean[1][1];
    }

    public SnakeGame(boolean[][] game, int x, int y) {
        this.game = game;
    }
    public int[] findTailExhaustively(){}
    public int[] findTailRecursive(){}
    private int[] findTailRecursively(int[] currentPosition, int[] previousPosition){}
    private void resetCounter(){}
    private static int getRecursiveChecks(){}
    private static int getExhaustiveChecks(){}

}
