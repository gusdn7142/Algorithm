package Lv0;

public class 모음_제거_v1 {
    public String solution(String my_string) {
        String result = my_string.replaceAll("[aeiou]","");  //aeiou 문자를 공백(””)문자로 대체
        return result;
    }
}
