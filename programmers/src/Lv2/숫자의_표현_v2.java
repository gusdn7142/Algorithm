package Lv2;

public class 숫자의_표현_v2 {

    //정수론 정리 활용 : 주어진 자연수를 연속된 자연수의 합으로 표현하는 방법의 수는 주어진 수의 홀수 약수의 개수와 같다
    public int solution(int n) {
        int answer = 0;    //연속된 자연수들로 n을 표현하는 경우의 수

        for(int i=1; i<=n; i+=2){

            if(n%i==0){     //n이 i로 나누어 떨어지면
                answer++;    //경우의 수 카운트 증가
            }
        }

        return answer;   //연속된 자연수들로 n을 표현하는 경우의 수 반환
    }

}
