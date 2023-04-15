package Lv0;

public class 문자열_뒤집기_v1 {
    public String solution(String my_string) {
        String answer = "";

        if(1<=my_string.length() && my_string.length()<=1000){
            for(int i=my_string.length()-1; i>=0; i--){
                answer += my_string.charAt(i);
            }
        }

        return answer;
    }
}
