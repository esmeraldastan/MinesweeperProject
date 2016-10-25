
/**
 * Write a description of class Minesweeper here.
 * 
 * @author Esmeralda Lopez
 * @version 10.22.16
 */
public class Minesweeper{
    //list 
    int board []; 
    int row;
    int column;
     public Minesweeper(int row, int column ){
       row = row;
       column = column;
       board = new int[row*column];
   }
   public Minesweeper(){
      this(10,10);
    }
   public void printSquareMinesweeper(){
      System.out.println(">>>>>>>>>>Welcome To Minesweeper<<<<<<<<");
      for (int i = 0; i < board.length; i++){
         board[i] = i + 1;
      }
    }
   public void printBoard( int row, int column){
      for (int r = 0; r <row; r++){
          for (int c = 0; c< column; c++){
              System.out.print("0");
              
            }
          System.out.println();
            }
         }
      }
    
