import java.util.Scanner;

public class Boj_1152 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        str = str.trim(); // 양쪽 공백제거
        String str2[] = str.split(" ");


        if(str2.length == 1 && str2[0].equals("")) {
            System.out.println(0);
        }else {
            System.out.println(str2.length);
        }


    }

}
