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
        int x;
        int y;
        int length = 0;
        int[] result;
        for(int i = 0; i < game.length; i++){
            for(int q = 0; q < game[i].length; q++){
                int counter = 0;
                exhaustiveChecks++;
                if(game[i][q]){
                    if(this.game[i][q+1]){
                        counter++;
                    }
                    if(this.game[i+1][q]){
                        counter++;
                    }
                    if(this.game[i-1][q]){
                        counter++;
                    }
                    if(this.game[i][q-1]){
                        counter++;
                    }
                    if(counter > 0){
                        length++;
                        if(counter == 1 && i !=  headPosition[0] && q != headPosition[1]){
                            x = i;
                            y = q;
                        }
                    }
                }
            }
        }
        result = new int [] {x,y, length};
        return result;
    }
    public int[] findTailRecursive(){

    }
    private int[] findTailRecursively(int[] currentPosition, int[] previousPosition{

    }
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
