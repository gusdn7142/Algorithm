package Review.Stack;

import java.util.Stack;

public class 주식가격_v1 {
    public int[] solution(int[] prices) {

        Stack<Integer> stack = new Stack();
        int[] time = new int[prices.length];   //초별 주식가격이 떨어지지 않은 기간 저장 배열 (초)


        //가격이 떨어진 주식 기준 계산
        for (int i = 0; i < prices.length; i++) {

            while (!stack.isEmpty() && prices[stack.peek()] > prices[i]) {   //가격이 떨어진 주식이면
                time[stack.peek()] = i - stack.peek();                        //주식이 떨어지지 않은 기간 저장
                stack.pop();                                                  //stack에서 제거
            }
            stack.push(i);                                                     //현재 주식 인덱스 저장
        }

        //가격이 떨어지지 않은 주식 기준 계산
        while (!stack.isEmpty()) {
            time[stack.peek()] = prices.length-1 - stack.peek();             //주식이 떨어지지 않은 기간 저장
            stack.pop();                                                       //stack에서 제거
        }


        return time;
    }
}
