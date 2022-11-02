package Part_6_이진탐색;


import java.util.Arrays;
import java.util.Scanner;

public class 나무_자르기 {

    static int n;                             //나무의 수
    static int m;                            //가져가려고 하는 나무의 길이
    static int treeHeight[] = new int[1000000];  //나무의 수만큼의 높이들 입력

    static boolean check(int mid) {
        //treeHeight[] 배열의 값들에서 mid를 빼준 총합을 cutSum에 저장하고,
        //cutSum >= m 이면 frue 반환,
        //cutSum < m 이면 false 반환
        //주의사항 : treeHeight[i]-mid = 음수이면 pass


        Long cutSum = 0L;     //잘린 나무의 총합 (2000000000이 n개 더해질 수 있으므로 Long타입 필요!!)

        //나무 자르고 총합 구하기
        for(int i=0; i<n; i++){
            if(treeHeight[i] - mid > 0) cutSum += treeHeight[i]-mid;     //자른값이 0보다 작으면 0을 더하는데, 더하나 마나이므로 pass
        }

        if(cutSum >= m){
            return true;
        }
        else
            return false;
    }





    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        //입력
        n = scan.nextInt();   //나무의 수 입력
        m = scan.nextInt();   //가져가려고 하는 나무의 길이 입력

        for(int i=0; i<n; i++){
            treeHeight[i] = scan.nextInt();  //나무의 수만큼의 높이들 입력
        }

        Arrays.sort(treeHeight, 0 ,n);   //배열 오름차순 정렬

        int start = 0;                //start는 무조건 O를 가리키고
        int end = 2000000000;         //end는 무조건 X를 가리킴   (집으로 가져가려고 하는 나무의 길이만큼)

        while(start+1 < end ){             //start인덱스와 end인덱스가 붙을때까지 반복
            int mid = (start+end) / 2;     //중앙값(자를 값) 설정

            if(check(mid)==true){          //잘린 나무 합(cutSum)이 m보다 크거나 같으면
                start = mid;
            }
            else                          //잘린 나무 합(cutSum)이 m보다 작으면
                end = mid;
        }

        System.out.println(start);       //start값이 자를 수 있는 높이의 최댓값이다.
    }

}
