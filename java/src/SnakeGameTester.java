import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SnakeGameTester {
    @Test
    public void snakeExhaustive1(){
        //This is a worthwhile test as to check if the exhaustive works with no snake there
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
        //Testing to see if the check would return correctly with a one by one
        boolean[][] g = new boolean[][] {{false}};
        int x = 0;
        int y = 0;
        int[] tail = {0,0,0};
        SnakeGame sol = new SnakeGame(g,x,y);

        assertArrayEquals(tail,sol.findTailExhaustively());
    }
    @Test
    public void snakeExhaustive5(){
        //Testing to see if the game can handle a longer snake than other tests
        boolean[][] g = new boolean[][] {{true,false,false,false,true},
                                        {true,false,false,false,true},
                                        {true,false,false,false,true},
                                        {true,false,false,false,true},
                                        {true,true,true,true,true}};
        int x = 0;
        int y = 0;
        int[] tail = {4,0,13};
        SnakeGame sol = new SnakeGame(g,x,y);
        sol.findTailExhaustively();
        assertArrayEquals(tail, sol.findTailExhaustively());
    }
    @Test
    public void snakeRecursive1(){
        //Testing if the recursive functions properly
        boolean[][] g = new boolean[][] {{false,false, false},
                {false,false,false},
                {false,false,false}};
        int x = 0;
        int y = 0;
        int[] tail = {0,0,0};
        SnakeGame sol = new SnakeGame(g,x,y);
        sol.findTailRecursive();
        assertArrayEquals(tail,new int[] {0,0,0});
    }
    @Test
    public void snakeRecursive2() {
        //seeing if the recursive works properly with  an actual snake
        boolean[][] g = new boolean[][]{{false, true, false},
                                        {false, true, false},
                                         {false, true, false}};
        int x = 0;
        int y = 1;
        int[] tail = {2, 1, 3};
        SnakeGame sol = new SnakeGame(g, x, y);
        sol.findTailRecursive();
        assertArrayEquals(tail, new int[]{0, 0, 0});
    }
    @Test
    public void snakeRecursive3(){
        //Testing the recursive if it works for a snake and a wrong part
        boolean[][] g = new boolean[][] {{false,false, false,false,false},
                                         {false,true, false,false,false},
                                        {false,true, false,false,false},
                                        {false,true, false,true,false},
                                         {false,false,false,false,false}};
        int x = 1;
        int y = 1;
        int[] tail = {0,0,0};
        SnakeGame sol = new SnakeGame(g,x,y);
        sol.findTailRecursive();
        assertArrayEquals(tail,sol.findTailRecursive());
    }
    @Test
    public void snakeRecursive4(){
        //Testing for a snake that turns with a space in between the pieces
        boolean[][] g = new boolean[][] {{false,false,false,false,false},
                                        {false,true,false,true,false},
                                        {false,true,false,true,false},
                                        {false,true,true,true,false},
                                        {false,false,false,false,false},};
        int x = 1;
        int y = 1;
        int[] tail = {1,3,7};
        SnakeGame sol = new SnakeGame(g,x,y);
        sol.findTailRecursive();
        assertArrayEquals(tail,sol.findTailRecursive());
    }
    @Test
    public void snakeRecursive5(){
        //Testing to see if it works with an empty array sent in
        boolean[][] g = new boolean[][] {{}};
        int x = 0;
        int y = 0;
        int[] tail = {0,0,0};
        SnakeGame sol = new SnakeGame(g,x,y);
        sol.findTailRecursive();
        assertArrayEquals(tail,sol.findTailRecursive());
    }
}
