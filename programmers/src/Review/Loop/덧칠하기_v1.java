package Review.Loop;

public class 덧칠하기_v1 {
    public int solution(int n, int m, int[] section) {

        int max = 0;
        int count = 0;

        for (int point : section) {
            if (max <= point) {
                max = point + m;
                count++;
            }
        }

        return count;
    }
}
