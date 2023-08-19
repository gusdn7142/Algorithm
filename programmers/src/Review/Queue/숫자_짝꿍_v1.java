package Review.Queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class 숫자_짝꿍_v1 {
    public String solution(String X, String Y) {
        StringBuilder result = new StringBuilder();                             //짝궁 문자열

        //1. X 문자열 의 수(0~9)를 (내림차순에 따라) 우선순위 큐 pq1에 저장
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Collections.reverseOrder());  //우선순위 (내림차순 정렬)

        for(int i=0; i<X.length(); i++){
            int ch = X.charAt(i) - '0';
            pq1.add(ch);
        }


        //2. X 문자열 의 수(0~9)를 (내림차순에 따라) 우선순위 큐 pq2에 저장
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());  //우선순위 (내림차순 정렬)

        for(int i=0; i<Y.length(); i++){
            int ch = Y.charAt(i) - '0';
            pq2.add(ch);
        }


        //3. pq1와 pq2에 저장된 9~0까지 수 중 공통적으로 있는 수를 result 문자열에 저장
        while(pq1.size() > 0 && pq2.size() >0){
            if(pq1.peek() == pq2.peek()){  //공통적으로 있는 수라면
                result.append(pq1.peek());  //짝궁 문자열에 추가
                pq1.remove();               //pq1의 가장 큰 값 제거
                pq2.remove();               //pq2의 가장 큰 값 제거
            } else if(pq1.peek() > pq2.peek()){   //pq1의 숫자가 pq2의 숫자보다 크면
                pq1.remove();               //pq1의 가장 큰 값 제거
            } else{   //pq1의 숫자가 pq2의 숫자보다 작으면
                pq2.remove();               //pq2의 가장 큰 값 제거
            }
        }
        
        if(result.toString().equals(""))   //짝궁이 존재하지 않으면 "-1" 반환
            return "-1";
        else if(result.toString().charAt(0)=='0')  //짝궁이 "0"으로만 구성되어 있으면 "0" 반환
            return "0";

        return result.toString();
    }
}
