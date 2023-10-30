package Review.Math;

public class 소수_만들기_v1 {

    int count = 0;
    int[] nums;

    public int solution(int[] nums) {
        this.nums = nums;

        //재귀함수 : nC3
        getResult(0, 0, 0);   //index, start, sum

        return count;
    }

    //재귀함수 : nums[] 배열에서 서로 다른 3개의 숫자의 합이 소수가 되는 경우의 수 계산
    void getResult(int index, int start, int sum) {

        if(index == 3){  //기저조건
            if(isPrime(sum)){  //소수이면
                count++;
            }
        }else{
            for(int i=start; i<nums.length; i++){
                sum += nums[i];
                getResult(index+1, i+1, sum);
                sum -= nums[i];
            }
        }
    }


    //소수 판별 함수
    boolean isPrime(int n){

        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i ==0){  //소수가 아니면
                return false;
            }
        }
        return true;
    }

}
