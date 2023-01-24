package Lv2;

import java.util.Arrays;

public class 최솟값_만들기 {
    public int solution(int []A, int []B) {

        Arrays.sort(A);  //A배열을 오름차순으로 정렬
        Arrays.sort(B);  //B배열을 오름차순으로 정렬

        int sum=0; //누적합을 저장할 변수

        //A배열은 0번 인덱스부터, B배열은 마지막 인덱스부터 조회하여 곱한 값의 누적합을 구한다.
        for(int i=0; i<B.length; i++){
            sum += A[i] * B[B.length-i-1];
        }
        
        return sum;
    }
}
