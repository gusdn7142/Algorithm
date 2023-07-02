package Lv2;

import java.util.HashSet;

public class 전화번호_목록_v2 {
    public boolean solution(String[] phone_book) {
        boolean result = true;   //접두어 여부 헤크 (O : false, X : true)

        HashSet<String> set = new HashSet<>();

        for(int i=0; i<phone_book.length; i++){
            set.add(phone_book[i]);
        }

        //1. phone.substring을 접두어로 사용한 경우가 set에 있다면 false를 반환
        for(String phone : phone_book){
            for(int i=0; i<phone.length(); i++){

                if(set.contains(phone.substring(0,i))){
                    result = false;
                    break;
                }
            }
        }


        return result;
    }
}
