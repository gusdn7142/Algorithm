package Lv2;

public class 연속된_부분_수열의_합_v1 {
    public int[] solution(int[] sequence, int k) {
        int[] result = new int[2];  //조건을 만족하는 부분 수열의 시작 인덱스와 마지막 인덱스를 담은 배열
        int length = Integer.MAX_VALUE;

        for(int i=0; i<sequence.length; i++){
            if(sequence[i] == k){
                result[0] = i;
                result[1] = i;
                break;
            }
            int sum = sequence[i];

            for(int j=i+1; j<sequence.length; j++){
                sum += sequence[j];

                if(sum == k && length > j-i){     //부분수열의 합이 k를 만족하고 가장 짧은 수열이면
                    result[0] = i;
                    result[1] = j;
                    length = j-i;
                } else if(sum > k) {
                    break;
                }
            }

        }

        return result;
    }
}
