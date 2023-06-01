package Lv1;

public class 가운데_글자_가져오기_v2 {
    public String solution(String str) {

        String result = "";
        int length = str.length();

        if(length % 2 ==0){      //str의 길이가 짝수이면
            result = str.substring(length/2-1, length/2+1);
        }
        else  //str의 길이가 홀수이면
            result = str.substring(length/2, length/2+1);


        return result;
    }
}
