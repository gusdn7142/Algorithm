package Lv1;

public class 최대공약수와_최소공배수_v1 {
    public int[] solution(int n, int m) {

        int index = Math.min(n, m);

        int sumGcd = 1; //최대공약수
        int sumLcm = 1;  //최소공배수
        int temp = 0;

        for(int i=1; i<=index; i++){

            if(n % i == 0 && m % i == 0){  //최대 공약수 계산
                sumGcd *= i;                //최대공약수 셋팅
                temp = (n / i) * (m / i);   //최소 공배수에 사용되는 수
                n = n / i;                  //n 갱신
                m = m / i;                  //m 갱신
                if(i>1)
                    i--;                    //나누는 수 반복
            }
        }
        sumLcm = sumGcd * temp;   //최소 공배수 셋팅


        return new int[]{sumGcd,sumLcm};
    }
}
