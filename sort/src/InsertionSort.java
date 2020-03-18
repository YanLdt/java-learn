import java.util.Arrays;

/**
 * @Author: YanL
 * @Time: 20:54 2020/3/18
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] array = {13, 2, 3, 45, 6, 67, 7};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }

    /**
     * 插入排序--------------------------------------------------------
     * 1-----从第一个元素开始，认为第一个元素已经排序
     * 2-----取第二个元素，在已排序的元素序列中从后向前扫描
     *       如果已排序序列中的元素大于新元素，则将原来的元素往右移动
     * 3-----重复上述步骤直到找到小于或等于新元素的元素，将新元素插入
     *
     * 最佳情况：T(n) = O(n)   最坏情况：T(n) = O(n2)   平均情况：T(n) = O(n2)
     *
     * @param arr 待排序数组
     * @return  已排序数组
     */
    public static int[] insertionSort(int[] arr){
        if(arr.length == 0){
            return arr;
        }
        int cur;
        for(int i = 0; i < arr.length - 1; i++){
            cur = arr[i + 1];
            int preIndex = i;
            while (preIndex >= 0 && cur < arr[preIndex]){
                arr[preIndex + 1] = arr[preIndex];
                preIndex--;
            }
            arr[preIndex + 1] = cur;
        }

        return arr;
    }
}
