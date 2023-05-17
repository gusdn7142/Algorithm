package Lv0;

public class 홀수_짝수 {
    public int solution(int[] num_list) {
        int result = 0;
        int maxEven = 0;   //짝수의 최댓값
        int maxOdd = 0;    //홀수의 최댓값

        for(int i=0; i<num_list.length; i++){
            if((i+1)%2==0)  //짝수이면
                maxEven += num_list[i];
            else             //홀수이면
                maxOdd += num_list[i];
        }

        result = Math.max(maxEven, maxOdd);

        return result;
    }
}
