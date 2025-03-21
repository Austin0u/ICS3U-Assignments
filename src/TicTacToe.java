import java.util.Scanner;
import java.util.InputMismatchException;

public class TicTacToe {
    private static char[][] board = new char[3][3];
    private static char player = 'X'; // Configure this to set starting player

    public static void initializeBoard() {
        // Fills the board with empty spaces
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = ' ';
            }
        }
    }

    public static void displayBoard() {
        System.out.println("    1   2   3"); // adds column numbers
        for (int row = 0; row < board.length; row++) {
            System.out.println("  +---+---+---+");
            System.out.print((row + 1) + " |");
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(" " + board[row][col] + " |");
            }
            System.out.println();
        }
        System.out.println("  +---+---+---+"); // closes board
    }

    public static void makeMove(int row, int col) {
        board[row][col] = player;
    }

    public static boolean checkWin() {
        // Check horizional win
        for (int row = 0; row < 3; row++) {
            if (board[row][0] == player && board[row][1] == player && board[row][2] == player) {
                return true;
            }
        }

        // Check vertical win
        for (int col = 0; col < 3; col++) {
            if (board[0][col] == player && board[1][col] == player && board[2][col] == player) {
                return true;
            }
        }

        // Check diagonal win
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        } else if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }

        return false; // no win found yet
    }

    public static boolean checkDraw() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (board[row][col] == ' ') {
                    return false; // still more moves possible
                }
            }
        }
        return true; // No more moves possible
    }

    public static void switchPlayer() {
        player = (player == 'O') ? 'X' : 'O'; // Switches player
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // Intro to game
        System.out.println("-----------------------------------");
        System.out.println("Welcome to Tic Tac Toe!");
        System.out.println("----------INSTRUCTIONS-------------");
        System.out.println("1. Players take turns marking a square, starting with player " + player + ".");
        System.out.println("2. Moves are entered using coordinates (column and row), using numbers from 1-3.");
        System.out.println(" -  The columns is the horizontal placement.");
        System.out.println(" -  The row is the vertical placement.");
        System.out.println("3. The first player to get 3 of their marks in a row (horizontally, vertically, or diagonally) wins!");

        while (true) { // Game loop
            System.out.println("------------GAME START-------------");
            initializeBoard();
            displayBoard();
            System.out.println("----------PLAYER " + player + "'S TURN----------"); // Displays STARTING player

            while (true) { // Loops until a win or draw is reached
                try {
                    System.out.println("Player " + player + ", please enter your move (column and row): ");
                    System.out.print("> Column: ");
                    int col = keyboard.nextInt() - 1;
                    System.out.print("> Row: ");
                    int row = keyboard.nextInt() - 1;

                    // Checks if the there is already a mark in the location
                    if (board[row][col] == ' ') {
                        makeMove(row, col);
                    } else {
                        System.out.println("\nInvalid move, that spot is already occupied. Please try again.\n");
                        continue;
                    }
                // } catch (InputMismatchException exception) {
                //     System.out.println("\nInvalid move, please enter an integer.\n");
                //     continue;
                } catch (ArrayIndexOutOfBoundsException exception) {
                    System.out.println("\nInvalid move, please enter a integer between 1-3.\n");
                    continue;
                }
                
                displayBoard();

                // Checks win and draw, closes game if either is true
                if (checkWin()) {
                    System.out.println("Player " + player + " wins!");
                    break;
                } else if (checkDraw()) {
                    System.out.println("It's a draw!");
                    break;
                }

                switchPlayer();
                System.out.println("----------PLAYER " + player + "'S TURN----------"); // Displays next player
            }

            // Prompts user if they want to play again
            System.out.print("Do you want to play again? (y/n): ");
            if (keyboard.next().toLowerCase().charAt(0) != 'y') {
                break;
            }
        }

        keyboard.close();
    }
}