package Lv0;

public class 나이_출력_v1 {
    public int solution(int age) {
        int result = 0;

        if(0<age && age<=120){    //age의 값이 0초과 120미만이면
            result = 2022-age+1;  //출생연도 계산
        }

        return result;
    }
}
