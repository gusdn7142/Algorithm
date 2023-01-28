package Lv2;

import java.util.StringTokenizer;

public class 이진_변환_반복하기_v2 {
    public int[] solution(String str) {

        int[] answer = new int[2];   //[0] == 2진 변환 횟수 반환,   [1] == 0의 개수

        //str이 "1"이 아니면 계속 반복
        while(str.equals("1")==false){

            //1. str에서 '0'을 제거하면서 0의 개수 카운트 + '1'로 이루어진 문자열 반환
            StringTokenizer st = new StringTokenizer(str, "0");  //str을 '0'으로 분리

            String oneNum = "";              //1로만 이루어진 수
            while(st.hasMoreTokens()){
                oneNum += st.nextToken();    //st의 토큰 값들을 하나씩 조회
            }
            answer[1] += str.length() - oneNum.length();   //0의 개수 카운트


            //2. str의 1의 개수를 2진 타입 문자열로 변환 후 str에 대입 + 2진 변환 횟수 카운트
            str = Integer.toBinaryString(oneNum.length());   //1의 개수인 cntOne 변수를 String 타입 이진수로 변환
            answer[0]++;   //2진 변환 횟수 카운트

        }

        return answer;  //[0] : 2진 변환 횟수 반환,  [1] : 0의 개수
    }
}
