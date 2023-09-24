package Review.Loop;

public class H_Index {
    public int solution(int[] citations) {

        //h편 이상 인용되었을때 h의 최댓값 계산
        int max = 0;   //h당 논문들의 인용횟수 종합
        int h;         //H-Index
        for(h=0; h<10000; h++) {
            for(int i=0; i<citations.length; i++){

                if(citations[i] >= h){   //논문 i당 인용횟수가 h이상이면
                    max++;
                }
            }

            if(max < h){   //H-Index가 조건에 성립하지 않으면
                h-=1;
                break;
            } else{        //H-Index가 조건에 성립하면
                max = 0;
            }
        }
        
        return h;
    }
}
