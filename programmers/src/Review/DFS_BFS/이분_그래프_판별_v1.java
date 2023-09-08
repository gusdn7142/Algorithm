package Review.DFS_BFS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 이분_그래프_판별_v1 {
    
    //전역 변수 초기화
    static int n;  //컴퓨터의 수
    static int m;  //컴퓨터 쌍의 수
    static final int MAX = 1002;
    static boolean visited[] = new boolean[MAX];  //정점 방문여부를 체크
    static List<ArrayList<Integer>> graph = new ArrayList<>();  //그래프 데이터 저장 인접 리스트 선언
    //static List<Integer> graph[] = new ArrayList[MAX];  //그래프 데이터 저장 인접 리스트 선언

    static int color[] = new int[MAX];      //0이면 red,  1이면 blue로 생각
    static boolean isEven = true;           //인접한 노드가 같은 색인지 판별.. true로 초기화 필요


    public static void main(String[] args){

        //입력
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();  //컴퓨터의 수
        m = scan.nextInt();  //컴퓨터 쌍의 수


        //인접 리스트 초기화 (노드들 연결)
        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<Integer>());
            //graph[i] = new ArrayList<Integer>();
        }

        for(int i=0; i<m; i++){

            int a = scan.nextInt();  //정점 입력
            int b = scan.nextInt();  //정점 입력

            // graph[a].add(b);   //정점 연결
            // graph[b].add(a);   //정점 연결
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
        // for(int i=1; i<n; i++){
        //     System.out.print(i + "의 연결관계 : ");
        //     for(int j=0; j<graph[i].size(); j++){
        //         System.out.print(graph[i].get(j) + ", ");
        //     }
        //     System.out.println();
        // }


        DFS(1);  //DFS() 메서드 호출...  정점 1을 인자로 넘겨줌
        if(isEven==true) System.out.println("Yes");
        else if(isEven==false) System.out.println("No");

    }


    static void DFS(int x){
        //그래프를 DFS로 순회하면서 이분 그래프인지 판별

        visited[x] = true;     //정점 방문 체크


        for(int i=0; i<graph.get(x).size(); i++){

            int y = graph.get(x).get(i);   //x와 연결된 정점을 하나씩 조회

            if(visited[y]==false){  //정점에 방문하지 않았다면
                //바로 직전에 있는 노드와 다른 집합으로 분류를 해주는 것이 필요
                color[y] = (color[x] + 1) % 2;  //color[x]가 0이면 1 저장, color[x]가 1이면 0 저장.
                //정점 방문
                DFS(y);
            }
            else{                         //정점에 이미 방문 했다면
                if(color[x]==color[y]){   //이분 그래프가 아니라면
                    isEven = false;
                    return;
                }
            }
        }
    }


}
