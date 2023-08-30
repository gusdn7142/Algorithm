package Review.String;

import java.util.Scanner;

public class 문자열_압축_v1 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        //입력
        String str = scan.nextLine() + "#";   //문자열 입력..맨 마지막 문자 비교를 위해 "#" 문자 추가

        //변수 초기화
        char[] chArray = str.toCharArray();  //문자열 => 문자배열 변환
        int cnt=0;                           //같은 알파벳 개수

        //(같은 알파벳) 문자 압축 후 결과 출력
        for(int i=0; i<chArray.length-1; i++){

            cnt++;    //같은 알파벳 개수++

            if(chArray[i] != chArray[i+1]) {       //현재 알파벳이 다음 알파벳과 다르다면
                if(cnt == 1){                      //같은 알파벳 개수가 1개이면
                    System.out.print(chArray[i]);
                }
                else                               //그게 아니면
                    System.out.print(cnt + "" + chArray[i]);
                cnt = 0;             //같은 알파벳 개수 0으로 초기화
            }

        }

    }
}
