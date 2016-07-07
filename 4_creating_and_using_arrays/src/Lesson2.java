/*
    Declare, instantiate, initialize and use multi-dimensional array
 */
public class Lesson2 {

    public static void main(String args[]) {
       char[][] board = new char[3][3];
        /* can also be declared as:
        char[] board[]
        or
        char board[][]
         */

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

        char[][] board4 = new char[3][4];

        /*
         this is valid also. the 2nd dimension still needs to be instantiated
          */
        char[][] board5 = new char[3][];

        /* a 3d array */
        char[][][] board6;

        /* player 1 */
        board[0][0] = 'X'; // X top-left

        /* player 2 */
        board[1][1] = 'O'; // naught in the middle

        for (char[] row : board) {
            for (char column : row) {
                System.out.print(column);
            }
            System.out.println("");
        }
    }
}
