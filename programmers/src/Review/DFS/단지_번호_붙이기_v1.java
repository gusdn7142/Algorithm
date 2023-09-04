package Review.DFS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 단지_번호_붙이기_v1 {

    //전역변수 선언
    static final int MAX = 30;
    static int n;                            //지도의 크기
    static int[][] map = new int[MAX][MAX];   //단지 정보를 담고 있는 지도
    static boolean[][] visited = new boolean[MAX][MAX];             //방문 정보를 담고 있는 배열
    static int[] dy = {-1, 1, 0, 0}; 	  // dx, dy = 상하좌우
    static int[] dx = {0, 0, -1, 1};
    static int count;                   //단지당 집의 개수

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();        //지도의 크기 입력

        //지도에 집("1") 입력
        for(int i=0; i<n; i++){
            String str = scan.next();    //개행문자를 무시하고 입력
            for(int j=0; j<n; j++){
                map[i][j] = str.charAt(j)-'0';  //아스키코드를 숫자로 변환 : 문자('1'-'0'= 49 - 48 = 1)
            }
        }

        //단지와 집의 개수를 확인하기 위한 ArrayList 선언
        List<Integer> resultList = new ArrayList<>();

        //단지당 집의 개수를 카운트하는 DFS() 메서드 실행
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(map[i][j]==1 && visited[i][j]==false) {    //지도에서 집을 만났고, 방문한적이 없으면
                    count = 0;   //단지당 집의 개수 카운트
                    DFS(i,j);   //지도의 y좌표와 x좌표를 넘긴다.
                    //System.out.println(count);
                    resultList.add(count);   //단지당 집의 개수를 ArrayList에 저장
                }
            }
        }

        //단지의 개수와 단지당 집의 개수 출력
        Collections.sort(resultList);           //단지당 집의 개수를 기준으로 오름차순 정렬
        System.out.println(resultList.size());  //단지의 개수 출력
        for(int i : resultList){
            System.out.println(i);              //단지당 집의 개수 출력
        }


        // for(int i=0; i<n; i++){
        //     for(int j=0; j<n; j++){
        //         System.out.print(map[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        //System.out.println(n);

    }


    static void DFS(int row, int col){
        //그래프를 DFS로 순회하면서 단지당 집의 개수를 센다.
        visited[row][col] = true;   //정점 방문 기록
        count++;                    //단지당 집의 개수 세기

        for(int i=0; i<dy.length; i++){    //상하좌우 만큼 한칸 이동
            int nrow = row + dy[i];
            int ncol = col + dx[i];


            //1. 배열의 조건을 만족하는지
            //2. 단지가 연결이 되었는지
            //3. 방문을 하지 않은곳이었을때
            if(nrow >=0 && nrow <n && ncol >=0 && ncol <n && map[nrow][ncol]==1 && visited[nrow][ncol]==false){
                //System.out.println(count);
                DFS(nrow, ncol);
            }

        }


    }
}
