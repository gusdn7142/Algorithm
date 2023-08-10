package Review.Sort;

public class insertionSort {
    //삽입 정렬 함수 : index 번지부터 비교하면서 아래 값들을 정렬
    public static void insertionSort(int[] arr) {

        for (int index = 1; index < arr.length; index++) {
            for(int start = index; start > 0; start--){
                if(arr[start - 1] < arr[start]) break;
                swap(arr, start - 1, start);
            }
        }
    }

    //스왑 함수
    private static void swap(int[] arr, int index1, int index2){
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }
}
