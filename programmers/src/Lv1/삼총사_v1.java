package Lv1;

public class 삼총사_v1 {
    int[] number;
    int count = 0;

    public int solution(int[] number) {   //조합 문제
        this.number = number;
        int temp = 0;

        getResult(0, 0, temp);    //index, start, temp

        return count;
    }

    //nC3
    void getResult(int index, int start, int temp){

        if(index == 3) {   //기저조건
            if(temp==0)
                count++;
        }
        else{
            for(int i=start; i<number.length; i++){
                temp += number[i];
                getResult(index+1, i+1, temp);
                temp -= number[i];
            }
        }

    }
}
