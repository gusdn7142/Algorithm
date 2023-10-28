package Review.Math;

public class 소수_찾기_v1 {
    public int solution(int n) {
        int count = 0;

        //1부터 n까지의 소수의 개수 계산
        for(int i=2; i<=n; i++){
            boolean flag = true;    //소수 판별

            for(int j=2; j<=Math.sqrt(i); j++){     //i의 제곱근까지 반복
                if(i % j ==0){
                    flag = false;   //소수가 아님
                    break;
                }
            }

            if(flag)  //소수이면
                count++;
        }

        return count;
    }
}
