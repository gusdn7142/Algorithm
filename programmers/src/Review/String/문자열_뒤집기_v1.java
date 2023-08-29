package Review.String;

import java.util.Scanner;

public class 문자열_뒤집기_v1 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        //입력
        String str = scan.nextLine();  //문자열 입력

        //변수 초기화
        char[] chArray = str.toCharArray();  //문자열 => 문자배열로 변환


        //문자 배열 값 뒤집기
        int length = chArray.length-1;           //뒤집은 값을 담기위한 문자 배열 인덱스
        for(int i=length; i>-1; i--){
            System.out.print(chArray[i]);  //문자열 값 뒤집어 출력
        }
    }
}
