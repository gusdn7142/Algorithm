package Lv2;

public class N개의_최소공배수_v2 {

    //최대공약수 계산
    public static int gcd(int a, int b){
        if (a > b)
            return (a % b == 0) ? b : gcd(b, a % b);
        else
            return (b % a == 0) ? a : gcd(a, b % a);
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
