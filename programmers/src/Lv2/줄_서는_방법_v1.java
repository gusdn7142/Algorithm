package Lv2;

public class 줄_서는_방법_v1 {
    int n;
    long k;
    int count = 0;                       //사람을 나열하는 방법의 수
    int[] result;                        //사람을 나열 하는 방법을 사전 순으로 나열 했을때 k번째 방법
    boolean[] visited;                   //i번째 숫자 방문 체크


    void getResult(int index, int[] temp){

        if(index >= n){     //기저조건
            count++;                //사람을 나열하는 방법의 수
            if(count == k) {
                result = temp.clone();;
            }
        } else{
            for(int i=1; i<=n; i++){
                if (!visited[i]) {          //방문한 적이 없다면
                    visited[i] = true;      //방문 체크
                    temp[index] = i;        //사람을 줄세운 배열
                    getResult(index+1, temp);
                    visited[i] = false;     //방문 체크 해제
                }
            }

        }
    }


    public int[] solution(int n, long k) {
        int[] temp = new int[n];
        result = new int[n];
        visited = new boolean[n+1];

        this.n = n;
        this.k = k;

        getResult(0, temp);  //index, temp


        return result;
    }
}
