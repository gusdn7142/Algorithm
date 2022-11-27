package Part_10_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


class Pair {
    int y;
    int x;

    Pair(int y, int x){
        this.y = y;
        this.x = x;
    }

}


public class 미로_찾기{

    static int n;   //지도의 세로 길이
    static int m;   //지도의 가로 길이
    static final int MAX = 1005;
    static int arr[][]=new int[MAX][MAX];  //지도
    static int[] dy = {-1, 1, 0, 0}; 	  // dx, dy = 상하좌우
    static int[] dx = {0, 0, -1, 1};
    static int dist[][] = new int[MAX][MAX]; //정점 간의 거리를 기록
    static int cnt;      //마지막 정점까지의 거리를 기록하는 변수



    public static void main(String[] args){

        //입력
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();   //지도의 세로 길이
        m = scan.nextInt();   //지도의 가로 길이

        //arr = new int[m][n];  //지도

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = scan.nextInt();  //지도 생성.. 0은 이동 가능, 1은 이동 불가능
            }
        }


        BFS();   //BFS로 그래프를 순회하면서 (n-1,0) 정점부터 마지막 정점(0,m-1)까지의 최단거리를 구하는  메서드
        System.out.println(dist[0][m-1]);   //마지막 정점(0,m-1)까지의 거리 출력



        // for(int i=0; i<m; i++){
        //     for(int j=0; j<n; j++){
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }


    }

    static void BFS(){
        //BFS로 그래프를 순회하면서 (n-1,0) 정점부터 마지막 정점(0,m-1)까지의 최단거리를 구하는  메서드

        Queue<Pair> queue = new LinkedList<>();   //큐 생성
        boolean visited[][] = new boolean[MAX][MAX];           //정점 방문 체크

        queue.add(new Pair(n-1,0));  //(시작 y좌표, 시작 x좌표)를 큐에 삽입
        visited[n-1][0] = true;      //시작 좌표 방문 처리
        cnt=0;                   //마지막 정점까지의 거리를 기록하는 변수


        while(queue.size() > 0){   //큐의 크기만큼 반복

            int row = queue.peek().y;  //큐의 맨 앞값(y좌표)을 조회
            int col = queue.peek().x;  //큐의 맨 앞값(y좌표)을 조회
            //System.out.println(y + " " + x);
            queue.remove();  //큐의 맨 앞값을 제거

            if(row==0 && col==m-1){  //(0,m-1) 좌표에서 반복 종료
                return;   //BFS 메서드 종료
            }


            for(int j=0; j<dy.length; j++){    //상하좌우 만큼 한칸 이동
                int nrow = row + dy[j];     //이동할 Y좌표 값
                int ncol = col + dx[j];     //이동할 X좌표 값

                if(nrow < n && nrow >= 0 && ncol < m && ncol >=0 && arr[nrow][ncol]==0 && visited[nrow][ncol]==false){
                    queue.add(new Pair(nrow,ncol));   //(nrow,ncol) 정점을 큐에 삽입
                    dist[nrow][ncol] = dist[row][col]+1;
                    visited[nrow][ncol]=true;   //(nrow,ncol) 정점에 대한 방문처리
                }
            }
        }


    }

}






