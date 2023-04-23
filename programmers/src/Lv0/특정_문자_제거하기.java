package Lv0;

public class 특정_문자_제거하기 {
    public String solution(String my_string, String letter) {
        String result = my_string.replaceAll(letter,"");   //정규표현식 사용
        return result;
    }
}
