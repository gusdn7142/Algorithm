package Part_4_문자열;

import java.util.Scanner;

public class 문자열_뒤집기 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        //입력
        String str = scan.nextLine();  //문자열 입력

        //변수 초기화
        char[] chArray = str.toCharArray();  //문자열 => 문자배열로 변환
        char[] reverseArray = new char[chArray.length];   //뒤집은 문자배열


        //문자 배열 값 뒤집기
        int length = chArray.length-1;           //뒤집은 값을 담기위한 문자 배열 인덱스
        for(int i=0; i<chArray.length; i++){
            reverseArray[length] = chArray[i];   //문자열 값 뒤집기
            length--;
        }

        System.out.println(reverseArray);



    }
}
