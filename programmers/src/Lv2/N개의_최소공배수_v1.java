package Lv2;

public class N개의_최소공배수_v1 {

    //최대공약수 계산 (유클리드 호제법 활용)
    public static int gcd(int n, int m){
        int a = Math.max(n,m);   //큰 수
        int b = Math.min(n,m);   //작은 수

        while(b != 0){
            int r = a % b;   //r이 0이 될때까지 반복
            a = b;
            b = r;
        }

        return a;
    }

    public int solution(int[] arr) {

        int result = arr[0];    //최소 공배수 초기화 (배열의 길이가 1이면 반복x)

        //1. arr[] 요소들의 최소공배수 계산
        for(int i = 1; i<arr.length; i++){

            int gcd = gcd(result, arr[i]);  //최대공약수 계산

            result = (result * arr[i]) / gcd;   //최소공배수 계산
        }

        return result;
    }
}
