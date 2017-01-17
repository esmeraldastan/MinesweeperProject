
/**
 * Write a description of class NewMinesweeper here.
 * 
 * @author Esmeralda Lopez
 * @version version2 1/11/17
 */

import java.lang.Math;
public class NewMinesweeper{
    //2D array
    int [][] board;
    int row;
    int column;
    int bombs; 
    int XPos;
    int YPos;
    public NewMinesweeper(int row, int column){
        this.row = row;
        this.column = column;
        board = new int [row][column];
    }
    public NewMinesweeper(){
        this(10,10);
    }
    public void printBoard2(){
        //title
        this.row = row;
        this.column = column;
        System.out.println("     >>>>>>>>>>Welcome To Minesweeper<<<<<<<<");
        System.out.println();
        // no use of i
        //instead row and columns 
        for (row= 0; row<board.length-1; row++){
            for (column = 0; column< board[0].length - 1 ; column++){
          
               
          
          if (board[row][column] == -1) {
                // * represent bombs
                System.out.print("* " );
          }
          else { 
                System.out.print(board[row][column] + " " ) ;
          }
        }
        System.out.println( " ");
       }
    }
    //bomb adding
    public void addBombs(int bombs)throws Exception{
        if ( bombs == 1){
            throw new Exception(" Trying to cheat I see.... Not happening sucker!");
        }
        else if (bombs >= 101 ){
            throw new Exception( "Trying to kill your self?! That's great!");
        }
        int bombsplace = 0 ;
         while (bombs < bombsplace){
         
          // random bomb placement 
          //int posBombs = (int) (Math.random()*(row*column));
          XPos=(int)(Math.random() * board.length -1);
          YPos= (int)(Math.random() * board[0].length -1);
            if (board[XPos][YPos]==0){
            board[XPos][YPos] = -1;
            bombsplace++;

          }
        }
    }
       }
  
    

    