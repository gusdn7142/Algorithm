package Part_4_문자열;

import java.util.Scanner;

public class 팰린드롬_조사 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        //입력
        String str = scan.nextLine();

        //변수 초기화
        char[] chArray = str.toCharArray();          //문자열 => 문자배열 변환
        int length = chArray.length - 1;           //chArray[] 배열의 길이

        //팰린드롬 판별
        for(int i=0; i<chArray.length; i++){

            if(chArray[i] != chArray[length]){
                System.out.println("NO");
                System.exit(0);
                //flag = true;
            }
            length--;

        }

        System.out.println("YES");
    }
}
