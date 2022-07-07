import java.util.Scanner;

public class Boj_15596 {

    long sum(int[] arr){

        long sum = 0;


        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }

        return sum;

    }
}
