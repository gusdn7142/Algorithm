package Part_6_이진탐색;

import java.util.Arrays;
import java.util.Scanner;

public class 두_용액_Two_Pointer {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);


        //입력
        int n = scan.nextInt();   //전체 용액 수

        final int MAX = 100000;
        int arr[] = new int[MAX];  //용액 값 저장 배열

        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();  //용액값 입력
        }
        //System.out.println();


        //용액값 오름차순 정렬
        Arrays.sort(arr,0,n);    //arr[] 배열을 오름차순으로 정렬 (data, 시작인덱스, 종료인덱스)

        //정렬한 용액값 출력
        // for(int i=0; i<n; i++){
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();



        int start = 0;   //start 포인터
        int end = n-1;   //end 포인터

        int minStart = start;    //출력 start 포인터, 초기값 0
        int minEnd = end;          //출력 end 포인터, 초기값 n-1
        int minSum = Integer.MAX_VALUE;   //start와 end 포인터 합계값 기록

        //용액값을 구하는 Two Pointer 로직
        while(start < end){          //left가 right랑 같아지면 반복문 탈출
            int sum = arr[start] + arr[end]; //start와 end의 합 기록

            if(Math.abs(sum) < minSum){      //start와 end의 합의 절대값이 minSum보다 작으면
                minStart = start;        //start를 출력 start 포인터에 기록
                minEnd = end;           //end를 출력 end 포인터에 기록
                minSum = Math.abs(sum);  //start와 end 합의 절대값 기록
            }

            if(sum<0) start++;
            else if(sum>=0) end--;
            else break;    //sum이 0이면 반복문 탈출!!

        }

        System.out.println(arr[minStart]+ " " + arr[minEnd]);

    }
}
