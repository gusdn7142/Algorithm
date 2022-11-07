package Part_3_완전탐색;

import java.util.Scanner;

public class Baseball_game {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        //입력
        int n = scan.nextInt();          //민혁이의 질문 횟수

        //변수 초기화
        int arr[][] = new int[n][3];   //[민혁이의 질문 횟수][민혁이의 세자리 수,스트라이크 개수,볼 개수] 저장용도
        int cnt = 0;                  //n개의 민혁이의 세자리 수에서 영수의 세자리 수와 스트라이크와 볼의 개수가 같은 횟수


        //arr[n][3] 배열에 [민혁이의 질문 횟수][민혁이의 세자리 수,스트라이크 개수,볼 개수] 저장
        for(int i=0; i<n; i++){
            arr[i][0] = scan.nextInt();      //민혁이의 세자리 수 입력
            arr[i][1] = scan.nextInt();      //스트라이크 수 입력
            arr[i][2] = scan.nextInt();      //볼 수 입력
        }

        //영수가 입력한 세자리 수의 스트라이크와 볼의 수를 예측하기 위해 1부터 9까지의 3번 반
        for(int i=1; i<=9; i++){
            for(int j=1; j<=9; j++){
                for(int k=1; k<=9; k++){
                    if(i!=j && j!=k && i!=k) {        //i와 j와 k가 서로 다른 수라면

                        boolean flag = true;     //n개의 세 자리 수와 영수의 세 자리수의 스트라이크와 볼 수가 같은지 확인 (true:같음, false:다름)

                        for(int p=0; p<n; p++){       //민혁이의 질문 횟수(n)만큼 반복
                            int first = arr[p][0] / 100;   //민혁이의 세자리 수중에 백의자리 값
                            int second = (arr[p][0] / 10) % 10;   //민혁이의 세자리 수중에 십의자리 값
                            int third = arr[p][0] % 10;   //민혁이의 세자리 수중에 일의자리 값

                            int strike = 0;
                            int ball = 0;

                            //스트라이크 수 파악
                            if(first == i) strike++;
                            if(second == j) strike++;
                            if(third == k) strike++;

                            //볼 수 파악
                            if(first == j || first == k) ball++;
                            if(second == i || second == k) ball++;
                            if(third == i || third == j) ball++;

                            //n개의 세자리수에서, 영수의 스트라이크 수 혹은 볼의 수가 입력받은 스트라이크 수, 볼의 수와 같지 않다면
                            if(arr[p][1] != strike || arr[p][2] != ball) {
                                flag = false;
                            }
                        }

                        if(flag == true) cnt++;
                    }
                }
            }
        }

        System.out.println(cnt);  //n개의 민혁이의 수에서 영수의 세자리 수와 스트라이크와 볼의 개수가 같은 횟수 출력

    }
}
