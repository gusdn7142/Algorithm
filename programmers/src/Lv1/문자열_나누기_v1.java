package Lv1;

public class 문자열_나누기_v1 {
    public int solution(String str) {
        int result = 0;   //분리한 문자열의 개수 증가
        char x = str.charAt(0);

        int count = 1;   //같은 숫자면 ++.  다른 숫자면 --

        for(int i=1; i<str.length(); i++){
            if (count == 0) {  //같은 문자와 다른 문자의 개수가 같으면
                x = str.charAt(i);
            }

            if (x == str.charAt(i)) {    //같은 문자이면 count++
                count++;
            } else {                    //다른 문자이면 count--
                count--;
            }

            if (count == 0) {  //같은 문자와 다른 문자의 개수가 같으면
                result++;      //분리한 문자열의 개수 증가
            }
        }
        //System.out.println(count);
        if(count > 0)        //남는 문자가 있다면
            result++;       //분리한 문자열의 개수 증가

        return result;
    }
}
