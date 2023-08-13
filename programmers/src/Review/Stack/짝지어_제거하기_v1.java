package Review.Stack;

import java.util.Stack;

public class 짝지어_제거하기_v1 {
    public int solution(String str) {
        int result = 1;   //짝지어 제거하기 성공 유무
        Stack<Character> stack = new Stack<>();

        //1. str의 요소를 stack에 넣고 짝을 확인하며 stack 값 제거
        for(int i=0; i<str.length(); i++){
            char alpha = str.charAt(i);

            if(stack.size()==0) {    //stack이 비어 있으면 알파벳 추가
                stack.push(alpha);
                continue;
            }

            if(stack.peek()==alpha)  //짝이 맞으면 알파벳 제거
                stack.pop();
            else{                    //짝이 맞지 않으면 알파벳 추가
                stack.push(alpha);
            }
        }

        if(stack.size() > 0)  //stack에 알파벳이 남아있으면
            result = 0;

        return result;
    }
}
