package Part_10_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 이상한_계산기 {

    static int n;  //이상한 계산기로 만들고자 하는 숫자

    public static void main(String[] args){

        //입력
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();  //이상한 계산기로 만들고자 하는 숫자

        BFS();  //1부터 그래프를 순회하는 BFS() 메서드
    }


    static void BFS(){
        //1부터 BFS로 그래프를 순회하는 메서드

        Queue<Integer> queue = new LinkedList<>();    //큐 생성
        boolean visited[] = new boolean[100000];     //방문 여부를 기록

        queue.add(1);          //큐에 1을 삽입
        visited[1] = true;     //1 방문 처리
        int current;           //큐의 현재 값
        int next;              //큐의 저장할 다음 값
        int cnt=0;             //계산횟수 카운트

        while(queue.size()>0){

            int size = queue.size();    //큐의 크기 반환

            for(int i=0; i<size; i++){
                current = queue.peek();   //큐의 맨 앞값 조회
                queue.remove();               //큐의 맨 앞값 제거

                if(current == n){
                    System.out.println(cnt);   //계산횟수 출력
                    return;
                }

                next = 2 * current;  //Mul 연산 수행
                if(next >=0 && next < 100000 && visited[next] ==false){
                    queue.add(next);           //큐에 next값 삽입
                    visited[next] = true;     //next값 방문 체크
                }

                next = current / 3;  //Div 연산 수행
                if(next >=0 && next < 100000 && visited[next] ==false){
                    queue.add(next);  //계산횟수 출력
                    visited[next] = true;     //next값 방문 체크
                }
            }
            cnt++;   //계산횟수 증가


        }

    }

}
