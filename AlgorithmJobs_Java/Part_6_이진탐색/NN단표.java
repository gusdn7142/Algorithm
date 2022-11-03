package Part_6_이진탐색;

import java.util.Scanner;

public class NN단표 {
    static Long n;    //n*n단표를 만들기 위한 n
    static Long k;   //출력할 원소의 인덱스 번호


    static Long getOrder(Long mid){
        //mid가 몇번째인지 인덱스를 반환하는 함수
        /*
          1 2 3 4          //찾는 숫자의 인덱스 : 8
          2 4 6 8
          3 6 9 12        //mid=10이라면   10/3 --> 3이므로  3개가 10보다 작은것이다.
          4 8 12 16       //mid=12이라면   12/4 --> 3이므로  3개가 12보다 작다고 하는데, 실제로는 2개가 작은것이므로 1개를 뺴준다.

          정렬된 숫자 : 1 2 2 3 3 4 4 4 6  6  8  8  9 12 12 16
          인덱스 :      1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
                        s             m                      e
        */

        Long result=0L;
        for(int i=1; i<=n; i++){

            if(i*n < mid) result += n;  //i단이 n보다 작으면 n개가 mid보다 작은것이다.
            else {                      //i단이 n보다 같거나 크면
                if(mid % i ==0) result += (mid/i)-1;  //i단에 mid와 같은값이 있으면 -1을 해준다.
                else result += mid/i;                 //i단에 mid와 같은값이 없으면
            }

        }
        return result+1;  //작은 숫자의 개수
    }




    public static void main(String[] args){
        //p가 몇번쨰 숫자인가 --> O(n)

        Scanner scan = new Scanner(System.in);

        //입력
        n = scan.nextLong();   //n*n단표를 만들기 위해 n입력...  1단부터 시작
        k = scan.nextLong();  //찾는 원소의 인덱스 번호 입력

        //변수 초기화
        Long start = 1L;       //1단부터 시작
        Long end = n*n+1L;    //n*n을 시도 하지 않기 때문에 +1 필요


        while(start+1 < end){   //start와 end가 붙어있다면
            //start는 항상 정답이 되는 숫자보다 작거나 같은 숫자
            //end는 항상 정답이 되는 숫자보다 큰 숫자
            //start, end

            Long mid = (start+end) / 2;     //중앙값 설정
            Long myOrder = getOrder(mid);    //함수 호출

            // if(myOrder ==k){
            //     System.out.println(mid);
            //     System.exit(0);
            // }


            if(myOrder <= k){     //가 k보다 작거나 같은 인덱스는 볼필요 없으므로 start를 mid로 옮긴다.
                start = mid;
            }
            else                  //와 k가 같을때는 end를 mid로 옮긴다..
                end = mid;
        }

        System.out.println(start);   //찾는 숫자


    }
}
