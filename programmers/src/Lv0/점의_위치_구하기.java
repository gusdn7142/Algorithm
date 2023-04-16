package Lv0;

public class 점의_위치_구하기 {
    public int solution(int[] dot) {
        int result = 0;
        int x = dot[0];
        int y = dot[1];


        if(-500<=x && x<=500 && -500<=y && y<=500){
            if(x>0){
                if(y>0) result = 1;     //1사분면
                else result = 4;        //4사분면
            }else{
                if(y>0) result = 2;     //2사분면
                else result = 3;        //3사분면
            }
        }

        return result;
    }
}
