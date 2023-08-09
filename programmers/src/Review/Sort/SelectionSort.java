package Review.Sort;

public class SelectionSort {

    //선택 정렬 함수
    private static void selectionSort(int[] arr, int start){

        int end = arr.length-1;  //끝 인덱스 셋팅

        while(start < end){
            int min_index = start;              //최소값 인덱스 셋팅

            //최소값을 가진 인덱스를 찾기
            for(int i=start; i<=end; i++){
                if(arr[i] < arr[min_index]){
                    min_index = i;             //최소값을 가진 인덱스 갱신
                }
            }
            //arr[start]와 arr[min_index] 값 스왑
            swap(arr, start, min_index);

            start++;  //start 인덱스를 1증가 후 다음 정렬로 이동
        }
    }

    //스왑 함수
    private static void swap(int[] arr, int index1, int index2){
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }
}
