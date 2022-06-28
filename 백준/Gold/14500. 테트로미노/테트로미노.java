import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner((System.in));

        //세로 최대크기
        int n = scan.nextInt();

        //가로 최대크기
        int m =scan.nextInt();

        //n*m 종이 생성
        int arr[][] = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++) {
                arr[i][j] = scan.nextInt();
                //System.out.println(arr[i][j]);
            }
        }

        //최댓값
        int max_result = 0;

        //테크로미노를 놓을 수 있는 19가지의 경우의 수
        for(int i=0; i<n; i++) {
            for (int j = 0; j < m; j++) {
                if (j+3 < m) {
                    int temp = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i][j + 3];
                    if (max_result < temp)  max_result = temp;
                }
                if (i+3 < n) {
                    int temp = arr[i][j] + arr[i+1][j] + arr[i+2][j] + arr[i+3][j];
                    if (max_result < temp) max_result = temp;
                }
                if (i+1 < n && j+2 < m) {
                    int temp = arr[i][j] + arr[i+1][j] + arr[i+1][j+1] + arr[i+1][j+2];
                    if (max_result < temp) max_result = temp;
                }
                if (i+2 < n && j+1 < m) {
                    int temp = arr[i][j] + arr[i][j+1] + arr[i+1][j] + arr[i+2][j];
                    if (max_result < temp) max_result = temp;
                }
                if (i+1 < n && j+2 < m) {
                    int temp = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+2];
                    if (max_result < temp) max_result = temp;
                }
                if (i+2 < n && j-1 >= 0) {
                    int temp = arr[i][j] + arr[i+1][j] + arr[i+2][j] + arr[i+2][j-1];
                    if (max_result < temp) max_result = temp;
                }
                if (i-1 >= 0 && j+2 < m) {
                    int temp = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i-1][j+2];
                    if (max_result < temp) max_result = temp;
                }
                if (i+2 < n && j+1 < m) {
                    int temp = arr[i][j] + arr[i+1][j] + arr[i+2][j] + arr[i+2][j+1];
                    if (max_result < temp) max_result = temp;
                }
                if (i+1 < n && j+2 < m) {
                    int temp = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j];
                    if (max_result < temp) max_result = temp;
                }
                if (i+2 < n && j+1 < m) {
                    int temp = arr[i][j] + arr[i][j+1] + arr[i+1][j+1] + arr[i+2][j+1];
                    if (max_result < temp) max_result = temp;
                }
                if (i+1 < n && j+1 < m) {
                    int temp = arr[i][j] + arr[i][j+1] + arr[i+1][j] + arr[i+1][j+1];
                    if (max_result < temp) max_result = temp;
                }
                if (i-1 >= 0 && j+2 < m) {
                    int temp = arr[i][j] + arr[i][j+1] + arr[i-1][j+1] + arr[i-1][j+2];
                    if (max_result < temp) max_result = temp;
                }
                if (i+2 < n && j+1 < m) {
                    int temp = arr[i][j] + arr[i+1][j] + arr[i+1][j+1] + arr[i+2][j+1];
                    if (max_result < temp) max_result = temp;
                }
                if (i+1 < n && j+2 < m) {
                    int temp = arr[i][j] + arr[i][j+1] + arr[i+1][j+1] + arr[i+1][j+2];
                    if (max_result < temp) max_result = temp;
                }
                if (i+2 < n && j-1 >= 0) {
                    int temp = arr[i][j] + arr[i+1][j] + arr[i+1][j-1] + arr[i+2][j-1];
                    if (max_result < temp) max_result = temp;
                }
                if (j+2 < m) {
                    int temp = arr[i][j] + arr[i][j+1] + arr[i][j+2];
                    if (i-1 >= 0) {
                        int temp2 = temp + arr[i-1][j+1];
                        if (max_result < temp2) max_result = temp2;
                    }
                    if (i+1 < n) {
                        int temp2 = temp + arr[i+1][j+1];
                        if (max_result < temp2) max_result = temp2;
                    }
                }
                if (i+2 < n) {
                    int temp = arr[i][j] + arr[i+1][j] + arr[i+2][j];
                    if (j+1 < m) {
                        int temp2 = temp + arr[i+1][j+1];
                        if (max_result < temp2) max_result = temp2;
                    }
                    if (j-1 >= 0) {
                        int temp2 = temp + arr[i+1][j-1];
                        if (max_result < temp2) max_result = temp2;
                    }
                }


            }
        }

        System.out.println(max_result);


    }



}
