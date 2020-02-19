public class SnakeGame {
    private boolean[][] game;
    private int[] headPosition;
    private static int exhaustiveChecks;
    private static int recursiveChecks;

    public SnakeGame() {
        game = new boolean[1][1];
    }

    public SnakeGame(boolean[][] g, int x, int y) {
        headPosition = new int[] {x,y};
        game = g;
    }
    public int[] findTailExhaustively(){
        int x = headPosition[0];
        int y = headPosition[1];
        int length = 0;
        int[] result;
        for(int i = 0; i < game.length; i++){
            for(int j = 0; j < game[0].length; j++){
                int counter = 0;
                exhaustiveChecks++;
                if(game[i][j]){
                    length++;

                }
            }
        }
        result = new int [] {x,y, length};
        return result;
    }
    public int[] findTailRecursive(){ }
    private int[] findTailRecursively(int[] currentPosition, int[] previousPosition){}
    private void resetCounter(){
        exhaustiveChecks = 0;
        recursiveChecks = 0;
    }
    private static int getRecursiveChecks(){
        return recursiveChecks;
    }
    private static int getExhaustiveChecks(){
        return exhaustiveChecks;
    }

}
