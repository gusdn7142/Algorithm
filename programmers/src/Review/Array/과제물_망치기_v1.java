package Review.Array;

import java.util.Scanner;

public class 과제물_망치기_v1 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        //입력
        String str = scan.nextLine();    //문자열 입력

        //변수 초기화
        char[] ch = str.toCharArray();   //문자열-> 문자배열로 변환

        //문자 배열에서 공백(' ')를 제외하고 출력
        for(int i=0; i<ch.length; i++){
            if(ch[i] != ' '){            //문자배열의 요소가 공백(' ')이 아니라면
                System.out.print(ch[i]);
            }
        }

    }
}
