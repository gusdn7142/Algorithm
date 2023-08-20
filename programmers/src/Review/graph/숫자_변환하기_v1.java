package Review.graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class 숫자_변환하기_v1 {
    public int solution(int x, int y, int n) {
        int count = 0;   //최소 연산 횟수

        Queue<Integer> queue = new LinkedList<>();  //큐
        Set<Integer> visited = new HashSet<>();     //방문 처리

        queue.add(x);     //큐에 값 삽입
        visited.add(x);   //방문 체크

        //x로 y를 만들때 필요한 최소 연산횟수 count 계산
        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int cur = queue.poll();   //큐에서 값 반환 후 제거

                if (cur == y) {      //x로 y가 변환되었으면
                    return count;    //count 값 반환
                }
                if (cur + n <= y && !visited.contains(cur + n)) {
                    queue.add(cur + n);     //큐에 값 삽입
                    visited.add(cur + n);   //방문 체크
                }
                if (cur * 2 <= y && !visited.contains(cur * 2)) {
                    queue.add(cur * 2);     //큐에 값 삽입
                    visited.add(cur * 2);   //방문 체크
                }
                if (cur * 3 <= y && !visited.contains(cur * 3)) {
                    queue.add(cur * 3);     //큐에 값 삽입
                    visited.add(cur * 3);   //방문 체크
                }
            }
            count++;   //최소 연산 횟수 카운트
        }


        return -1;
    }
}
