
/**
 * Write a description of class Minesweeper here.
 * 
 * @author Esmeralda Lopez
 * @version 10.22.16
 */
import java.util.Random;
import java.lang.Math;
public class Minesweeper{
    //list 
    int board []; 
    int row;
    int column;
    int bombs; 
     public Minesweeper(int row, int column ){
       row = row;
       column = column;
       board = new int[row*column];
   }
   public Minesweeper(){
      this(10,10);
    }
   public void printSquareMinesweeper(){
      
      for (int i = 0; i < board.length; i++){
         board[i] = i + 1;
      }
    }
   public void printBoard( int row, int column){
       System.out.println("     >>>>>>>>>>Welcome To Minesweeper<<<<<<<<");
       System.out.println();
       //number of rows and columns can be inserted 
      for (int r = 0; r <row; r++){
          for (int c = 0; c < column; c++){
              System.out.print("*");
              //spacing
              if (row % 11 == 0){
                  System.out.println(" ");
             }
             
                
             if (column < 11 && column > 0){
                    System.out.print(" ");
     
             }
          
            }
            System.out.println();
        }
     }
    public void addBombs( int bombs){
        while (bombs > 0){
            this.bombs = bombs;
            int posBombs = (int) (Math.random()*(row*column));
            if (board[posBombs] == 0 ){
                board[posBombs] = 9;
                bombs = -1;
             
           }
    }
   }
  
}
    
