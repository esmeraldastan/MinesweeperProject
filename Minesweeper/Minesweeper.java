
/**
 * Write a description of class Minesweeper here.
 * 
 * @author Esmeralda Lopez
 * @version 10.22.16
 */

import java.lang.Math;
public class Minesweeper{
    //list 
    int [] board; 
    int row;
    int column;
    int bombs; 
    int posBombs;
    public Minesweeper(int row, int column ){
        this.row = row;
        this.column = column;
        board = new int[row*column];
    }
    public Minesweeper(){
        this(10,10);
    }
    public void printBoard( ){
        this.row=row;
        this.column = column; 

        System.out.println("     >>>>>>>>>>Welcome To Minesweeper<<<<<<<<");
        System.out.println();
        //number of rows and columns can be inserted 
        for (int i= 0; i <board.length; i++){
            //spacing
            if (i %column == 0){
                System.out.println(" ");

            }
            if (board[i] == -1) {
                System.out.print("* " );
            }

            else { 
                System.out.print(board[i] + " " ) ;
            }
        }

    }
    //System.out.println();
    public void addBombs(int bombs){
        while (bombs > 0){
            this.bombs = bombs;
            int posBombs = (int) (Math.random()*(row*column));

            board[posBombs] = -1;
            bombs -= 1;

        }
    }
    public void numbsAdded(){
        for (int i = 0; i<board.length; i++){
            if (board[i]== -1){
            //right
            if (i + 1 < board.length && board[i + 1] !=-1){
                    board[i + 1]++;
             }
            //left
            if ( i - 1 > board[0] && board[i - 1] != -1){
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
            if ( (i - column) + 1 > board[0] && board[( i - column) + 1 ] !=-1){
                board[( i - column)+ 1]++; 
            }
            // up left 
            if ( (i - column) - 1 > board[0] && board[( i - column) - 1 ] !=-1){
                board[( i - column)- 1]++; 
            }
            //down right 
            if ( (i + column) + 1 < board.length && board[( i + column) + 1 ] !=-1){
                board[( i + column)+ 1]++; 
            }
            // down left
             if ( (i + column) - 1 < board.length && board[( i + column) - 1 ] !=-1){
                board[( i + column)- 1]++; 
            }
        }
      }
    }
   public static String
}


 /**
  * public class GR{
    public static void main(){
        try{
            System.out.println(Notes.score(91));
            System.out.println(Notes.score(81));
            System.out.println(Notes.score(-51));
        }catch (Exception errorName){
            System.out.println("Error: " + errorName);
    
       }
   }
}

  */  
 
 
 /**
  * public class Notes{
    public static String score(int percent)throws Exception{
        if (percent < 0 ) {     
            throw new Exception("You apparently cannot count");
        }
        if (percent > 90){
            return "A";
        }
        else if (percent > 80){
            return "B";
        }
        else if (percent > 70){
            return "C";
        }
        else if (percent > 60){
            return "D";
        }
        else{
            return "F";
        }
    }
   
}

  */
