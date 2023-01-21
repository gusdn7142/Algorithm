package Lv2;

public class 최댓값과_최솟값_v2 {
    public String solution(String s) {

        long start = System.currentTimeMillis(); //프로그램 시작 시간


        //출력할 문자열 초기화
        String answer = "";

        //문자열 s를 " "단위로 잘라 하나씩 정수형 숫자로 출력하며 최솟값과 최댓값을 구한다.
        String[] tempStr = s.split(" ");

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < tempStr.length; i++) {
            int tempInt = Integer.parseInt(tempStr[i]);   //문자열 배열을 숫자 배열로 변환

            min = Math.min(min, tempInt);
            max = Math.max(max, tempInt);
        }

        //최솟값과 최댓값을 결합하여 출력할 문자열 완성
        answer = min + " " + max;


        //코드 실행 종료시간을 end 변수에 담습니다
        long end = System.currentTimeMillis(); //프로그램이 끝나는 시점 계산
        //System.out.println("프로그램 실행시간 : " + (end - start)/1000.0 +"초"); //실행 시간 계산 및 출력


        return answer;
    }
}
