package Review.Loop;

import java.util.Arrays;

public class 덧칠하기_v2 {
    public int solution(int n, int m, int[] section) {

        //1. 벽에 페인트 칠 유무 표시 (칠해짐 : true, 안 칠해짐 : false)
        boolean[] visited = new boolean[n+1];
        Arrays.fill(visited, true);

        for(int i=0; i<section.length; i++) {
            int num = section[i];
            visited[num] = false;
        }


        //2. 롤러로 전체 벽(1~n)에서 m만큼 section 영역에 페인트 칠하며, 페인트 칠 횟수 구하기
        int count = 0;   //최소 페인트칠 횟수
        for(int i=1; i<=n; i++){
            if(visited[i]) continue;  //페인트가 칠해져 있으면 pass
            //System.out.print(i + " ");

            for(int j=0; j<m; j++){  //페인트가 칠해져 있지 않았다면
                if(i+j > n) break;     //롤러가 벽을 넘어가면 pass
                visited[i+j] = true;  //롤러로 페인트 칠
            }
            count++;              //페인트칠 횟수 증가
        }


        return count;
    }
}
