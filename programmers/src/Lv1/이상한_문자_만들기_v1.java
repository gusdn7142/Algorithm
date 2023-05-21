package Lv1;

public class 이상한_문자_만들기_v1 {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();

        //문자열을 공백 단위로 분리
        String str[] = s.split(" ", -1);

        //분리된 문자열에서 짝수 인덱스는 대문자로, 홀수 인덱스는 소문자로 변환
        for(int i=0; i<str.length; i++){
            String splitStr = str[i];

            for(int j=0; j<splitStr.length(); j++){
                char alpha = splitStr.charAt(j);
                if(j%2==0)
                    sb.append(Character.toUpperCase(alpha));
                else
                    sb.append(Character.toLowerCase(alpha));
            }
            if(i==str.length-1) break;
            sb.append(" ");
        }

        return sb.toString();
    }
}
