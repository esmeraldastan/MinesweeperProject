
/**
 * Write a description of class Minesweeper here.
 * 
 * @author Esmeralda Lopez
 * @version 10.22.16
 */
public class Minesweeper{
    //list 
    int [] board; 
    int row;
    int column;
     public void Minesweeper(int row, int column ){
        board = new int[100];
        row = row;
        column = column;
        for (int i = 0 ; i< row*column; i++){
            board[i] = i + 1;
    }
   }
   public Minesweeper(){
      this(10,10);
      }
}
  
