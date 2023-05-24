package Lv1;

public class 약수의_개수와_덧셈_v1 {
    public int solution(int left, int right) {
        int num = 0;

        for(int i=left; i<=right; i++){
            int count = 0;  //i의 약수의 개수

            for(int j=1; j<=i; j++){
                if(i % j == 0)
                    count ++;      //i의 약수의 개수 카운트
            }

            if(count % 2 == 0)  //i의 약수의 개수가 짝수이면
                num+=i;
            else               //i의 약수의 개수가 홀수이면
                num-=i;
        }

        return num;
    }
}
