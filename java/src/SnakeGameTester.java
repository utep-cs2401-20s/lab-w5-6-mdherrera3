import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SnakeGameTester {
    @Test
    public void snakeExhaustive1(){
        //This is a worthwhile test as to check if the
        boolean[][] g = new boolean[][] {{false,false, false},
                                          {false,false,false},
                                         {false,false,false}};
        int x = 0;
        int y = 0;
        int[] tail = {0,0,0};
        SnakeGame sol = new SnakeGame(g,x,y);
        sol.findTailExhaustively();
        assertArrayEquals(tail,tail);
    }
    @Test
    public void snakeExhaustive2(){
        //Testing to see if a regular game would run properly
        boolean[][] g = new boolean[][] {{false,false,false,false},
                                        {false,true,false,false},
                                        {false,true,false,false},
                                        {false,true,false,false}};
        int x = 1;
        int y = 1;
        int[] tail = {3,1,3};
        SnakeGame sol = new SnakeGame(g,x,y);
        sol.findTailExhaustively();
        assertArrayEquals(tail,tail);
    }
    @Test
    public void snakeExhaustive3(){
        //testing to see if there is any problem with the code if there are two separate bits
        //which when debugged gave me an out of bounds and the debug said socket
        boolean[][] g = new boolean[][] {{false,false,false,false},
                {false,true,false,false},
                {false,true,false,false},
                {false,true,false,true}};
        int x = 1;
        int y = 1;
        int[] tail = {3,1,3};
        SnakeGame sol = new SnakeGame(g,x,y);
        sol.findTailExhaustively();
        assertArrayEquals(tail,tail);
    }
    @Test
    public void snakeExhaustive4(){
        //
        boolean[][] g = new boolean[][] {{false,false, false},
                {false,false,false},
                {false,false,false}};
        int x = 0;
        int y = 0;
        int[] tail = {0,0,0};
        SnakeGame sol = new SnakeGame(g,x,y);

        assertArrayEquals(tail,sol.findTailExhaustively());
    }
    @Test
    public void snakeExhaustive5(){
        //
        boolean[][] g = new boolean[][] {{false,false, false},
                {false,false,false},
                {false,false,false}};
        int x = 0;
        int y = 0;
        int[] tail = {0,0,0};
        SnakeGame sol = new SnakeGame(g,x,y);
        sol.findTailExhaustively();
        assertArrayEquals(tail, tail);
    }
    @Test
    public void snakeRecursive1(){

    }

}
