package Part_10_BFS;

import java.util.*;

public class 최단거리 {

    static final int MAX = 10005;
    static int n;  //정점의 개수
    static int m;  //간선의 개수
    static int start;  //시작점
    static int end;   //끝점
    static List<ArrayList<Integer>> graph = new ArrayList<>();  //인접 리스트 그래프
    static int dist[] = new int[MAX];   //최단거리 저장 배열
    static boolean visited[] = new boolean[MAX];  //정점 방문여부 체크
    static Queue<Integer> queue = new LinkedList<>();  //큐 생성


    public static void main(String[] args){

        //입력
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();   //정점의 개수
        m = scan.nextInt();   //간선의 개수


        //인접 리스트 초기화
        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<Integer>());   //그래프 초기화
        }

        //간선의 정보 입력
        for(int i=0; i<m; i++){
            int a = scan.nextInt();  //정점
            int b = scan.nextInt();  //정점

            graph.get(a).add(b);  //정점 연결
            graph.get(b).add(a);  //정점 연결

        }

        start = scan.nextInt();  //시작점
        end = scan.nextInt();  //끝점

        BFS(start);    //start부터 모든 정점까지 너비우선탐색으로 그래프를 순회하면서 거리를 기록

        System.out.println(dist[end]);  //end까지의 최단거리 출력

    }


    static void BFS(int start){
        //start부터 모든 정점까지 너비우선탐색으로 그래프를 순회하면서 거리를 기록

        queue.add(start);     //큐에 start 정점 삽입
        visited[start]=true;  //start 정점 방문 처리

        while(queue.size()>0){

            int current = queue.peek();   //큐의 맨 처음 값을 조회
            queue.remove();                //큐의 맨 처음 값 제거

            for(int i=0; i<graph.get(current).size(); i++){
                int next = graph.get(current).get(i);    //연결된 정점 방문

                if(visited[next]==false){
                    queue.add(next);     //큐에 연결된 정점 삽입
                    visited[next]=true;  //연결된 정점 방문 처리
                    dist[next] = dist[current] +1;   //연결된 정점에 대한 거리 기록
                }
            }

        }



    }
}
