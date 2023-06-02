package Lv1;

public class 수박수박수박수박수박수_v1 {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();

        for(int i=1; i<=n; i++){
            if(i % 2 ==0)     //짝수이면
                sb.append("박");
            else             //홀수이면
                sb.append("수");
        }

        return sb.toString();
    }
}
