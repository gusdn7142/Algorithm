package Lv0;

public class 모음_제거_v2 {
    public String solution(String my_string) {
        String[] alphas = new String[]{"a", "e", "i", "o", "u"};   //모음 알파벳 초기화

        for(String alpha : alphas){
            if(my_string.contains(alpha)){                //my_string 문자열에 alpha가 포함되어 있으면
                my_string = my_string.replace(alpha, "");    //my_string 문자열에서 alpha 문자열을 ""로 대체
            }
        }

        return my_string;
    }
}
