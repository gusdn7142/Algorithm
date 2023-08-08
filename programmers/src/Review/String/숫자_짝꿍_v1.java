package Review.String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 숫자_짝꿍_v1 {
    public String solution(String X, String Y) {
        String result = "";                             //짝궁 문자열
        List<String> list = new ArrayList<>();
        StringBuilder sbY = new StringBuilder(Y);

        //1. 짝궁이 될 숫자 구하기
        for(char ch : X.toCharArray()){

            //X문자열의 요소가 Y문자열에 존재하면 list에 입력
            int idx = sbY.indexOf(ch+"");
            if(idx==-1) continue;

            list.add(sbY.charAt(idx)+"");
            sbY.deleteCharAt(idx);

        }


        //2. 짝궁(최대 숫자 조합)으로 만들기
        Collections.sort(list, Collections.reverseOrder());   //list 내림차순 정렬
        if(list.size()==0)   //짝궁이 존재하지 않으면 "-1" 반환
            return "-1";

        int zeroCnt = 0;
        for(String str : list){
            if(str.equals("0")) {
                zeroCnt++;
            }
            result += str;         //String 타입 짝궁 생성
        }

        if(zeroCnt==list.size())   //짝궁이 "0"으로만 구성되어 있으면 "0" 반환
            result = "0";

        return result;
    }
}
