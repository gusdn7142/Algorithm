package Lv2;

public class 숫자_변환하기_v1 {
    int result = Integer.MAX_VALUE;   //x를 y로 변환하기 위해 필요한 최소 연산 횟수
    int count = 0;    //x를 y로 변환하기 위해 사용한 연산 횟수

    int x;
    int y;
    int n;
    int op[] = new int[3];


    void getResult(int conValue, int count){

        if(conValue >= y){  //기저조건
            if(conValue == y && result > count){
                result = count;
            }
        }else{
            for(int i=0; i<op.length; i++){

                if(i==0)
                    conValue += op[i];
                else if(i==1)
                    conValue *= op[i];
                else if(i==2)
                    conValue *= op[i];

                getResult(conValue, count+1);
            }
        }
    }

    public int solution(int x, int y, int n) {
        this.x = x;
        this.y = y;
        this.n = n;
        op[0] = n;
        op[1] = 2;
        op[2] = 3;

        getResult(x, count);

        if(result == Integer.MAX_VALUE)
            result = -1;

        return result;
    }
}
