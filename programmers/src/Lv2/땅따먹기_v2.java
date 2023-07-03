package Lv2;

public class 땅따먹기_v2 {
    int solution(int[][] land) {
        int result = 0;  //마지막 행까지 내려왔을때 얻을 수 있는 최대값

        //1. i 행까지의 최대값 : 이전 행에서 현재 칸을 제외한 칸의 최대값을 더함
        for(int i = 1 ; i< land.length; i++){
            land[i][0] += Math.max(land[i-1][1], Math.max(land[i-1][2], land[i-1][3]));
            land[i][1] += Math.max(land[i-1][0], Math.max(land[i-1][2], land[i-1][3]));
            land[i][2] += Math.max(land[i-1][0], Math.max(land[i-1][1], land[i-1][3]));
            land[i][3] += Math.max(land[i-1][0], Math.max(land[i-1][1], land[i-1][2]));
        }

        //2. 마지막 행까지 내려왔을때 얻을 수 있는 최대값 : [land.length-1][0] ~ [land.length-1][3] 까지 중 최대값 계산
        for(int i = 0; i < 4; i++){
            result = Math.max(result, land[land.length-1][i]);
        }

        return result;
    }
}
