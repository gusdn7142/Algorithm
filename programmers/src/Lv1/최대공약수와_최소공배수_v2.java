package Lv1;

public class 최대공약수와_최소공배수_v2 {
    public int[] solution(int n, int m) {

        //1. 최대 공약수 계산 : 유클리드 호제법
        int a = Math.max(n, m);     //큰 수
        int b = Math.min(n, m);     //작은 수

        while (b != 0) {
            int r = a % b;    //r이 0이 될때까지 반복
            a = b;
            b = r;
        }

        //2. 최소 공배수 = 두 수의 곱 / 최대공약수
        int[] result = new int[]{a, n * m / a };
        return result;
    }
}
