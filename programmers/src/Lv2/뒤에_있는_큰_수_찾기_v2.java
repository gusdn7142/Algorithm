package Lv2;

import java.util.Stack;

public class 뒤에_있는_큰_수_찾기_v2 {
    public int[] solution(int[] numbers) {

        int[] result = new int[numbers.length];   //뒷 큰수들을 담은 배열
        Stack<Integer> stack = new Stack<>();
        stack.push(0);    //index 정보를 담은 스택

        //numbers[] 배열의 각 원소에 대해 뒷 큰수를 result[]에 저장
        for(int i=1; i<numbers.length; i++){

            while (!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
                result[stack.pop()] = numbers[i];
            }

            stack.push(i);
        }


        //뒷 큰수가 없는 인덱스는 -1로 처리
        while (!stack.isEmpty()) {
            result[stack.pop()] = -1;
        }

        return result;
    }
}
