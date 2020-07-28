package hackerRankPractice.thirtyDayChallenge.ticTacToeApplication;

public class TicTacToe {

    /*

    picture of game with index:

    for storage:

    0 | 1 | 2
    _________
    3 | 4 | 5
    _________
    6 | 7 | 8

    * linear array with 9 slots or indices

    what the user thinks:

    1 | 2 | 3
    _________
    4 | 5 | 6
    _________
    7 | 8 | 9

    UI picture of the game:

    INIT:

    - | - | -
    _________
    - | - | -
    _________
    - | - | -

    GAMEPLAY:

    0 | - | 0
    _________
    - | X | -
    _________
    - | - | X

    */

    protected char[] board;
    protected char userMarker;
    protected char aiMarker;
    protected char winner;
    protected char currentMarker;

    public TicTacToe(char playerToken, char aiMarker) {
        this.userMarker = playerToken;
        this.aiMarker = aiMarker;
        this.winner = '-';
        this.board = setBoard();
        this.currentMarker = userMarker;
    }

    public static char[] setBoard() {
        char[] board = new char[9];
        for (int i = 0; i < board.length; i++) {
            // setting the board to default blank
            board[i] = '-';
        }
        return board;
    }

    public boolean playTurn(int spot) {
        // spot that user wants to play
        boolean isValid = withinRange(spot) && !isSpotTaken(spot);
        if (isValid) {
            // playing turn if valid
            board[spot - 1] = currentMarker;
            //
            currentMarker = (currentMarker == userMarker) ? aiMarker : userMarker;
            // condition in the middle in parentheses
            // if current marker equal to user marker, then make current marker AI marker
            // otherwise make the current marker equal the user marker
        }
        return isValid;
    }

    // check if our spot is in range
    public boolean withinRange(int number) {
        return number > 0 && number < board.length + 1;
        // will return whether conditions above are true
    }

    // check if the spot is taken
    public boolean isSpotTaken(int number) {
        return board[number - 1] != '-';
    }

    // method to print out board
    public void printBoard() {
//        attempting to create this:
//              - | - | -
//              _________
//              - | - | -
//              _________
//              - | - | -
        System.out.println();
        for (int i = 0; i < board.length; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println();
                System.out.println("_________");
            }
            System.out.println(" | " + board[i]);
        }
        System.out.println();
    }

    public static void printIndexBoard() {
        System.out.println();
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println();
                System.out.println("_________");
            }
            System.out.println(" | " + (i + 1));
        }
        System.out.println();
    }

    public boolean isThereAWinner() {
        // using a lot of helper functions, 3 booleans
        // boolean for diagonal and middle rows
        boolean diagonalsAndMiddles = (rightDiagonal() || leftDiagonal() || middleRow() || secondColumn())
                && board[4] != '-';
        // boolean for top row and first column
        boolean topAndFirst = (topRow() || firstColumn()) && board[0] != '-';
        // boolean for bottom row and third column
        boolean bottomAndThird = (bottomRow() || thirdColumn()) && board[8] != '-';
        if (diagonalsAndMiddles) {
            this.winner = board[4];
        } else if (topAndFirst) {
            this.winner = board[0];
        } else if (bottomAndThird) {
            this.winner = board[8];
        }
        return diagonalsAndMiddles || topAndFirst || bottomAndThird;  // || or
    }

    private boolean topRow() {
        return board[0] == board[1] && board[1] == board[2];
    }

    public boolean middleRow() {
        return board[3] == board[4] && board[4] == board[5];
    }

    public boolean bottomRow() {
        return board[6] == board[7] && board[7] == board[8];
    }

    public boolean firstColumn() {
        return board[0] == board[3] && board[3] == board[6];
    }

    public boolean secondColumn() {
        return board[1] == board[4] && board[4] == board[7];
    }

    public boolean thirdColumn() {
        return board[2] == board[5] && board[5] == board[8];
    }

    public boolean leftDiagonal() {
        return board[6] == board[4] && board[4] == board[2];
    }

    public boolean rightDiagonal() {
        return board[0] == board[4] && board[4] == board[8];
    }

    public boolean isTheBoardFilled() {
        for (int i = 0; i < board.length; i++) {
            if (board[i] == '-') {
                return false;
            }
        }
        return true;
    }

    public String gameOver() {
        boolean didSomeoneWin = isThereAWinner();
        if (didSomeoneWin) {
            return "We have a winner! The winner is " + this.winner + "'s";
        } else if (isTheBoardFilled()) {
            return "Draw: Game Over!";
        } else {
            return "notOver";
        }
    }
}
























