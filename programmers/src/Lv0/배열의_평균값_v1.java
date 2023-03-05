package Lv0;

public class 배열의_평균값_v1 {
    public double solution(int[] numbers) {
        double result = 0;

        boolean bool1 = true;
        boolean bool2 = true;
        int sum = 0;

        //numbers 배열의 모든 요소가 0과 1000사이에 있는 값이지 체크
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]<0 && 1000<numbers[i]){
                bool1 = false;
                break;
            }
            sum += numbers[i];    //numbers의 각 요소의 합을 구한다.
        }
        //numbers 배열의 길이가 1과 100사이의 값인지 체크
        bool2 = (1<=numbers.length && numbers.length<=100) ? true : false;

        //위의 조건들을 만족한다면, numbers 배열의 평균값 계산
        if(bool1 && bool2){
            result = sum/(double)numbers.length;   //numbers 배열의 평균 계산
        }

        return result;
    }
}
