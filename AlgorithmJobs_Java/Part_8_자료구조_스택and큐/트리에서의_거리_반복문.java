package Part_8_자료구조_스택and큐;

import java.util.Arrays;
import java.util.Scanner;

public class 트리에서의_거리_반복문 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int parent[] = new int[1005];     //parent[x] : 정점 x의 부모노드 저장
        int n = scan.nextInt();           //노드 개수
        int count = 0;                    //노드와 노드간의 거리
        int visitedX[] = new int[1005];   //노드x를 방문했을때의 count 기록
        int visitedY[] = new int[1005];   //노드y를 방문했을때의 count 기록

        Arrays.fill(visitedX,-1);   //배열값을 -1로 초기화
        Arrays.fill(visitedY,-1);   //배열값을 -1로 초기화

        int x = scan.nextInt();          //노드 x
        int y = scan.nextInt();         //노드 y

        for(int i=0; i<n-1; i++){   //노드 0은 이미 있으므로 포함x
            int a = scan.nextInt();   //노드 b의 부모노드인 a
            int b = scan.nextInt();   //노드 b

            //b의 부모노드인 a
            parent[b] = a;   //b의 조상에 a를 입력
        }



        //1) x노드부터 root노드까지 순회하면서 노드별로 거리를 카운트로 기록
        while(true){
            visitedX[x] = count++;    //x 위치의 카운트를 기록
            if(x==0) break;  //x가 0에 다다르면 반복문 탈출
            x = parent[x];   //x의 조상을 조회
        }


        count = 0;    //노드와 노드간의 거리
        int sum = 0;  //노드간 거리의 합 기록
        //2)y노드부터 root노드까지 순회하면서 노드별로 거리를 카운트로 기록,
        //만약 x노드의 카운트가 기록되어 있는 노드를 만나면 count 합을 출력
        while(true){
            if(visitedX[y] != -1){
                sum = visitedX[y] + count;
                break;
            }
            else{
                visitedY[y] = count++;    //y 위치의 카운트를 기록
                if(y==0) break;            //y가 0에 다다르면 반복문 탈출
                y = parent[y];             //y의 조상을 조회

            }

        }

        System.out.println(sum);


    }
}
