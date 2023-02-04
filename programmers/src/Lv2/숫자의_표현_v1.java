package Lv2;

public class 숫자의_표현_v1 {

    public int solution(int n) {

        int answer = 0;    //연속된 자연수들로 n을 표현하는 경우의 수

        //1부터 n까지 반복하면서 연속되는 수의 합이 n이 될때의 경우의 수를 구한다.
        for(int i=1; i<=n; i++){

            int sum=0;          //연속된 수의 합을 저장하는 변수
            for(int j=i; j<=n; j++){

                sum += j;
                if(sum==n){    //연속된 수의 합이 n과 같으면
                    answer++;  //경우의 수 카운트 증가
                    break;
                }
                else if(sum > n){    //연속된 수의 합이 n보다 크면
                    break;
                }
            }

        }

        return answer;   //연속된 자연수들로 n을 표현하는 경우의 수 반환
    }
}
