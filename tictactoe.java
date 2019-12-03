public class tictactoe {
    private String [][] board;
    private int Rows = 3;
    private int Cols = 3;
    private String regex = "\\s{3}";
    public tictactoe(){
        board = new String [Rows][Cols];

    }
    public void initializedBoard(){
        for (int i = 0; i < Rows; i ++){
            for( int n = 0; n< Cols; n++){
                board[i][n]="   ";
            }
        }
    }
    public void setPlay(int x, int y, String player ){
        if(this.board[x][y].matches(regex))
            board[x][y] = " "+player+" ";
    }
    public boolean isGameOver(){
        for(int i =0; i< Rows; i++) {
            if (board[i][0].matches(regex) && board[i][0].equals(board[i][1])&& board[i][1].equals(board[i][2]))
                return true;
        }
        for(int n= 0; n<Cols;n++) {
            if (board[0][n].matches(regex) && board[0][n].equals(board[1][n])&& board[1][n].equals(board[n][2]))
                return true;
        }
        if (board[0][0].matches(regex) && board[0][0].equals(board[1][1])&& board[1][1].equals(board[2][2]))
            return true;
        if (board[0][2].matches(regex) && board[0][2].equals(board[1][1])&& board[1][1].equals(board[2][0]))
            return true;
        return false;
    }

    public String printBoard(){
        String stringBoard = "";
        for(int i = 0; i<Rows; i++){
            for(int n = 0; n<Cols;n++) {
                if(n !=Cols-1)
                    stringBoard += board[i][n] + "|";
                else
                    stringBoard +=board[i][n];
            }
            if(i!=Cols-1)
                stringBoard += "\n---+---+---\n";
        }
        return stringBoard;
    }
}
