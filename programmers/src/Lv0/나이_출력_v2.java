package Lv0;

import java.time.LocalDate;

public class 나이_출력_v2 {
    public int solution(int age) {
        int result = 0;
        LocalDate today = LocalDate.now();     //현재 연도 반환 (2023)

        if(0<age && age<=120){                 //age의 값이 0초과 120미만이면
            result = today.getYear()-1-age+1;  //출생연도 계산
        }

        return result;
    }
}
