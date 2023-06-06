package Lv1;

import java.util.Arrays;

public class 비밀지도_v1 {

    //arr[] 배열의 각 요소를 2진수로 변환하여 temp 배열에 저장하는 함수
    public void toBinaryString(int[][] temp, int[] arr, int n){

        int row = -1;
        int col;
        for(int i=0; i<n; i++){
            row++;
            col = n;

            //arr[] 배열의 각 요소를 2진수로 변환
            while(true){
                temp[row][--col] = arr[i] % 2;    //temp 배열에 저장

                arr[i] /= 2;
                if(col-1 == 0) {
                    temp[row][--col] = arr[i];
                    break;
                }
            }
        }
    }


    public String[] solution(int n, int[] arr1, int[] arr2) {
        int[][] temp1 = new int[n][n];
        int[][] temp2 = new int[n][n];
        String[] result = new String[n];
        Arrays.fill(result, "");              //result배열 초기화

        //1. arr1[] 배열의 각 요소를 2진수로 변환하여 temp1 배열에 저장
        toBinaryString(temp1, arr1, n);

        //2. arr2[] 배열의 각 요소를 2진수로 변환하여 temp2 배열에 저장
        toBinaryString(temp2, arr2, n);


        //3. temp1[]과 temp2[]를 통해 비밀 지도 result[] 배열 생성
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(temp1[i][j]==1 || temp2[i][j]==1){
                    result[i] += "#";
                }
                else
                    result[i] += " ";
            }
        }

        return result;
    }
}
