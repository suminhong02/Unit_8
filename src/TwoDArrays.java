public class TwoDArrays {

    public static int maxValue(int[][] list){
        int max = list[0][0];
        for(int row = 0; row<list.length; row++){
            for(int col = 0; col<list[0].length; col++){
                if(list[row][col]>max){
                    max = list[row][col];
                }
            }
        }
        return max;
    }

    public static int sumAll(int[][] arr){
        int sum = 0;
        for(int row = 0; row<arr.length; row++){
            for(int col = 0; col<arr[0].length; col++){
                sum += arr[row][col];
            }
        }
        return sum;
    }

    public static boolean isSquare(int[][] arr){
        if(arr.length == arr[0].length){
            return true;
        }
        else{
            return false;
        }
    }
}
