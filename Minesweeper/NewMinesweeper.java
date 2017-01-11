
/**
 * Write a description of class NewMinesweeper here.
 * 
 * @author Esmeralda Lopez
 * @version version2 1/11/17
 */


public class NewMinesweeper{
    int [][] board;
    int row;
    int column;
    int bombs; 
    int posBombs;
    public NewMinesweeper(){
        row = row;
        column = column;
        board = new int [row][column];
    }
    public void printBoard2(){
        System.out.println("     >>>>>>>>>>Welcome To Minesweeper<<<<<<<<");
        System.out.println();
        for (int i= 0; i <board.length; i++){
            if (i %column == 0){
                System.out.println(" ");
            }
            if (board[i][i] == -1) {
                // * represent bombs
                System.out.print("* " );
            }
            else { 
                System.out.print(board[i] + " " ) ;
            }
        }
    }
       }

    

    