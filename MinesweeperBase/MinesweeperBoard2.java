
/**
 * Write a description of class Minesweeper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.lang.Math;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MinesweeperBoard2{
    Cell[] board;
    int rows;
    int columns;
    public MinesweeperBoard2(){
        //Put the constructor here.
        
        
        //These pieces are for the GUI.
        JFrame frame = new JFrame();
        frame.add(addCells());
        
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void addBombs(int bombs) throws Exception{
        //own code
        if ( bombs == 1){
            throw new Exception(" Trying to cheat I see.... Not happening sucker!");
        }
        else if (bombs >= 50){
            throw new Exception( "Trying to kill your self?! That's great!");
        }
        while (bombs > 0){
            this.bombs = bombs;
            // random bomb placement 
            int posBombs = (int) (Math.random()*(row*column));

            board[posBombs] = -1;
            bombs -= 1;

        }
    }

    public void addNums(){
      //own code 
      // location of bombs/numbers on board 
        for (int i = 0; i<board.length; i++){
            if (board[i]== -1){
            //right
            if (i + 1 < board.length && i % column < column-1 && board[i + 1] !=-1){
                    board[i + 1]++;
             }
            //left
            if ( i - 1 > board[0] &&  i % column  !=0 && board[i - 1] != -1){
                   board[ i - 1]++;
             }
            //up
            if ( i - column > board[0] && board [ i - column ] !=-1){
                 board[i - column]++;
                }
            //down
            if ( i + column < board.length && board [ i + column] !=-1){
                board[i +column]++;
            }
            
            //up right 
            if ( (i - column) + 1 > board[0] && i % column < column-1 && board[( i - column) + 1 ] !=-1){
                board[( i - column)+ 1]++; 
            }
            // up left 
            if ( (i - column) - 1 > board[0] && i % column  !=0 && board[( i - column) - 1 ] !=-1){
                board[( i - column)- 1]++; 
            }
            //down right 
            if ( (i + column) + 1 < board.length && i % column < column-1 && board[( i + column) + 1 ] !=-1){
                board[( i + column)+ 1]++; 
            }
            // down left
             if ( (i + column) - 1 < board.length && i % column  !=0 && board[( i + column) - 1 ] !=-1){
                board[( i + column)- 1]++; 
            }
        }
      }
     }
    /**This method is used for testing and will be deleted if using the GUI.
     *  It is still required for all students.
     */
    public void printBoard(){
        
    }
    public JPanel addCells(){
        JPanel panel = new JPanel(new GridLayout(rows,columns));
        for(int i = 0; i< rows*columns; i++){
                board[i]= new Cell();
                panel.add(board[i].getButton());
        }
        return panel;
    }

}
