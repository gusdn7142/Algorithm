package Lv1;

import java.util.Arrays;

public class 체육복_v1 {
    public int solution(int n, int[] lost, int[] reserve) {

        //학생 정렬
        Arrays.sort(lost);
        Arrays.sort(reserve);

        //1. 체육복 도난당한 학생이 여벌 체육복이 있을떄, 처리
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(lost[i] == 0 || reserve[j] == 0) continue;

                if(lost[i] == reserve[j]){            //자기 자신에게 빌려줌
                    lost[i] = 0;
                    reserve[j] = 0;
                    break;
                }
            }
        }

        //2. 체육복 도난당한 학생이 여벌 체육이 없을때, 여벌 체육복 빌리는 로직
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(lost[i] == 0 || reserve[j] == 0) continue;

                if(lost[i] == reserve[j]-1){   //앞 번호에게 빌려줌
                    lost[i] = 0;
                    reserve[j] = 0;
                    break;
                } else if(lost[i] == reserve[j]+1){   //뒷 번호 에게 빌려줌
                    lost[i] = 0;
                    reserve[j] = 0;
                    break;
                }
            }
        }

        //3. 체육복을 가진 인원 수 구하기
        int result = n-lost.length;

        for(int i=0; i<lost.length; i++){
            if(lost[i]==0)
                result++;
        }

        return result;
    }
}
