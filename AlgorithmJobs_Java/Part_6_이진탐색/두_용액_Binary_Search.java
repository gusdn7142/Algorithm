package Part_6_이진탐색;

import java.util.Arrays;
import java.util.Scanner;

public class 두_용액_Binary_Search {

    static int n;   //전체 용액의 수

    static int binarySearch(Long value, Long arr[]){
        //start : 항상 내가 찾고 싶은값(value)보다 작은 값
        //end : 항상 내가 찾고 싶은값(value)보다 크거나 같은 값
        //내가 찾고 싶은값(value)는 0번~n-1번 인덱스의 값의 반대값으로 선정
        //최소값이 되는 두 용액값을 반환
        //-2 4 -99 1 98     //value=2라고 가정


        int start = 0;   //start : 항상 내가 찾고 싶은값(value)보다 작은 값
        int end = n-1;   //end : 항상 내가 찾고 싶은값(value)보다 크거나 같은 값

        while(start+1 < end){
            int mid = (start+end)/2;   //중앙값 설정

            //if(arr[mid]==value) return mid; //value==arr[mid]이면... arr[mid]가 0일떄를 고려!!

            if(arr[mid] < value){   //start ~ mid사이의 값은 볼 필요 없으면
                start = mid;
            }
            else   //arr[mid] >= value...  mid ~ end 사이의 값은 볼 필요 없으면
                end = mid;
        }

        // System.out.print(start + " " + end + " , ");
        //System.out.println(arr[start] + " " + arr[end]);



        if(Math.abs(value-arr[start]) < Math.abs(value-arr[end])) {
            // System.out.print("start는 " + start + " , " + "end는" + end + " / ");
            if(-value != arr[start]) return start;
            else return end;

        }
        else {
            // System.out.print("start는 " + start + " , " + "end는" + end + " / ");
            if(-value != arr[end]) return end;
            else return start;
        }


    }




    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        //입력
        n = scan.nextInt();   //전체 용액 수

        Long arr[] = new Long[100000];  //용액 값 저장 배열

        for(int i=0; i<n; i++){
            arr[i] = scan.nextLong();  //용액값 입력
        }
        //System.out.println();


        //용액값 내림차순 정렬
        Arrays.sort(arr,0,n-1);    //arr[] 배열을 오름차순으로 정렬 (data, 시작인덱스, 종료인덱스)

        //정렬한 용액값 출력
        // for(int i=0; i<n; i++){
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();

        // System.out.println("start는 " + start + ", end는" + end);

        Long min = 2000000001L;     //두 용액의 합의 최소값
        Long firstNum=0L;          //출력 용액값1
        Long secondNum=0L;         //출력 용액값2

        for(int i=0; i<n; i++){

            Long value = arr[i] * -1;             //내가 찾고 싶은값(value) 설정.. arr[i]의 반대부호
            int idx = binarySearch(value, arr);  //용액의 최소값의 인덱스 반환

            Long sum = Math.abs(arr[i] + arr[idx]);   //두 용액의 합

            //System.out.println("idx는" + idx + ", sum은" + sum );
            if(sum < min){  //두 용액의 합과 최소값 비교
                min = sum;                       //용액값의 합 변경
                firstNum = arr[i];              //용액값 1`
                secondNum = arr[idx];          //용액값 2
            }
        }
        System.out.println(firstNum + " " + secondNum);   //두 용액값 출력


    }

}
