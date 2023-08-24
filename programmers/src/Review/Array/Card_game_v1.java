package Review.Array;

import java.util.Scanner;

public class Card_game_v1 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        //1. 카드 배열 a와 b 입력
        int a_score[] = new int[10];
        int b_score[] = new int[10];

        for(int i=0; i<10; i++) a_score[i] = scan.nextInt();
        for(int i=0; i<10; i++) b_score[i] = scan.nextInt();

        //카운트 변수 초기화
        int a_cnt=0;
        int b_cnt=0;

        //2. 각 라운드 진행 후 승자 확인
        for(int i=0; i<10; i++){

            int a = a_score[i];
            int b = b_score[i];

            if(a>b){  //a가 승자일 경우
                a_cnt++;
            }
            else if(b>a) {//b가 승자일 경우
                b_cnt++;
            }
            //else  //a와 b의 카드가 같은 경우
        }

        //3. 게임 승자 출력
        if(a_cnt > b_cnt){
            System.out.println("A");
        }
        else if(b_cnt > a_cnt){
            System.out.println("B");
        }
        else
            System.out.println("D");

    }
}
