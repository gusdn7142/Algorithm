package Lv2;

public class 땅따먹기_v1 {

    int[][] land;
    int maxValue = 0;
    int sum = 0;

    void getResult(int index,int beforeCol){

        if(index == land.length){  //기저조건
            if(maxValue < sum)
                maxValue = sum;
        } else{
            for(int col=0; col<4; col++){
                if(beforeCol==col) continue;   //같은 열을 밟았으면

                sum += land[index][col];
                getResult(index+1, col);
                sum -= land[index][col];
            }
        }
    }

    int solution(int[][] land) {
        this.land = land;
        getResult(0, -1); //(index, beforeCol)
        return maxValue;
    }
}
