import java.util.Scanner;

public class TicTacToe {
    private char[][] board = new char[3][3];;
    private char player = 'X'; // Configure this to set starting player

    public TicTacToe() {
        // Constructor to initialize the board and set the current player
    }

    public void initializeBoard() {
        // Method to initialize the board
    }

    public void displayBoard() {
        for (int row = 0; row < board.length; row++) {
            System.out.println("+---+---+---+");

            for (int col = 0; col < board[row].length; col++) {
                System.out.print(
                    ((col == 0) ? "| " : "") 
                    + ((board[row][col] == 'X' || board[row][col] == 'O') ? board[row][col] : " ")
                    + " |"
                    );
            }   
        }
    }

    public boolean makeMove(int row, int col) {
        // Method to make a move
        return false; // Placeholder return value
    }

    public boolean checkWin() {
        // Method to check for a win
        return false; // Placeholder return value
    }

    public boolean checkDraw() {
        // Method to check for a draw
        return false; // Placeholder return value
    }

    public static void switchPlayer() {
        // Method to switch the current player
        player = (player == 'O') ? 'X' : 'O'; // Switches player
        System.out.println("Player " + player + "'s turn");
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in)

        // Intro to game
        System.out.println("-----------------------------------");
        System.out.println("Welcome to Tic Tac Toe!");
        System.out.println("[1] Input 10 strings into array");
        System.out.println("[2] Print array");
        System.out.println("[3] Access a string from array");
        System.out.println("[4] Exit Program");
        System.out.print("Your selection: ");
        System.out.println("-----------------------------------");

        displayBoard();

    }
}