package Lv0;

public class 순서쌍의_개수_v1 {
    public int solution(int n) {
        int result = 0;

        for(int i=1; i<=n; i++) {
            if(n%i==0) {
                result++;
            }
        }

        return result;
    }
}
