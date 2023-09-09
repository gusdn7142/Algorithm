package Review.DFS_BFS;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Pair2 {
    int y;
    int x;

    Pair2(int y, int x){
        this.y = y;
        this.x = x;
    }

}

public class 목수의_미로_탈출_v1 {

    static int n;   //지도의 세로 길이
    static int m;   //지도의 가로 길이
    static final int MAX = 1005;
    static int arr[][]=new int[MAX][MAX];  //지도
    static int distanceStart[][] = new int[MAX][MAX];  //start정점에서 각 정점까지의 거리를 모두 기록
    static int distanceEnd[][] = new int[MAX][MAX];  //end정점에서 각 정점까지의 거리를 모두 기록

    static int[] dy = {-1, 1, 0, 0}; 	  // dx, dy = 상하좌우
    static int[] dx = {0, 0, -1, 1};

    public static void main(String[] args){

        //입력
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();   //지도의 세로 길이
        m = scan.nextInt();   //지도의 가로 길이


        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = scan.nextInt();  //지도 생성.. 0은 이동 가능, 1은 이동 불가능
            }
        }


        BFS(n-1,0,distanceStart);   //BFS로 그래프를 순회하면서 (n-1,0) 정점부터 마지막 정점(0,m-1)까지의 모든 정점에 대해  최단거리를 구하는  메서드
        BFS(0,m-1,distanceEnd);   //BFS로 그래프를 순회하면서 (n-1,0) 정점부터 마지막 정점(0,m-1)까지의 모든 정점에 대해 최단거리를 구하는 메서드


        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         System.out.print(distanceStart[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         System.out.print(distanceEnd[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        int result = n*m;   //최단거리 값을 기록
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(distanceStart[i][j]>0 && distanceEnd[i][j] >0 ){       //각 정점의 최단거리가 0일 경우는 제외
                    result = Math.min(result, distanceStart[i][j]+distanceEnd[i][j]);   //각 정점에 대한 최단거리를 구한다.
                }
            }
        }
        System.out.println(result);  //최단거리 값을 출력


    }

    static void BFS(int y, int x, int distance[][]){
        //BFS로 그래프를 순회하면서 (n-1,0) 정점부터 마지막 정점(0,m-1)까지의 모든 정점에 대한 최단거리를 구하는  메서드

        Queue<Pair2> queue = new LinkedList<>();   //큐 생성
        boolean visited[][] = new boolean[MAX][MAX];           //정점 방문 체크

        queue.add(new Pair2(y,x));  //(시작 y좌표, 시작 x좌표)를 큐에 삽입
        visited[y][x] = true;      //시작 좌표 방문 처리


        while(queue.size() > 0){   //큐의 크기만큼 반복

            //int size = queue.size();  //큐의 크기를 불러온다.

            int row = queue.peek().y;  //큐의 맨 앞값(y좌표)을 조회
            int col = queue.peek().x;  //큐의 맨 앞값(x좌표)을 조회
            queue.remove();  //큐의 맨 앞값을 제거

            // if(row==0 && col==m-1){  //(0,m-1) 좌표에서 반복 종료
            //     return;   //BFS 메서드 종료
            // }


            for(int j=0; j<dy.length; j++){    //상하좌우 만큼 한칸 이동
                int nrow = row + dy[j];     //이동할 Y좌표 값
                int ncol = col + dx[j];     //이동할 X좌표 값

                if(nrow < n && nrow >= 0 && ncol < m && ncol>=0 && visited[nrow][ncol]==false){  //row와 col 값이 배열안에 있으면    
                    //벽을 만났거나 벽을 만나지 않았을떄 공통처리
                    visited[nrow][ncol]=true;           //(nrow,ncol) 정점에 대한 방문처리
                    distance[nrow][ncol] = distance[row][col] + 1;  //정점에 대한 거리 기록

                    if(arr[nrow][ncol]==0){   //벽을 만나지 않았다면
                        queue.add(new Pair2(nrow,ncol));   //(nrow,ncol) 정점을 큐에 삽입
                    }
                }

            }
        }


    }

}
