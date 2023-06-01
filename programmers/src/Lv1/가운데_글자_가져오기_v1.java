package Lv1;

public class 가운데_글자_가져오기_v1 {
    public String solution(String str) {

        StringBuilder sb = new StringBuilder();
        int length = str.length();

        if(length % 2 ==0){      //str의 길이가 짝수이면
            sb.append(str.charAt(length/2-1));
            sb.append(str.charAt(length/2));
        }
        else  //str의 길이가 홀수이면
            sb.append(str.charAt(length/2));


        return sb.toString();
    }
}
