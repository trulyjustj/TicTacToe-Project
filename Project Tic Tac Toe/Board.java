import java.util.ArrayList;

/**
 * Write a description of class Board here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Board
{
    // instance variables - replace the example below with your own
    private String[][] board;
    /**
     * Constructor for objects of class Board
     */
    public Board()
    {
        // initialise instance variables
        board = new String[3][3];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                board[i][j]= " ";
                
            }
        }
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void printBoard()
    {
        // put your code here
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if( j==board[0].length-1)
                {
                 System.out.println("[" + board[i][j]+ "]");   
                }
                System.out.print("[" + board[i][j]+ "]");
                
            }
        }
    }
}
