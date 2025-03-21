import java.util.Scanner;
import java.util.InputMismatchException;

public class TicTacToe {
    private static char[][] board = new char[3][3];
    private static char player = 'X'; // Configure this to set starting player

    public static void initializeBoard() {
        // Fills the board with empty spaces (aka resets the board)
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = ' ';
            }
        }
    }

    public static void displayBoard() {
        System.out.println("    1   2   3"); // Adds column numbers
        for (int row = 0; row < board.length; row++) {
            System.out.println("  +---+---+---+");
            System.out.print((row + 1) + " |"); // Adds row numbers
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(" " + board[row][col] + " |");
            }
            System.out.println();
        }
        System.out.println("  +---+---+---+"); // closes board
    }

    public static void makeMove(int row, int col) {
        board[row][col] = player;
        displayBoard();
    }

    public static boolean checkWin() {
        // Check for a horizional win
        for (int row = 0; row < 3; row++) {
            if (board[row][0] == player && board[row][1] == player && board[row][2] == player) {
                return true;
            }
        }

        // Check for a vertical win
        for (int col = 0; col < 3; col++) {
            if (board[0][col] == player && board[1][col] == player && board[2][col] == player) {
                return true;
            }
        }

        // Check for a diagonal win
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player ||
                board[0][2] == player && board[1][1] == player && board[2][0] == player) {
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
        player = (player == 'O') ? 'X' : 'O';
        System.out.println("\n--------- PLAYER " + player + "'S TURN ---------");
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // Intro to game
        System.out.println("====================================");
        System.out.println("       Welcome to Tic Tac Toe!");
        System.out.println("=========== INSTRUCTIONS ===========");
        System.out.println("1. Players take turns making moves, starting with player " + player + ".");
        System.out.println("2. Each move will place the active player's mark (X or O) at the coordinate location.");
        System.out.println("3. Moves are entered using coordinates (column and row), using numbers from 1-3.");
        System.out.println(" -  The columns is the horizontal placement.");
        System.out.println(" -  The row is the vertical placement.");
        System.out.println(
                "4. The first player to get 3 of their marks in a row (horizontally, vertically, or diagonally) wins!");
        System.out.println(" - If this doesn't happen, it results in a tie.");

        while (true) { // Main game loop
            System.out.println("\n=========== GAME START ============");
            initializeBoard();
            displayBoard();
            System.out.println("\n--------- PLAYER " + player + "'S TURN ---------"); // Displays STARTING player

            while (true) { // Loops until a win or draw is reached
                try {
                    System.out.println("Enter your move (column and row): ");
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
                } catch (InputMismatchException exception) {
                    System.out.println("\nInvalid move, please enter an integer.\n");
                    keyboard.next(); // clear the invalid input
                    continue;
                } catch (ArrayIndexOutOfBoundsException exception) {
                    System.out.println("\nInvalid move, please enter a integer between 1-3.\n");
                    continue;
                }

                // Checks win and draw, closes game if either is true
                if (checkWin()) {
                    System.out.println("\nPlayer " + player + " wins!");
                    break;
                } else if (checkDraw()) {
                    System.out.println("\nIt's a draw!");
                    break;
                }

                switchPlayer();
            }

            // Prompts user if they want to play again
            System.out.println("====================================");
            System.out.print("Do you want to play again? (y/n): ");
            if (keyboard.next().toLowerCase().charAt(0) != 'y') {
                break;
            }

            player = 'X'; // Resets player to X
        }

        keyboard.close();
    }
}