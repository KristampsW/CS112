import java.util.*;
public class tic_drive {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        tictactoe game = new tictactoe();
        game.initializedBoard();
        String player = "X";
        //boolean repeat = true;
        do {

            System.out.println(game.printBoard());
            System.out.println("Enter coordinates for rows:");
            int row = input.nextInt();
            System.out.println("Enter coordinates for column:");
            int col = input.nextInt();
            game.setPlay(row,col,player);
            if(game.isGameOver()== true){
                System.out.println(game.printBoard()+'\n'+player+" wins");
                break;
            }
            if(player=="X")
                player="0";

            else
                player="X";

        }while(true);
    }
}
