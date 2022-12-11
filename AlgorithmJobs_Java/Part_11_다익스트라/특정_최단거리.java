package Part_11_다익스트라;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 특정_최단거리 {

    static final int MAX = 1005;
    static int n;  //정점의 개수
    static int m;  //간선의 개수
    static int mid1;    //거쳐야 하는 점 1
    static int mid2;    //거쳐야 하는 점 2
    static List<ArrayList<Integer>> graph = new ArrayList<>();  //인접 리스트 그래프
    static List<ArrayList<Integer>> cost = new ArrayList<>();  //인접 리스트 가중치


    public static void main(String[] args){


        //입력
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();   //정점의 개수
        m = scan.nextInt();   //간선의 개수

        //인접 리스트 초기화
        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<Integer>());   //그래프 초기화
            cost.add(new ArrayList<Integer>());    //가중치 초기화
        }

        //간선의 정보 입력
        for(int i=0; i<m; i++){
            int a = scan.nextInt();  //정점
            int b = scan.nextInt();  //정점
            int c = scan.nextInt();  //가중치

            //a -- (c) -- b
            graph.get(a).add(b);  //정점 연결
            graph.get(b).add(a);  //정점 연결
            cost.get(a).add(c);   //가중치 연결
            cost.get(b).add(c);   //가중치 연결

        }
        mid1 = scan.nextInt();   //거쳐야 하는점 1
        mid2 = scan.nextInt();   //거쳐야 하는점 2


        int distMid1 = Dijkstra(1, mid1);  //1번 정점 부터 mid1 정점까지의 최단 거리를 기록
        int distMid2 = Dijkstra(1, mid2);  //1번 정점 부터 mid2 정점까지의 최단 거리를 기록

        if(distMid1 < distMid2){   //distMid1이 distMid2보다 작으면
            int distMid1ToMid2 = Dijkstra(mid1, mid2);   //mid1번 정점 부터 mid2 정점까지의 최단 거리를 기록
            int distEnd = Dijkstra(mid2, n);             //mid2번 정점 부터 n 정점까지의 최단 거리를 기록
            System.out.println(distMid1 + distMid1ToMid2 + distEnd);   //1 => mid1 => mid2 => n 번까지의 최단거리 출력
        }
        else{     //distMid2이 distMid1보다 작으면
            int distMid2ToMid1 = Dijkstra(mid2, mid1);  //mid2번 정점 부터 mid1 정점까지의 최단 거리를 기록
            int distEnd = Dijkstra(mid1, n);            //mid1번 정점 부터 n 정점까지의 최단 거리를 기록
            System.out.println(distMid2 + distMid2ToMid1 + distEnd);  //1 => mid2 => mid1 => n 번까지의 최단거리 출력
        }




    }


    static int Dijkstra(int start, int end){
        //(start 정점부터 end 정점 까지의) 최단 거리를 기록후 end정점의 최단거리를 리턴해주는 다익스트라 함수

        int dist[] = new int[MAX];   //최단거리 저장 배열
        boolean check[] = new boolean[MAX];  //check[i] = true : 이미 i는 최단거리가 확정되었다.
        //check[i] = false : 아직 i는 최단거리가 확정되지 않았다.

        for(int i=1; i<=n; i++){
            dist[i] = 987987987;  //각 정점의 최단거리 초기값을 임의로 무한대로 준다.
        }
        dist[start] = 0;  //시작점의 최단거리를 0으로 셋팅


        for(int i=0; i<n; i++){
            //1) 최솟값을 구한다. 단, 지금까지 최단거리로 확정되지 않았던 정점에 대해서
            //2) 그 최솟값을 갖는 노드로부터 뻗어 나간다.

            int minValue = 987987987;  //최소값
            int minIndex = -1;         //최소값의 정점 번호

            for(int j=1; j<=n; j++){
                if(check[j]==false && dist[j] < minValue) {  //정점 j번쨰가 최단거리로 확정이 안되었고, j의 최단거리가 최솟값보다 작으면
                    minValue = dist[j];  //최소값 셋팅
                    minIndex = j;         //최소값의 정점 번호 셋팅
                }
            }

            check[minIndex] = true;  //minIndex의 최단거리를 확정

            for(int j=0; j<graph.get(minIndex).size(); j++){
                int node2 = graph.get(minIndex).get(j);  //minIndex 정점의 연결 정점 하나씩 불러옴
                int cost2 = cost.get(minIndex).get(j);    //minIndex 정점의 연결 정점에 대한 가중치를 하나씩 불러옴

                //minindex --- (cost2) --- Node2
                // System.out.println(dist[node2]);
                // System.out.println(dist[minIndex]);
                // System.out.println(cost2);
                // System.out.println();

                if(dist[node2] > dist[minIndex] + cost2){  //minIndex정점과 연결된 정점의 최단 거리 >  (minIndex정점의 최단거리와 minIndex정점과 연결된 정점의 가중치) 이면
                    dist[node2] = dist[minIndex] + cost2;   //minIndex정점과 연결된 정점의 최단 거리 = (minIndex정점의 최단거리와 minIndex정점과 연결된 정점의 가중치)
                }

            }
        }

        // for(int i=1; i<=n; i++){
        //     System.out.print(dist[i] + " ");  //모든 정점의 최단거리 출력
        // }

        return dist[end];  //end까지의 최단거리 리턴


    }
}
