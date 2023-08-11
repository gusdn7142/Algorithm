package Review.Sort;

public class BubbleSort {
    //버블 정렬 함수 : 배열의 i-1번째 값과 i번째 값을 비교하여 i-1번째 값이 더 크면 스왑
    public static void bubbleSort(int[] arr) {

        int end = arr.length-1;
        while(end > 0){
            for(int i=1; i<=end; i++){
                if(arr[i-1] > arr[i]){
                    swap(arr, i-1, i);
                }
            }
            end--;  //마지막 인덱스를 1씩 줄임
        }
    }
    //스왑 함수
    private static void swap(int[] arr, int index1, int index2){
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }
}
