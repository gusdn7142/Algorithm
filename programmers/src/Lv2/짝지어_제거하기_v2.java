package Lv2;

import java.util.ArrayList;
import java.util.List;

public class 짝지어_제거하기_v2 {
    public int solution(String str) {
        int result = 1;   //짝지어 제거하기 성공 유무
        List<Character> list = new ArrayList<>();

        //1. str의 요소를 list에 넣고 짝을 확인하며 list 값 제거
        for(int i=0; i<str.length(); i++){
            char alpha = str.charAt(i);

            if(list.size()==0) {    //list가 비어 있으면 알파벳 추가
                list.add(alpha);
                continue;
            }

            if(list.get(list.size()-1)==alpha)  //짝이 맞으면 알파벳 제거
                list.remove(list.size()-1);
            else{                    //짝이 맞지 않으면 알파벳 추가
                list.add(alpha);
            }
        }

        if(list.size() > 0)  //list에 알파벳이 남아있으면
            result = 0;

        return result;
    }
}
