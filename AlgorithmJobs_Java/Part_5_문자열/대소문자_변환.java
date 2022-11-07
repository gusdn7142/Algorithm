package Part_4_문자열;

import java.util.Scanner;

public class 대소문자_변환 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        //입력
        String str = scan.nextLine();

        //문자열을 문자 배열로 변환
        char[] charArray = str.toCharArray();

        //문자 변환      (대문자=>소문자, 소문자=>대문자)
        for(int i=0; i<charArray.length; i++){       //length 주의!!!!!

            if(Character.isUpperCase(charArray[i])){      //대문자이면
                charArray[i] = Character.toLowerCase(charArray[i]);
            }
            else if(Character.isLowerCase(charArray[i])){   //소문자이면
                charArray[i] = Character.toUpperCase(charArray[i]);
            }
        }

        System.out.println(charArray);

    }
}
