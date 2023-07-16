package Review.Array;

public class 덧칠하기_v1 {
    public int solution(int n, int m, int[] section) {

        int max = 0;
        int count = 0;

        for (int point : section) {
            if (max <= point) {    //페인트 칠할 영역에 해당되면
                max = point + m;   //롤러로 페인트 칠
                count++;
            }
        }

        return count;
    }
}
