package Lv0;

public class 중앙값_구하기_v2 {
    public int solution(int[] array) {
        int result = 0;

        //1. array[] 배열 선택 정렬
        for(int i=0; i<array.length-1; i++) {
            int minIndex = i;   //최소값 인덱스

            for(int j=i+1; j<array.length; j++) {
                if(array[j] < array[minIndex]) {   //최소값 구하기
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];    //minIndex번째 배열 값에 i번째 배열 값 대입
            array[i] = temp;               //i번째 배열 값에 최소값 대입
        }

        //2. array[] 배열의 중앙값 조회
        result = array[array.length/2];    //중앙값 조회


        return result;
    }
}
