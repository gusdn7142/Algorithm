package Part_6_이진탐색;

import java.util.Scanner;

public class 이진탐색 {

    static void binarySearch(int data[], int start, int end, int findValue){

        if(start>end) {        //기저조건...
            System.out.println("NO");
            return;
        }
        else if(start==end){     //기저조건...
            if(data[start] == findValue) { //값을 찾았으면
                System.out.println("YES");
                return;
            }
            else {   //값을 못찾았으면
                System.out.println("NO");
                return;
            }
        }
        else{

            int mid = (start+end) / 2;     //중앙값을 정함
            if(findValue==data[mid]){      //중앙의 값에서 찾는값이 있으면
                System.out.println("YES");
                return;
            }
            else if(findValue<data[mid]){    //중앙값보다 찾는 값이 작다면
                binarySearch(data, start, mid-1, findValue);  //재귀함수 호출 (start인덱스부터 중앙값 전까지의 값을 탐색)
            }
            else                             //중앙값보다 찾는값이 크다면
                binarySearch(data, mid+1, end, findValue);  //재귀함수 호출 (mid+1 인덱스부터 끝까지의 값을 탐색)

        }
    }



    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        //입력
        int n = scan.nextInt();       //정렬된 숫자의 개수 입력
        int q = scan.nextInt();       //질문의 개수 입력

        int data[] = new int[100000];           //정렬된 숫자 배열
        int findValue[] = new int[100000];      //질문(찾을) 숫자 배열

        for(int i=0; i<n; i++){
            data[i] = scan.nextInt();         //정렬된 숫자 입력
        }
        for(int i=0; i<q; i++){
            findValue[i] = scan.nextInt();         //질문 숫자 입력
        }

        for(int i=0; i<q; i++){
            binarySearch(data, 0, n-1, findValue[i]);   //재귀함수 반복
        }
    }
}
