public class ArrayCalculations {
    public static int rowSum(int[][] arr, int row) {

        int total = 0;

        if(row<0 || row>arr.length){
            return -1;
        }
        else{
            for(int col = 0; col<arr[row].length; col++){
                total += arr[row][col];
            }
            return total;
        }
    }

    public static int columnSum(int[][] arr, int col) {
        int total = 0;

        if (col < 0 || col > arr[0].length) {
            return -1;
        } else {
            for (int row = 0; row < arr.length; row++) {
                total += arr[row][col];
            }
            return total;
        }
    }

    public static int diagonalSum(int[][] arr, int direction) {
        int sum = 0;

        if(direction == 0){
           for(int i = 0; i<arr.length; i++){
               sum += arr[i][i];
           }
        }
       else if(direction == 1){
           int row = arr.length-1;
           int col = 0;
           for(int i = 0; i<arr.length; i++){
               sum += arr[row][col];
               row--;
               col++;
           }
        }
       else{
           return -1;
        }
       return sum;
    }


}
