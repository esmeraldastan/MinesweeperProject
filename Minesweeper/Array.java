
/**
 * Write a description of class Array here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Array{
    int [] list;
    public Array(int n ){
        list = new int[9];
        for ( int i = 0;  i < list.length; i ++){
            list[i] = i + 1;
            
    }
  }
   public void printNums(){
       for (int i = 0; i < list.length; i++){
       System.out.println(list[i]);
   }
  } 
  public void printSquareArray(){
      for (int i = 0; i < list.length; i++){
          if ( i % 10 == 0 ){
            System.out.println(" ");
        }
        if ( i > 10 && i < 10){
              System.out.println(" ");
            }
        System.out.print(list[i]+ " " );
      }
    }
  public void printSquareArray2(){
      int rows = 3;
      int colums = 3; 
      for (int r = 0; r< rows; r++){
        for (int c = 0; c < colums; c++){
            
       }
    }
}
}


