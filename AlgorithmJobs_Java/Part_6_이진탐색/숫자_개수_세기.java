package Part_6_이진탐색;

import java.util.Arrays;
import java.util.Scanner;

public class 숫자_개수_세기 {

    static int n;  //숫자 개수
    static int data[] = new int[1000000];  //숫자 배열

    static int getStartPoint(int findValue){

        int start=0;  //start는 항상 findValue(ex, mid)보다 작은 값을 가리킨다.
        int end=0;   //end는 항상 findValue(ex, mid)보다 크거나 같은 값을 가리킨다.

        if(findValue > data[0]) {  //찾는 값이 0번 인덱스 값보다 크다면
            start = 0;
        }  //불필요
        else if(findValue < data[0]) {  //찾는 값이 0번 인덱스 값보다 작다면
            return -1;
        }
        else if(findValue == data[0]){    //찾는 값이 0번 인덱스 값과 같다면
            return 0;   //시작 인덱스로 0 반환
        }

        if(findValue <= data[n-1]) {  //찾는 값이 마지막 인덱스 값보다 작거나 같다면
            end = n-1;
        }   //불필요
        else if(findValue > data[n-1]) {  //찾는 값이 마지막 인덱스 값보다 크다면
            return -1;
        }



        while(start+1 < end){  //start와 end가 붙어있지 않다면

            int mid = (start+end) / 2;

            if(findValue > data[mid]) { //찾는 값이 mid번쨰 값보다 크다면
                start = mid;
            }  //찾는 값이 mid번쨰 값보다 작거나 같다면
            else end = mid;

        }

        if(data[end] == findValue){   //end번쨰 값이 찾는 값의 시작인덱스이면
            return end;
        }
        else   //end번쨰 값이 찾는값이 아니면
            return -1;
    }



    static int getEndPoint(int findValue){

        int start=0;  //start는 항상 findValue(ex, mid)보다 작거나 같은 값을 가리킨다.
        int end=0;   //end는 항상 findValue(ex, mid)보다 큰 값을 가리킨다.


        if(findValue >= data[0]) {  //찾는 값이 0번 인덱스 값보다 크거나 같다면
            start = 0;
        }  //불필요
        else if(findValue < data[0]) {  //찾는 값이 0번 인덱스 값보다 작다면
            return -1;
        }


        if(findValue < data[n-1]) {  //찾는 값이 마지막 인덱스 값보다 작다면
            end = n-1;
        }   //불필요
        else if(findValue > data[n-1]) {  //찾는 값이 마지막 인덱스 값보다 크다면
            return -1;
        }
        else if(findValue == data[n-1]){    //찾는 값이 마지막 인덱스 값과 같다면
            return n-1;   //끝 인덱스로  n-1 반환
        }


        while(start+1 < end){  //start와 end가 붙어있지 않다면 반복

            int mid = (start+end) / 2;

            if(findValue >= data[mid]) { //찾는 값이 mid번째 값보다 크거나 같으면
                start = mid;
            }  //찾는 값이 mid번쨰 작으면
            else end = mid;
        }

        if(data[start] == findValue){   //start번쨰 값이 찾는값의 끝 인덱스이면
            return start;
        }
        else   //start번쨰 값이 찾는값이 아니면
            return -1;
    }




    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        //입력
        n = scan.nextInt();   //숫자 개수 입력
        int q = scan.nextInt();   //질문 개수 입력


        for(int i=0; i<n; i++){
            data[i] = scan.nextInt();  //숫자를 배열에입력
        }

        Arrays.sort(data,0,n);  //data[] 배열을 오름차순으로 정렬 (data, 시작인덱스, 종료인덱스)

        int findValue[] = new int[q];   //찾아야 할 수 배열

        for(int i=0; i<q; i++){
            findValue[i] = scan.nextInt();  //찾아야할 숫자 입력
        }



        // //정렬된 배열 출력해보기
        // for(int i=0; i<n; i++){
        //     System.out.print(data[i] + " ");
        // }


        for(int i=0; i<q; i++){
            int startIndex = getStartPoint(findValue[i]);  //찾고자 하는 값의 시작점 반환
            int endIndex = getEndPoint(findValue[i]);      //찾고자 하는 값의 끝점 반환

            if(startIndex == -1) {           //시작점에 찾는 값이 없으면 (값이 아예 없으므로 0 출력)
                System.out.println("0");
            }
            else                        //시작점에 찾는 값이 있으면 (몇개의 값이 있는지 출력)
                System.out.println(endIndex -startIndex +1);
        }


        // System.out.println();
        // System.out.println(start);
        // System.out.println(end);
    }
}
