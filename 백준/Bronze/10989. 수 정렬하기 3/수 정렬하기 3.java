import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) throws IOException {

        //시간초과 : Scanner scan = new Scanner(System.in);
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));  //입력 설정
        StringBuilder sb = new StringBuilder();  //출력 설정

        //n 입력
        int n = Integer.parseInt(br.readLine());
        //ArrayList<Integer> list = new ArrayList<>();
        int arr[] = new int[n];

        //n개의 수 입력
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        //오름차순 정렬 적용
        //시간초과 : .sort(list);
        Arrays.sort(arr);

        for(int i=0; i<n; i++){
            sb.append(arr[i]).append("\n");
        }

        System.out.println(sb);



    }



}
