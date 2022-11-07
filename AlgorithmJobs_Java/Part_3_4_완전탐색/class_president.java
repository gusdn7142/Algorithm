package Part_3_완전탐색;

import java.util.Scanner;

public class class_president {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        //변수 초기화
        int n = scan.nextInt();                //학생 수
        int student[][] = new int[n+1][5];   //[학생 수][반 수]
        int result = -1;        //같은 반인 최대 학생수
        int resultNumber = 0;    //학생 번호


        //n명의 학생의 반 입력
        for(int i=1; i<=n; i++){
            for(int j=0; j<5; j++) {
                student[i][j] = scan.nextInt();
            }
        }


        //i번째 학생과 겹치는 학생 수를 구하고 겹치는 학생 수가 가장 많은 학생 번호를 출력
        for(int i=1; i<=n; i++){

            int numStudent = 0;     //같은 반 학생수

            for(int j=1; j<=n; j++){  //i와 j가 같은반이 였었는지 확인

                if(i==j) continue;    //같은 학생이면 continue

                if(student[i][0] == student[j][0] ||  //i번째 학생과 j번째 학생이 같은 반이 있는지 확인
                        student[i][1] == student[j][1] ||
                        student[i][2] == student[j][2] ||
                        student[i][3] == student[j][3] ||
                        student[i][4] == student[j][4] ){
                    numStudent++;
                }

                if(result < numStudent){  //같은반 학생 수가 가장 많으면
                    result = numStudent;
                    resultNumber = i;
                }

            }
        }

        System.out.println(resultNumber);
    }
}
