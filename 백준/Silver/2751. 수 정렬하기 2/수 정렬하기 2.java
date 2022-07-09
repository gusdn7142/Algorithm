import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = scan.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<n; i++){
            list.add(i, scan.nextInt());
        }

        //오름차순 정렬 적용
        //시간초과 : Arrays.sort(arr);
        Collections.sort(list);

        for(int i=0; i<n; i++){
            sb.append(list.get(i)).append("\n");
        }

        System.out.println(sb);


    }


}
