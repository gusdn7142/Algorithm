package Lv0;

public class 대문자와_소문자_v2 {
    public String solution(String my_string) {

        String result = "";

        for(int i=0; i<my_string.length(); i++){
            char ch = my_string.charAt(i);
            if(ch >= 'a' && ch <= 'z') ch -= 32;
            else if(ch >= 'A' && ch <= 'Z') ch += 32;

            result += ch;
        }

        return result;
    }
}
