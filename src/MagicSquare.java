/**
 * This class determines if a square grid of any size is a magic square which has the same number of rows and columns and the sum of each rows, columns, and diagonal lines should be equal.
 * @author Sumin Hong
 * @since 4/3/2020
 */
public class MagicSquare {
    private int[][] grid;

    public MagicSquare(int[][] g) {
        grid = g;
    }


    public int rowSum(int row) {
        // <<< Complete the code >>>
        int sum = 0;

            for(int col = 0; col<grid[row].length; col++){
                sum += grid[row][col];
            }
            return sum;
    }


    public int colSum(int col) {
        // <<< Complete the code >>>
        int sum = 0;

        for(int row = 0; row<grid.length; row++){
            sum += grid[row][col];
        }
        return sum;
    }


    public int upDiagSum() {
        // <<< Complete the code >>>
        int sum = 0;
        int row = grid.length-1;
        int col = 0;
        for(int i = 0; i<grid.length; i++){
            sum += grid[row][col];
            row--;
            col++;
        }
        return sum;
    }


    public int downDiagSum() {
        // <<< Complete the code >>>
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            sum += grid[i][i];
        }
        return sum;
    }


    public boolean isMagicSquare() {
        // <<< Complete the code >>>
        int row = grid.length;
        int col = grid[row].length;
        if(rowSum(row) == colSum(col) && colSum(col) == upDiagSum() && upDiagSum() == downDiagSum()){
            return true;
        }
        else{return false;}
    }


    /**
     * This method is complete. You do not need to provide additional
     * comments here.
     */
    public void printGrid() {
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                System.out.print(grid[row][col] + "\t");
            }
            System.out.println("");
        }
    }
}

