package Review.Math;

public class 약수의_개수와_덧셈_v1 {
    public int solution(int left, int right) {
        int num = 0;

        for(int i=left; i<=right; i++){
            int count = 0;  //i의 약수의 개수

            for(int j=1; j<=i/2+1; j++){
                if(i % j == 0) {
                    if (i / j == j) count++;        //i의 약수가 제곱수 이면, 약수의 개수 1증가
                    else count += 2;               //i의 약수의 제곱수가 아니면, 약수의 개수 2증가
                }
            }

            if(count % 2 == 0)  //i의 약수의 개수가 짝수이면
                num+=i;
            else               //i의 약수의 개수가 홀수이면
                num-=i;
        }

        return num;
    }
}
