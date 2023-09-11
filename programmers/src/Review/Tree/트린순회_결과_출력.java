package Review.Tree;

import java.util.Scanner;

public class 트린순회_결과_출력 {

    static int tree[][];  //트리 배열 선언

    public static void main(String[] args){

        //입력
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();   //트리 노드의 개수


        //트리 노드 입력
        tree = new int[n][2];  //트리 배열 선언
        for(int i=0; i<n; i++){
            int a = scan.nextInt();  //노드 a
            int b = scan.nextInt();  //노드 a의 왼쪽 자식 노드
            int c = scan.nextInt();  //노드 a의 오른쪽 자식 노드

            tree[a][0] = b;    //노드 a의 왼쪽 자식 노드 저장
            tree[a][1] = c;    //노드 a의 오른쪽 자식 노드 저장
        }


        preOrder(0);   //전위 순회 (root => left => right) : root인 0번 인덱스를 넘겨줌
        System.out.println();
        inOrder(0);   //중위 순회 (left => root => right) : root인 0번 인덱스를 넘겨줌
        System.out.println();
        postOrder(0);   //후위 순회 (left => right => root) : root인 0번 인덱스를 넘겨줌

    }


    //전위순회 구현  (root => left => right)
    static void preOrder(int root){

        if(tree[root][0] == -1 && tree[root][1] == -1){  //왼쪽과 오른쪽 자식노드가 모두 -1이면
            System.out.print(root+ " ");                 //노드 출력
        }
        else{
            System.out.print(root + " ");
            if(tree[root][0] != -1) preOrder(tree[root][0]);   //왼쪽 자식 노드 전위순회
            if(tree[root][1] != -1) preOrder(tree[root][1]);   //오른쪽 자식 노드 전위순회
        }
    }



    //중위순회 구현  (left => root => right)
    static void inOrder(int root){

        if(tree[root][0] == -1 && tree[root][1] == -1){  //왼쪽과 오른쪽 자식노드가 모두 -1이면
            System.out.print(root+ " ");                 //노드 출력
        }
        else{
            if(tree[root][0] != -1) inOrder(tree[root][0]);   //왼쪽 자식 노드 중위순회
            System.out.print(root + " ");
            if(tree[root][1] != -1) inOrder(tree[root][1]);   //오른쪽 자식 노드 중위순회
        }
    }


    //후위순회 구현  (left => right => root)
    static void postOrder(int root){

        if(tree[root][0] == -1 && tree[root][1] == -1){  //왼쪽과 오른쪽 자식노드가 모두 -1이면
            System.out.print(root+ " ");                 //노드 출력
        }
        else{
            if(tree[root][0] != -1) postOrder(tree[root][0]);   //왼쪽 자식 노드 후위순회
            if(tree[root][1] != -1) postOrder(tree[root][1]);   //오른쪽 자식 노드 후위순회
            System.out.print(root + " ");
        }
    }

}
