package Review.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class 트리의_높이_v1 {

    //전역 변수 초기화
    static int n;                  //트리의 노드 개수
    static int r;                  //루트 노드
    static final int MAX = 105;
    static List<ArrayList<Integer>> tree = new ArrayList<>();  //트리 데이터 저장 인접 리스트 선언
    static boolean visited[] = new boolean[MAX];   //정점 방문 체크
    static int depth[] = new int[MAX];               //각 노드의 깊이(거리)

    public static void main(String[] args){

        //입력
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();          //노드의 개수
        r = scan.nextInt();          //루트 노드 번호

        //인접 리스트 초기화 (노드들 연결)
        for(int i=0; i<=n; i++){
            tree.add(new ArrayList<Integer>());
        }

        for(int i=0; i<n-1; i++){
            int a = scan.nextInt();  //정점 입력
            int b = scan.nextInt();  //정점 입력

            tree.get(a).add(b);   //정점 연결
            tree.get(b).add(a);   //정점 연결
        }



        //인접리스트 연결관게 출력
        // for(int i=1; i<n; i++){
        //     System.out.print(i + "의 연결관계 : ");
        //     for(int j=0; j<graph.get(i).size(); j++){
        //         System.out.print(graph.get(i).get(j) + ", ");
        //     }
        //     System.out.println();
        // }


        DFS(r);  //(루트노드)

        int max=depth[r];
        for(int i=0; i<n; i++){
            if(depth[i] > max){
                max = depth[i];
            }
        }
        System.out.println(max);  //가장 큰 정점의 높이 출력
    }



    static void DFS(int cur) {
        //cur 노드부터 자식노드로 순회하면서 노드별로 거리를 기록
        //각 노드의 깊이(거리)

        visited[cur] = true;   //cur 정점 방문 체크

        for(int i=0; i<tree.get(cur).size(); i++){
            int next = tree.get(cur).get(i);   //next 정점 조회

            if(visited[next]==false){
                depth[next] = depth[cur] + 1;  //tree.get(cur).get(i) 노드의 부모노드 cur
                DFS(next);   //다음 노드의 거리를 기록하는 재귀함수
            }
        }
    }


}
