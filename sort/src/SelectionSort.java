import java.util.Arrays;

/**
 * @Author: YanL
 * @Time: 16:59 2020/3/18
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class SelectionSort {
    public static void main(String[] args) {

        int[] array = {13, 2, 3, 45, 6, 67, 7};
        System.out.println(Arrays.toString(selectionSort(array)));

    }

    /**
     * 选择排序----------------------不占额外存储空间---不受输入数据的影响
     * 1------在未排序序列中找到最小元素，然后存放到排序序列的起始位置
     * 2------从剩余元素中继续寻找最小元素，放到已排序序列的末尾
     * 3------以此类推
     *
     * 最佳情况：T(n) = O(n2)  最差情况：T(n) = O(n2)  平均情况：T(n) = O(n2)
     * 适合数据规模较小
     *
     * @param array 待排序数组
     * @return  返回已排序数组
     */
    public static int[] selectionSort(int[] array){
        if(array.length == 0){
            return array;
        }

        for(int i = 0; i < array.length; i++){
            int minIndex = i;
            for(int j = i; j < array.length; j++){
                if(array[j] < array[minIndex]){
                    minIndex = j;
                }
            }
            int tmp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = tmp;
        }
        return array;
    }
}
