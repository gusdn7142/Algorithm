package Review.Array;

public class 행렬의_곱셈_v1 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] result = new int[arr1.length][arr2[0].length];

        for(int i=0; i<result.length; i++) {   //result의 row
            for(int j=0; j<result[0].length; j++) {  //result의 column
                for(int k=0; k<arr1[0].length; k++)  {  //arr1의 column와 arr2의 row
                    result[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        return result;
    }
}
