package Lv1;

public class 수박수박수박수박수박수_v2 {
    public String solution(int n) {
         StringBuilder sb = new StringBuilder();

         for(int i=1; i<=n; i++){
             sb.append(i % 2 ==0 ? "박" : "수");
         }

         return sb.toString();
     }
}
