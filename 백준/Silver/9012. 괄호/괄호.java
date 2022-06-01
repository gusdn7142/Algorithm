import java.util.Scanner;

public class Main {


    /* 괄호개수 일치여부 확인 함수 */
    public static String solve(String str){  //괄호를 받아와서
        int cnt = 0;  //스택 대용

        for(int i=0; i<str.length(); i++) {   //괄호 수만큼 반복
            if(str.charAt(i) == '('){   //여는 괄호이면 스택에 입력
                cnt++;
            }
            else{   //닫는 괄호이면 스택에서 빼기
                cnt--;
            }
            if(cnt<0) {   //닫는 괄호가 더 많으면
                return("NO");
            }
        }

        if(cnt==0){  //괄호 개수가 정상적으로 맞으면
            return("YES");
        } else{       //여는 괄호가 더 많으면 (cnt>0)
            return("NO");
        }

    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();  //테스트 케이스 T입력

        while(T-->0){  //T만큼 반복
            System.out.println(solve(scan.next()));  //괄호를 입력받고;
        }

    }
    

}
