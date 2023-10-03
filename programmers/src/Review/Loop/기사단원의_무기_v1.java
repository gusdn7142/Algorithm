package Review.Loop;


public class 기사단원의_무기_v1 {
    public int solution(int number, int limit, int power) {
        int result = 0;        //무기점의 주인이 무기를 모두 만들기 위해 필요한 철의 무게

        //1. number 수의 기사단원들의 약수의 개수(무기의 공격력)를 구해 배열에 저장한다.
        int[] op = new int[number+1];

        for(int i=1; i<=number; i++){             //1~number까지 반복
            for(int j=1; j<=number / i; j++){   //1~i의 제곱근까지 반복
                op[i * j]++;        //i의 약수의 개수 저장
            }
        }

        //System.out.println(Arrays.toString(op));


        //2. number 수의 기사단원들이 가진 무기를 철로 만들기 위해 필요한 총 무게 계산
        for(int i=1; i<op.length; i++){
            if(op[i] <= limit) {   //무기의 공격력이 이웃나라 제한 공격력보다 같거나 작다면
                result += op[i];   //기존 무기의 공격력으로 철의 무게를 셋팅
            } else {              //무기의 공격력이 이웃나라 제한 공격력보다 크다면
                result += power;   //이웃나라 공격력으로 철의 무게를 셋팅
            }
        }


        return result;
    }
}
