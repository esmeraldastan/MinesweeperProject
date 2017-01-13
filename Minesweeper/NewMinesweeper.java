
/**
 * Write a description of class NewMinesweeper here.
 * 
 * @author Esmeralda Lopez
 * @version version2 1/11/17
 */


public class NewMinesweeper{
    //2D array
    int [][] board;
    int row;
    int column;
    int bombs; 
    int posBombs;
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
        System.out.println("     >>>>>>>>>>Welcome To Minesweeper<<<<<<<<");
        System.out.println();
        // no use of i
        //instead row and columns 
        for (int row= 0; row<board.length; row++){
         
            if (row %column == 0){
                System.out.println(" ");
            }
            if (board[row][row] == -1) {
                // * represent bombs
                System.out.print("* " );
            }
            else { 
                System.out.print(board[row][row] + " " ) ;
            }
        }
    }
       }
  
    

    