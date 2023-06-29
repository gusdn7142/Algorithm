package Lv2;

public class n제곱_v1 {
    public int[] solution(int n, long left, long right) {

        int[] result = new int[(int)(right - left) + 1];   //1차원 배열

        //result 배열의 길이만큼 반복하면서 row와 col 값 큰 값을 result 배열에 저장
        for (int i = 0; i < result.length; i++) {
            int row = (int)(left / n + 1);   //가상 2차원 배열의 row
            int col = (int)(left % n + 1);   //가상 2차원 배열의 col

            left++;

            result[i] = Math.max(row, col);
        }

        return result;
    }
}
