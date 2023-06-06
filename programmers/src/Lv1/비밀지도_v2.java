package Lv1;

public class 비밀지도_v2 {
    public String[] solution(int n, int[] arr1, int[] arr2) {

        String[] result = new String[n];

        //1. arr1[i]와 arr2[i]를 OR 연산한 값을 2진수로 변환하여 result[] 배열에 저장
        for (int i = 0; i < n; i++) {
            result[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
        }

        //2. 비밀지도 result[] 배열 생성
        for (int i = 0; i < n; i++) {
            result[i] = String.format("%" + n + "s", result[i]);   //길이를 n으로 셋팅
            result[i] = result[i].replaceAll("1", "#");
            result[i] = result[i].replaceAll("0", " ");
        }

        return result;
    }
}
