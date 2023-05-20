package Lv1;

public class 행렬의_덧셈_v1 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] result = new int[arr1.length][arr1[0].length];

        for(int row=0; row<arr1.length; row++){
            for(int col=0; col<arr1[row].length; col++){
                result[row][col] = arr1[row][col] + arr2[row][col];
            }
        }

        return result;
    }
}
