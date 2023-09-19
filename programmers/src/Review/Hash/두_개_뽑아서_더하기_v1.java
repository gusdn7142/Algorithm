package Review.Hash;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 두_개_뽑아서_더하기_v1 {

    Set<Integer> set = new HashSet<>();
    int[] numbers;

    public int[] solution(int[] numbers) {
        this.numbers = numbers;

        //1. numbers[] 배열에서 두 수를 뽑아 더해서 중복되지 않으면 set에 담는 로직
        getResult(0, 0, 0);   //index, start, sum


        //2. set을 배열로 변환
        int[] result = new int[set.size()];
        int index = 0;
        for(int num : set){
            result[index++] = num;
        }

        //3. 배열을 오름차순 정렬
        Arrays.sort(result);

        return result;
    }


    //1. 재귀함수
    void getResult(int index, int start, int sum){

        if(index == 2) {  //기저조건
            set.add(sum);
        }else{
            for(int i=start; i<numbers.length; i++){
                sum += numbers[i];
                getResult(index+1, i+1, sum);
                sum -= numbers[i];
            }
        }
    }
}
