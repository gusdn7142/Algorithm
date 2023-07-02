package Lv2;

import java.util.Arrays;

public class 전화번호_목록_v1 {
    public boolean solution(String[] phone_book) {
        boolean result = true;   //접두어 여부 헤크 (O : false, X : true)
        Arrays.sort(phone_book);   //phone_book 배열 오름차순 정렬

        //1. phone_book[i]를 접두어로 사용한 경우가 있다면 false를 반환
        for(int i=0; i<phone_book.length-1; i++){
            if(phone_book[i+1].startsWith(phone_book[i]) ){
                result = false;
                break;
            }
        }


        return result;
    }
}
