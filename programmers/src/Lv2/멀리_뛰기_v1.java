package Lv2;

public class 멀리_뛰기_v1 {
    long getResult(int index){
        long count = 0;

        if(index <= 3){   //기저조건
            return index;   //index칸의 끝에 도달하는 방법의 수
        }else{
            count = getResult(index-1) + getResult(index-2);
            return count;   //index칸의 끝에 도달하는 방법의 수
        }
    }

    public long solution(int n) {

        long count = getResult(n);   //n칸의 끝에 도달하는 방법의 수
        return count % 1234567;
    }
}
