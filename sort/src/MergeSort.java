import java.util.Arrays;

/**
 * @Author: YanL
 * @Time: 11:39 2020/3/31
 * @Email: imyanl.dt@gmail.com
 * @Description: 归并排序---稳定排序---速度仅次于快排O(nlogn)    适用于总体无序，子项相对有序的数列
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] array = {1,4,3,2,6,9,8,7,5};
        mergeSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }


    public static void mergeSort(int[] nums, int begin, int end){
        if(begin < end){
            int middle = (begin + end) / 2;
            mergeSort(nums, begin, middle);
            mergeSort(nums, middle + 1, end);
            merge(nums, begin, middle, end);
        }
    }
    private static void merge(int[] nums, int left, int middle, int right){
        int[] temp = new int[nums.length];
        int middle1 = middle + 1;
        int tempIndex = left;
        int index = left;
        //将两个数组按大小放入中间数组
        while(left <= middle && middle1 <= right){
            if(nums[left] < nums[middle1]){
                temp[tempIndex++] = nums[left++];
            }else {
                temp[tempIndex++] = nums[middle1++];
            }
        }
        //左边或右边遍历完之后
        while(left <= middle){
            temp[tempIndex++] = nums[left++];
        }
        while(middle1 <= right){
            temp[tempIndex++] = nums[middle1++];
        }
        //中间数据存入原始数组
        while (index <= right){
            nums[index] = temp[index++];
        }
    }

}
