import java.io.*;

public class Boj_15552 {

    public static void main(String[] args) throws IOException {


        //입력 설정
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //출력 설정
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //테스트 케이스 T 입력
        int T = Integer.parseInt(br.readLine());



        for(int i=0; i<T; i++){
            String str = br.readLine();

            int a = Integer.parseInt(str.split(" ")[0]);
            int b = Integer.parseInt(str.split(" ")[1]);

            bw.write(a+b+"\n");  //버퍼에 데이터를 담음

        }


        bw.flush();   //남아있는 데이터를 모두 출력



    }




}
