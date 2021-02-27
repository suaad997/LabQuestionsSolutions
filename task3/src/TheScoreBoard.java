/**
 * Created by HOSHIBA on 02/10/2021.
 */
public class TheScoreBoard {
    private int enteries=0;
    private TheGame[] Board;

    public TheScoreBoard(int capacity){
        Board= new TheGame[capacity];
    }
    public void add(TheGame e){
        int NewScore=e.getScore();
        if(enteries<Board.length || NewScore>Board[enteries-1].getScore()){
            if (enteries<Board.length)
                enteries++;
        }
        int j=enteries-1;
        while (j>0 && Board[j-1].getScore()<NewScore){
            Board[j] = Board[j-1];
            j--;
        }
        Board[j]=e;
    }
    public TheGame remove(int i) throws IndexOutOfBoundsException{
        if(i<0 || i>enteries)
            throw new IndexOutOfBoundsException("Invalid index "+i);
        TheGame temp=Board[i];
        int j;
        for(j=i ; j<enteries-1 ; j++)
            Board [j]=Board[j+1];
        Board [enteries-1] = null;
        enteries--;
        return temp;
    }
}
