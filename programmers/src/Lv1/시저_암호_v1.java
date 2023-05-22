package Lv1;

public class 시저_암호_v1 {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length(); i++){  //문자열에서 알파벳을 하나씩 조회
            char alpha = s.charAt(i);

            //알파벳을 n만큼 증가
            for(int j=0; j<n; j++){  //n만큼 알파벳 증가
                if(alpha==' ') break;

                if(alpha >= 'A' && alpha <= 'Z') { //대문자이면 (65 ~ 90)
                    alpha++;
                    if(alpha == '[') { //대문자를 넘어서면
                        alpha = 'A';
                    }
                }

                if(alpha >= 'a' && alpha <= 'z') { //소문자이면 (97 ~ 122)
                    alpha++;
                    if(alpha == '{') {  //소문자를 넘어서면
                        alpha = 'a';
                    }
                }
            }

            sb.append(alpha);
        }


        return sb.toString();
    }
}
