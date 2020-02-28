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
                        if (this.game[i][q - 1]) {
                            counter++;
                        }
                    }
                    else if(i == 0){
                        if(this.game[i + 1][q]){
                            counter++;
                        }
                        if(this.game[i][q - 1]){
                            counter++;
                        }
                        if(this.game[i][q + 1]){
                            counter++;
                        }
                    }
                    else if(i == game.length -1){
                        if(this.game[i - 1][q]){
                            counter++;
                        }
                        if(this.game[i][q - 1]){
                            counter++;
                        }
                        if(this.game[i][q + 1]){
                            counter++;
                        }
                    }
                    else if(q == 0){
                        if(this.game[i][q + 1]){
                            counter++;
                        }
                        if(this.game[i + 1][q]){
                            counter++;
                        }
                        if(this.game[i - 1][q]){
                            counter++;
                        }
                    }
                    else if(q == game.length -1){
                        if(this.game[i + 1][q]){
                            counter++;
                        }
                        if(this.game[i][q - 1]){
                            counter++;
                        }
                        if(this.game[i - 1][q]){
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
        System.out.print(getExhaustiveChecks());

        return result;
    }
    public int[] findTailRecursive(){
        resetCounter();
        int[] tail = findTailRecursively(headPosition,headPosition);
        return tail;
    }
    private int[] findTailRecursively(int[] currentPosition, int[] previousPosition){

        int[] endOfSnake = new int[3];
        if((currentPosition[0]>0) && (game[currentPosition[0] + 1][currentPosition[1]]) && (currentPosition[0] != previousPosition[0] && currentPosition[1] != previousPosition[1])){
            recursiveChecks++;
            previousPosition[0] = currentPosition[0];
            previousPosition[1] = currentPosition[1];

            currentPosition[0] = currentPosition[0] + 1;
            return findTailRecursively(currentPosition, previousPosition);
        }
        else if((currentPosition[0] > game.length) && (game[currentPosition[0] - 1][currentPosition[1]]) && (currentPosition[0] != previousPosition[0] && currentPosition[1] != previousPosition[1])){
            recursiveChecks++;
            previousPosition[0] = currentPosition[0];
            previousPosition[1] = currentPosition[1];

            currentPosition[1] = currentPosition[1] - 1;
            return findTailRecursively(currentPosition, previousPosition);
        }
        else if((currentPosition[1] > 0) && (game[currentPosition[0]][currentPosition[1] - 1]) && (currentPosition[0] != previousPosition[0] && currentPosition[1] != previousPosition[1])){
            recursiveChecks++;
            previousPosition[0] = currentPosition[0];
            previousPosition[1] = currentPosition[1];

            currentPosition[0] = currentPosition[1] - 1;
            return findTailRecursively(currentPosition, previousPosition);
        }
        else if((currentPosition[1] > game.length) && (game[currentPosition[0]][currentPosition[1] + 1]) && (currentPosition[0] != previousPosition[0] && currentPosition[1] != previousPosition[1])){
            recursiveChecks++;
            previousPosition[0] = currentPosition[0];
            previousPosition[1] = currentPosition[1];

            currentPosition[0] = currentPosition[0] + 1;
            return findTailRecursively(currentPosition, previousPosition);
        }
        else {
            endOfSnake[0] = currentPosition[0];
            endOfSnake[1] = currentPosition[1];
            endOfSnake[2] = recursiveChecks;
            return endOfSnake;
        }
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
