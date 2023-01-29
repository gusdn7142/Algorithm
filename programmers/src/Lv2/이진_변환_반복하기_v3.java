package Lv2;

import java.util.StringTokenizer;

public class 이진_변환_반복하기_v3 {
    public int[] solution(String str) {

        int[] answer = new int[2];   //[0] == 2진 변환 횟수 반환,   [1] == 0의 개수
        int oneCount;                //1의 개수 카운트 변수

        //str이 "1"이 아니면 계속 반복
        while(str.equals("1")==false){

            //1. str에서 '0'을 제거하면서 '1'로 이루어진 문자열 생성 + 1의 개수 카운트
            answer[1] += str.length();       //0의 개수 카운트인데...  (일단 str의 길이 저장)
            str = str.replaceAll("0", "");   //str의 0을 ""로 대체하여 "1"로만된 문자열 반환
            oneCount = str.length();               //1의 개수를 oneCount에 저장

            //2. str의 1의 개수를 2진 타입 문자열로 변환 후 str에 대입 + 2진 변환 횟수와 0의 개수 카운트
            str = Integer.toBinaryString(oneCount);

            answer[0]++;               //2진 변환 횟수 카운트
            answer[1] -= oneCount;      //전체 str의 길이에서 1의 개수를 빼서 0의 개수를 카운트

        }

        return answer;  //[0] : 2진 변환 횟수 반환,  [1] : 0의 개수
    }
}
