
/**
 * Write a description of class Minesweeper here.
 * 
 * @author Esmeralda Lopez
 * @version 10.22.16
 */

import java.lang.Math;
public class Minesweeper{
    //list 
    int [] board ; 
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
                System.out.print(" *" );
          }
          
         else{ 
                System.out.print(board[i] + " " ) ;
            }
            }
          
            }
            //System.out.println();
        
     
    public void addBombs( int bombs){
        while (bombs > 0){
            this.bombs = bombs;
            int posBombs = (int) (Math.random()*(row*column));
        
            board[posBombs] = 9;
            bombs = -1;
             
           }
    }
   }
  

    
