package Lv2;

import java.util.Arrays;
import java.util.Stack;

public class 기능개발_v1 {
    public int[] solution(int[] progresses, int[] speeds) {

        Stack<Integer> stack = new Stack<>();   //기능별 배포일자 저장

        //1. 기능별 배포일자를 stack에 삽입
        for(int i=0; i<progresses.length; i++){
            int releaseDay = 0;    //배포일 계산

            while(progresses[i]<100){
                progresses[i] += speeds[i];
                releaseDay++;
            }
            if(!stack.empty() && stack.peek() > releaseDay){
                releaseDay = stack.peek();
            }
            stack.push(releaseDay);  //5 10 10 10 20 20
            //System.out.println(releaseDay);
        }


        //2. 배포일자별 기능 수 계산
        int[] visited = new int[stack.peek()+1];   //배포일자별 기능 수 저장
        for (int releaseDay : stack) {
            visited[releaseDay]++;                 //배포일자별 기능 수 카운트
        }

        //System.out.println(Arrays.toString(visited));

        int result[] = Arrays.stream(visited)   //각 배포마다 배포되는 기능 수
                .filter(i -> i != 0)            //배포 일자별 기능 수가 0이면 제외
                .toArray();

        return result;
    }
}
