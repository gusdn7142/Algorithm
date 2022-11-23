package Part_9_DFS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 웜_바이러스_DFS {
    //전역 변수 초기화
    static int n;  //컴퓨터의 수
    static int m;  //컴퓨터 쌍의 수
    static final int MAX = 105;
    static boolean visited[] = new boolean[MAX];  //정점 방문여부를 체크
    static List<ArrayList<Integer>> graph = new ArrayList<>();  //인접 리스트 선언
    static int cnt=0;                             //정점 방문 횟수


    public static void main(String[] args){


        //입력
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();  //컴퓨터의 수
        m = scan.nextInt();  //컴퓨터 쌍의 수




        //인접 리스트 초기화
        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<Integer>());
        }

        for(int i=0; i<m; i++){

            int a = scan.nextInt();  //정점 입력
            int b = scan.nextInt();  //정점 입력

            graph.get(a).add(b);   //정점 연결
            graph.get(b).add(a);   //정점 연결
        }



        //인접리스트 연결관게 출력
        // for(int i=1; i<n; i++){
        //     System.out.print(i + "의 연결관계 : ");
        //     for(int j=0; j<graph.get(i).size(); j++){
        //         System.out.print(graph.get(i).get(j) + ", ");
        //     }
        //     System.out.println();
        // }

        DFS(1);  //DFS() 메서드 호출...  정점 1을 인자로 넘겨줌
        System.out.println(cnt-1);   //정점 1을 방문한 경우는 제외하므로 cnt-1

    }


    static void DFS(int x) {
        //그래프를 DFS로 순회하면서 정점 방문시 카운트를 기록

        visited[x] = true;     //정점 방문 체크
        cnt++;                 //정점 방문에 대한 횟수 기록
        //System.out.print(x + ", ");
        //기저조건


        for (int i = 0; i < graph.get(x).size(); i++) {

            int y = graph.get(x).get(i);   //x와 연결된 정점을 하나씩 조회

            if (visited[y] == false) {  //정점에 방문하지 않았다면
                DFS(y);             //정점 방문
            }
        }

    }

}
