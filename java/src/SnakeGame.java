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
        resetCounter();
        int x = 0;
        int y = 0;
        int length = 0;
        int[] result;
        for(int i = 0; i < game.length; i++){
            for(int q = 0; q < game[i].length; q++){
                int counter = 0;
                exhaustiveChecks++;
                if(game[i][q]){
                    if(i == 0 && q == 0) {
                        if(this.game[i][q+1]){
                            counter++;
                    }
                        if(this.game[i+1][q]){
                            counter++;
                        }

                    }
                    else if(i == game.length - 1 && q == 0){
                        if(this.game[i][q+1]){
                            counter++;
                        }
                        if (this.game[i - 1][q]) {
                            counter++;
                        }
                    }
                    else if(i == 0 && q == game[i].length){
                        if (this.game[i +1][q]) {
                            counter++;
                        }
                        if (this.game[i][q - 1]) {
                            counter++;
                        }
                    }
                    else if(i == game.length - 1 && q == game[i].length){
                        if (this.game[i - 1][q]) {
                            counter++;
                        }
                        if (this.game[i ][q - 1]) {
                            counter++;
                        }
                    }
                    else{
                        if (this.game[i - 1][q]) {
                            counter++;
                        }
                        if (this.game[i + 1][q]) {
                            counter++;
                        }
                        if (this.game[i][q - 1]) {
                            counter++;
                        }
                        if (this.game[i ][q + 1]) {
                            counter++;
                        }
                    }
                    if(counter > 0){
                        length++;
                        if(counter == 1 && (i !=  headPosition[0] || q != headPosition[1])){
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
        resetCounter();
        findTailRecursively(headPosition,headPosition);
    }
    private int[] findTailRecursively(int[] currentPosition, int[] previousPosition{
        recursiveChecks++;]
        int a = currentPosition[0];
        int b = currentPosition[1];

        findTailRecursively(previousPosition,);
    }
    private void resetCounter(){
        exhaustiveChecks = 0;
        recursiveChecks = 0;
    }
    public static int getRecursiveChecks(){
        return recursiveChecks;
    }
    public static int getExhaustiveChecks(){
        return exhaustiveChecks;
    }

}
