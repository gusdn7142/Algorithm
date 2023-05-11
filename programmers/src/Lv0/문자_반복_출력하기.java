package Lv0;

public class 문자_반복_출력하기 {
    public String solution(String my_string, int n) {
        String result = "";
        char[] chArray = my_string.toCharArray();

        for(int i=0; i<chArray.length; i++){
            for(int j=0; j<n; j++){
                result += chArray[i];
            }
        }

        return result;
    }
}