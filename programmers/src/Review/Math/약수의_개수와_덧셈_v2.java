package Review.Math;

public class 약수의_개수와_덧셈_v2 {
    public int solution(int left, int right) {
        int num = 0;

        for(int i=left; i<=right; i++){
            if(i % Math.sqrt(i) == 0)  //i가 제곱근으로 나누어 떨어지면, 약수의 개수는 홀수
                num -= i;
            else  //i가 제곱은으로 나누어 떨어지지 않으면, 약수의 개수는 짝수
                num += i;
        }

        return num;
    }
}
