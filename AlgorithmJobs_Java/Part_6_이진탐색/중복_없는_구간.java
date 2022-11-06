package Part_6_이진탐색;

import java.util.Scanner;

public class 중복_없는_구간 {

    static int n;     //숫자의 개수
    static int arr[];  //n개의 숫자


    static boolean check(int interval) {
        //interval 만큼의 구간길이에서 중복이 있는지 체크하는 함수

        int start = 1;              //시작 인덱스

        int[] cnt = new int[n + 1];  //입력한 숫자에서 중복 숫자 카운트 하기 위한 배열
        int check = 0;              //중복 숫자 카운트 변수

        //interval만큼의 구간 첫 체크
        for (int i = start; i < start + interval; i++) {
            cnt[arr[i]]++;
        }

        //중복되는 숫자가 있는지 체크
        for (int i = 1; i <= n; i++) {
            if (cnt[i] >= 2) check++;
        }


        //중복되는 구간이 없으면
        if (check == 0) {
            return true;
        }


        // 1부터 5까지 검사가 끝났다면
        // 2부터 6까지 검사 시작을 위한 반복문
        // 첫 요소에 대한 갯수는 1 감소하고 새로 들어온 요소에 대한 갯수는 1 증가
        while(start + interval < n) {

            cnt[arr[start]]--;            //start 카운트는 빼주고
            if(cnt[arr[start]] >= 1) {    //start 카운트가 2개 이상이였다면 check--
                check--;
            }

            start++;   //start인덱스 ++

            cnt[arr[start + interval - 1]]++;                //arr[start + interval - 1] 인덱스 ++
            if(cnt[arr[start + interval - 1]] >= 2) check++;  //cnt[arr[start + interval - 1]]의 값이 2 이상이면(중복값이 있으면) check+=

            if(check == 0) return true;                        //중복값이 없으면 해당 길이가 성립하므로 true 반환
        }
        return false;   //구간길이에 대해 모두 체크한 결과 중복값이 있으므로 false 반환
    }



    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        //입력
        n = scan.nextInt();  //숫자의 개수

        arr = new int[n+1];
        for(int i=1; i<=n; i++){     //n개의 숫자 입력
            arr[i] = scan.nextInt();
        }


        int start = 1;  //이진탐색 시작 인덱스
        int end = n;    //이진탐색 끝 인덱스

        //   if (!check(start)) {  //false이면 1 이하일때 중복이 있는것이므로 1 출력
        //   System.out.println("1");
        //   return;
        // }
        if (check(end)==true) {   //true이면 end이하 일떄 중복이 없는것이기 떄문에 end 출력
            System.out.println(end);
            return;
        }


        while (start + 1 < end) {           //start와 end가 붙어있을때까지 반복
            int mid = (start + end) / 2;    //중앙값 설정

            if (check(mid)==true) {  //true이면 mid이하 일때 중복이 없는것이기 떄문에 start=mid
                start = mid;
            } else {           //false이면 mid이하 일때 중복이 있는것이므로 end=mid
                end = mid;
            }
        }

        System.out.println(start);   //중복이 없을때의 최대 구간 길이

    }
}
