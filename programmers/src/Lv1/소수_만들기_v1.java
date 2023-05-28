package Lv1;

public class 소수_만들기_v1 {
    public int solution(int[] nums) {
        int count = 0;

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++){
                    boolean flag = true;

                    int temp = nums[i] + nums[j] + nums[k];
                    for(int l=2; l<=Math.sqrt(temp); l++){
                        if(temp % l ==0){   //소수가 아니면
                            flag = false;
                            break;
                        }
                    }

                    if(flag) {   //소수이면
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
