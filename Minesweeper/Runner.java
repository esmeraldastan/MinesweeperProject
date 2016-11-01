
/**
 * Write a description of class Runner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Runner{
    public static void main(){
        Minesweeper game = new Minesweeper();
        game.addBombs(10);
        game.numbsAdded();
        game.printBoard();
 }
}
