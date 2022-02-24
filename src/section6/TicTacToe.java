package section6;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        runGame();
    }
    public static void runGame(){
        String winner="";
        boolean xTurn = true;
        int row=0;
        int col=0;
        String[][] gameBoard=new String[3][3];
        intializeGameBoard(gameBoard);
        while(winner.equals("")){
            if(xTurn){
                System.out.println("It's X player's turn");
            }
            else {
                System.out.println("It's O player's turn");
            }

            getUserInput(xTurn,gameBoard);
            System.out.println();
            printCurrentGameBoard(gameBoard);
            winner=getWinner(gameBoard);
            xTurn=!xTurn;
            if(winner.equals("")&& isBoardFull(gameBoard)){
                winner="C";
            }
        }
        System.out.println();
        if(winner.equals("C")){
            System.out.println("No Winner");
        }
        else {
            System.out.println("Winner is  "+winner);
        }
    }
    public static void intializeGameBoard(String[][] gameBoard){
        for(int i=0;i<gameBoard.length;i++){
            for(int j=0;j<gameBoard[i].length;j++){
                gameBoard[i][j]=" ";
            }
        }
    }
    public static void printCurrentGameBoard(String[][] gameBoard){
        for(int i=0;i< gameBoard.length;i++){
            for (int j=0;j< gameBoard[i].length;j++){
                System.out.print(gameBoard[i][j]);
                if(j<2) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if(i<2){
                System.out.println("-----------");
            }
            System.out.println();
        }
    }
    public static void getUserInput(boolean xTurn, String[][] gameBoard){
        Scanner sc=new Scanner(System.in);
        int row=-1;
        int col=-1;
        boolean keepAsking=true;
        while (keepAsking){
            System.out.println("Please Enter the row then column, each from 0, 1, or 2 separated by space");
            row=sc.nextInt();
            col=sc.nextInt();
            sc.nextLine();
            if(row>=0 && row<=2 && col>=0 && col<=2){
                if(!cellAreadyOccupied(row,col,gameBoard)){
                    keepAsking=false;
                }
                else {
                    System.out.println("That cell has been already occupied");
                }
            }
        }
        if(xTurn){
            gameBoard[row][col]="X";
        }
        else {
            gameBoard[row][col]="O";
        }
    }
    public static boolean cellAreadyOccupied(int row,int col,String[][] gameBoard){
        return !gameBoard[row][col].equals(" ");
    }
    public static String getWinner(String[][] gameBoard){
        final int ROW=gameBoard.length;
        final int COL=gameBoard[0].length;
        for(int i=0;i<ROW;i++){
            if(!gameBoard[i][0].equals(" ")&&gameBoard[i][0].equals(gameBoard[i][1])&&gameBoard[i][1].equals(gameBoard[i][2])){
                return gameBoard[i][0];
            }
        }

        for(int i=0;i<COL;i++){
            if(!gameBoard[0][i].equals(" ")&&gameBoard[0][i].equals(gameBoard[1][i])&&gameBoard[1][i].equals(gameBoard[2][i])){
                return gameBoard[0][i];
            }
        }
        if(!gameBoard[0][0].equals(" ")&&gameBoard[0][0].equals(gameBoard[1][1])&&gameBoard[1][1].equals(gameBoard[2][2])){
            return gameBoard[0][0];
        }
        if(!gameBoard[2][0].equals(" ")&&gameBoard[2][0].equals(gameBoard[1][1])&&gameBoard[1][1].equals(gameBoard[0][2])){
            return gameBoard[2][0];
        }
        return "";
    }
    public static boolean isBoardFull(String[][] gameBoard){
        int count=0;
        for(int i=0;i<gameBoard.length;i++){
            for(int j=0;j< gameBoard[i].length;j++){
                if(!gameBoard[i][j].equals(" ")){
                    count++;
                }
            }
        }
        return count==9;
    }
}