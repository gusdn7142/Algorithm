package Lv2;

import java.util.Arrays;

public class 최댓값과_최솟값_v1 {

    public String solution(String s) {

        long start = System.currentTimeMillis(); //프로그램 시작 시간

        //출력할 문자열 초기화
        String answer = "";

        //문자열 s를 " "단위로 잘라 하나씩 int형 배열에 삽입
        String[] tempStr = s.split(" ");
        int[] tempInt = new int[tempStr.length];

        for (int i = 0; i < tempStr.length; i++) {
            tempInt[i] = Integer.parseInt(tempStr[i]);   //문자열 배열에서 하나씩 추출하여 int형 배열에 삽입
        }

        Arrays.sort(tempInt); //int형 배열을 오름차순으로 정렬

        //int형 배열의 0번 인덱스와 마지막 인덱스를 결합하여 출력할 문자열 완성
        answer = tempInt[0] + " " + tempInt[tempInt.length-1];


        //코드 실행 종료시간을 end 변수에 담습니다
        long end = System.currentTimeMillis(); //프로그램이 끝나는 시점 계산
        System.out.println("프로그램 실행시간 : " + (end - start)/1000.0 +"초"); //실행 시간 계산 및 출력


        return answer;
    }

}
