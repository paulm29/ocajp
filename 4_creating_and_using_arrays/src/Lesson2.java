/**
    4.2 Declare, instantiate, initialize and use multi-dimensional array
    Topics:
        Populating multi-dimensional arrays
        Jagged arrays
 */
public class Lesson2 {

    public static void main(String args[]) {
        /*
            can also be declared as:
            char[] board[]
            or
            char board[][]
         */
       char[][] board = new char[3][3];

        /* set up the board */
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '_';
            }
        }

        /* An alternative way of constructing the board */
        char[][] board2 = {
                {'_','_','_'},
                {'_','_','_'},
                {'_','_','_'},
        };

        /* Java allows uneven, or 'jagged' arrays */
        char[][] board3 = {
                {'_',},
                {'_','_',},
                {'_','_','_'},
        };


        /*
            This is valid, however the 2nd dimension still needs to be instantiated
          */
        char[][] board4 = new char[3][];
        board4[0] = new char[3];
        board4[1] = new char[3];
        board4[2] = new char[3];
        //char[][] board5a = new char[][3]; // can't do this though
        //char[][] board5b = new char[][]; // have to actually instantiate it

        /* a 3d array */
        char[][][] board6;

        /* player 1 */
        board[0][0] = 'X'; // X top-left

        /* player 2 */
        board[1][1] = 'O'; // naught in the middle

        /*
            print the board
         */
        for (char[] row : board) {
            for (char column : row) {
                System.out.print(column);
            }
            System.out.println("");
        }
    }
}
