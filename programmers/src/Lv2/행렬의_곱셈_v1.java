package Lv2;

public class 행렬의_곱셈_v1 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] result = new int[arr1.length][arr2[0].length];

        for(int row1=0; row1<arr1.length; row1++){                //row1 증가
            int index = 0;
            int row2 = 0;
            for(int col1=0; col1<arr2[row2].length; col1++){      //col1 증가
                for(int i=0; i<arr2.length; i++){           //col1과 row2 증가
                    result[row1][col1] += arr1[row1][i] * arr2[i][index];
                }
                index++;
                //System.out.print(result[row1][col1] + " ");
            }
            //System.out.println();
            row2++;
        }

        return result;
    }
}
