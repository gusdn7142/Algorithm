package Part_11_다익스트라;

import java.util.*;


class Pair implements Comparable<Pair>{

    int node;
    int cost;

    Pair(int node, int cost){
        this.node = node;
        this.cost = cost;
    }


    public int compareTo(Pair p) {
        //return p.cost - p.cost;
        if(this.cost < p.cost) return -1;
        else return 1;
    }
}



public class 파티 {
    //T[i] : 정점 i에 도달하는데 걸리는 최단거리
    // for i = 0 ~ n

    //1) T[i]를 최솟값을 정한다.  단, 지금까지 최솟값으로 뽑히지 않았던 값들 중
    //2) 최소값을 가진 index(노드)로 부터 뻗어난 간다. T[index] + cost(가중치)

    static final int MAX = 1005;
    static int n;  //정점의 개수
    static int m;  //간선의 개수
    static int home;    //철수의 집 노드


    public static void main(String[] args){

        List<ArrayList<Integer>> graph = new ArrayList<>();  //(정방향) 인접 리스트 그래프
        List<ArrayList<Integer>> cost = new ArrayList<>();  //(정방향) 인접 리스트 가중치
        int dist[] = new int[MAX];   //(정방향) 최단거리 저장 배열

        List<ArrayList<Integer>> revgraph = new ArrayList<>();  //(역방향) 인접 리스트 그래프
        List<ArrayList<Integer>> revcost = new ArrayList<>();  //(역방향) 인접 리스트 가중치
        int revdist[] = new int[MAX];   //(역방향) 최단거리 저장 배열



        //입력
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();   //정점의 개수
        m = scan.nextInt();   //간선의 개수
        home = scan.nextInt();   //철수의 집 노드

        //인접 리스트 초기화
        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<Integer>());   //(정방향) 그래프 초기화
            cost.add(new ArrayList<Integer>());    //(정방향) 가중치 초기화
            revgraph.add(new ArrayList<Integer>());   //(역방향) 그래프 초기화
            revcost.add(new ArrayList<Integer>());    //(역방향) 가중치 초기화
        }

        //간선의 정보 입력
        for(int i=0; i<m; i++){
            int a = scan.nextInt();  //정점
            int b = scan.nextInt();  //정점
            int c = scan.nextInt();  //가중치

            //a -- (c) -- b
            graph.get(a).add(b);  //(정방향) 정점 연결
            cost.get(a).add(c);   //(정방향) 가중치 연결

            revgraph.get(b).add(a);  //(역방향) 정점 연결
            revcost.get(b).add(c);   //(역방향) 가중치 연결
        }
        Arrays.fill(dist, 978978978);
        Arrays.fill(revdist, 978978978);

        //다익스트라 로직 실행
        Dijkstra(graph, cost, dist, home);   //home => 각 노드 다익스트라 (정방향 그래프, 정방향 가중치, 정방향 최단거리, home)
        Dijkstra(revgraph, revcost, revdist, home);   //home => 각 노드 다익스트라 (역방향 그래프, 역방향 가중치, 역방향 최단거리, home)


        // int sum1=0;
        // for(int i=1; i<=n; i++){
        //   sum1 += dist[i];
        // }
        // System.out.println(sum1);

        // int sum2=0;
        // for(int i=1; i<=n; i++){
        //     sum2 += revdist[i];
        // }
        // System.out.println(sum2);

        int sum=0;
        for(int i=1; i<=n; i++){
            sum += dist[i] + revdist[i];       //home => 각 노드의 최단거리
        }
        System.out.println(sum);
    }


    static void Dijkstra(List<ArrayList<Integer>> graph, List<ArrayList<Integer>> cost, int dist[], int start){
        //(start 정점부터 end 정점 까지의) 최단 거리를 기록후 end정점의 최단거리를 리턴해주는 다익스트라 함수

        boolean visited[] = new boolean[MAX];  //정점 방문여부 체크

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        pq.add(new Pair(start, 0));  //첫 노드 삽입
        dist[start] = 0;  //첫 시작점의 최단거리를 0으로 셋팅

        while(pq.size() > 0) {

            int node = pq.peek().node; //노드 선택
            pq.remove();               //노드 제거

            if(visited[node] == false){
                visited[node] = true;   //노드 방문 체크

                for (int i=0; i<graph.get(node).size(); i++) {
                    int connectedNode = graph.get(node).get(i);
                    int connectedCost = cost.get(node).get(i);

                    if (dist[connectedNode] > dist[node] + connectedCost) {
                        dist[connectedNode] = dist[node] + connectedCost;     //최단거리 저장
                        pq.add(new Pair(connectedNode, dist[connectedNode]));  //노드 삽입

                        // System.out.println(pq.size());
                    }
                }
            }

        }

    }
}
