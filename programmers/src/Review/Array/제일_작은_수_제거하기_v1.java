package Review.Array;

public class 제일_작은_수_제거하기_v1 {
    public int[] solution(int[] arr) {

        //1. 배열 길이가 1인 경우 -1 반환
        if(arr.length == 1){
            int[] result = {-1};
            return result;
        }

        //2. 최소 값 구하기
        int min = arr[0];
        for(int i=0; i<arr.length; i++) {
            min = Math.min(min, arr[i]);
        }
        
        //3. 최소 값을 제외하고 새로운 배열에 값을 저장
        int index = 0;
        int[] result = new int[arr.length-1];

        for(int i=0; i<arr.length; i++) {
            if(arr[i] == min) {
                continue;
            }

            result[index++] = arr[i];
        }

        return result;
    }
}
