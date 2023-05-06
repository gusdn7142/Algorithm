package Lv0;

public class 짝수_홀수_개수_v1 {
    public int[] solution(int[] num_list) {
        int[] result = new int[2];

        for(int i=0; i<num_list.length; i++){
            result[num_list[i] % 2]++;   //홀수는 result[1]++, 짝수는 result[0]++
        }

        return result;
    }
}
