package Lv2;

public class 이진_변환_반복하기_v1 {
    public int[] solution(String str) {

        int[] answer = new int[2];   //[0] == 2진 변환 횟수 반환,   [1] == 0의 개수

        //str이 "1"이 아니면 계속 반복
        while(str.equals("1")==false){

            int cntOne = 0;  //str에서 0을 모두 제거헀을때의 1의 개수

            //1. str의 0의 개수 카운트, 1의 개수 카운트
            for(int i=0; i<str.length(); i++){   //str에서 인덱스 값을 하나씩 조회하여 '0'이면 answer[1]++, '1'이면 cntOnt++
                if(str.charAt(i)=='0') answer[1]++;  //0의 개수 저장
                else cntOne++;
            }

            //2. str의 1의 개수를 2진 타입 문자열로 변환 후 str에 대입 + 변환 횟수 카운트
            str = Integer.toBinaryString(cntOne);   //1의 개수인 cntOne 변수를 String 타입 이진수로 변환
            answer[0]++;                            //변환 횟수 저장
        }


        return answer;  //[0] : 2진 변환 횟수 반환,  [1] : 0의 개수

    }
}
