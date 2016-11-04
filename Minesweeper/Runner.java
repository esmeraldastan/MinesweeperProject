
/**
 * Write a description of class Runner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Runner{
    public static void main(){
        try{
        Minesweeper game = new Minesweeper();
        game.addBombs(90);
        game.numbsAdded();
        game.printBoard();
     }catch (Expection errorName){
        System.out.println("Error:" + errorName);
     }
    }
}

