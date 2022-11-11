package Part_8_자료구조_스택and큐;

import java.util.Scanner;

public class 공통_조상_찾기 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        boolean color[] = new boolean[1005];  //색칠되면 true
        int parent[] = new int[1005];     //parent[x] : 정점 x의 부모노드 저장
        int n = scan.nextInt();           //노드 개수

        int x = scan.nextInt();          //노드 x
        int y = scan.nextInt();         //노드 y

        for(int i=0; i<n-1; i++){   //노드 0은 이미 있으므로 포함x
            int a = scan.nextInt();   //노드 b의 부모노드인 a
            int b = scan.nextInt();   //노드 b

            //b의 부모노드인 a
            parent[b] = a;   //b의 조상에 a를 입력
        }


        //(1) x의 모든 조상을 구하고 색칠한다.
        //(2) y의 모든 조상을 색칠한다
        //    만약, 이미 조상 체크가 되어 있다면,
        //         이 조상을 출력하고 끝낸다.


        //(1) x의 모든 조상을 구하고 색칠한다.
        while(true){
            color[x] = true;  //x에 색칠

            if(x==0){        //x가 0에 다다르면 반복문 탈출
                break;
            }
            x = parent[x];   //x의 조상을 조회
        }

        //(2) y의 모든 조상을 색칠한다
        //    만약, 이미 조상 체크가 되어 있다면,
        //          이 조상을 출력하고 끝낸다.
        while(true){
            if(color[y]==true){   //x에서 이미 색칠되어 있으면
                System.out.println(y);//가장 가까운 공통 조상이므로 출력 후 프로그램 종료
                System.exit(0);
            }

            color[y] = true;  //y에 색칠
            y = parent[y];   //y의 조상을 조회

        }


    }

}
