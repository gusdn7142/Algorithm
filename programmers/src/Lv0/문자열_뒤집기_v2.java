package Lv0;

public class 문자열_뒤집기_v2 {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        sb.append(my_string);
        sb.reverse();

        return sb.toString();
    }
}
