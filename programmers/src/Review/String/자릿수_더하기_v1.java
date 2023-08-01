package Review.String;

public class 자릿수_더하기_v1 {
    public int solution(int n) {
        int result = 0;

        while (n != 0) {
            result += n % 10;    //i번째 자릿수 더하기
            n /= 10;
        }

        return result;
    }
}
