package Lv2;

public class 뒤에_있는_큰_수_찾기_v1 {
    public int[] solution(int[] numbers) {
        int[] result = new int[numbers.length];   //뒷 큰수들을 담은 배열

        //numbers[] 배열의 각 원소에 대해 뒷 큰수를 result[]에 저장
        for(int i=0; i<numbers.length; i++){
            int max = numbers[i];

            for(int j=i+1; j<numbers.length; j++){

                if(max < numbers[j]){
                    max = numbers[j];
                    break;
                }
            }

            if(max == numbers[i])
                result[i] = -1;
            else
                result[i] = max;
        }

        return result;
    }
}
