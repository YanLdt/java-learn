import java.util.Arrays;

/**
 * @Author: YanL
 * @Time: 17:42 2020/3/18
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class HeapSort {

    public static void main(String[] args) {
        int[] array = {1,4,3,2,6,9,8,7,5};
        System.out.println(Arrays.toString(heapSort(array)));
    }
    public static int[] heapSort(int[] array){
        int len = array.length;
        if(array.length == 0){
            return array;
        }
        for(int i = len / 2 - 1; i >= 0; i--){
            adjustHeap(array, i, len);
        }

        for(int j = len - 1; j > 0; j--){
            swap(array, 0, j);
            adjustHeap(array, 0, j);
        }

        return array;
    }


    public static void adjustHeap(int[] arr, int i, int length){
        int tmp = arr[i];
        for(int k = i*2 + 1; k < length; k=k*2+1){
            if(k+1<length && arr[k] < arr[k+1]){
                k++;
            }
            if(arr[k] > tmp){
                arr[i] = arr[k];
                i = k;
            }else{
                break;
            }
        }
        arr[i] = tmp;
    }

    public static void swap(int []arr,int a ,int b){
        int temp=arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
