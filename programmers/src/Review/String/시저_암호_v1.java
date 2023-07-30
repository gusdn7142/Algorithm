package Review.String;

public class 시저_암호_v1 {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();

        //알파벳을 n만큼 증가
        for(char alpha : s.toCharArray()){  //문자열에서 알파벳을 하나씩 조회

            if(alpha==' ') sb.append(alpha);

            if(alpha >= 'A' && alpha <= 'Z') {              //대문자이면 (65 ~ 90)
                alpha = (char) ('A' + (alpha-'A'+n) % 26);  //알파벳 대문자 개수 : 26
                sb.append(alpha);
            }

            if(alpha >= 'a' && alpha <= 'z') {              //소문자이면 (97 ~ 122)
                alpha = (char) ('a' + (alpha-'a'+n) % 26);  //알파벳 소문자 개수 : 26
                sb.append(alpha);
            }
        }

        return sb.toString();
    }
}
