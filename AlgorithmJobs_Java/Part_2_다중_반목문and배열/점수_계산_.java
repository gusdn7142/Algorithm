package Part_2_다중_반목문and배열;

import java.util.Scanner;

public class 점수_계산_ {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        //문제의 개수 입력
        int n = scan.nextInt();

        //채점결과 입력
        int answer[] = new int[n+1];
        for(int i=1; i<=n; i++){
            answer[i] = scan.nextInt();
        }

        //점수 계산
        int score[] = new int[n+1];
        int sum = 0;
        for(int i=1; i<=n; i++){
            if(answer[i]==0) score[i]=0;   //결과가 0점이면 0점저장
            else score[i]=score[i-1]+1;    //결과가 1점이면 이전 값 + 1점 저장
            sum += score[i];
        }
        //총 점 출력
        System.out.println(sum);

    }
}
