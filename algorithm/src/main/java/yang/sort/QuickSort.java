package yang.sort;

import java.util.Arrays;

/**
 * <p>
 * 快速排序
 * </p>
 *
 * @author Mr.Yang
 * @desc QuickSort
 * @date 2023/5/15 16:20
 */
public class QuickSort {


    public static void main(String[] args) {
        int[] arr = {133, 2, 5, 55, 23, 45, 97};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }


    private static void quickSort(int[] arr, int start, int end) {
        if (start > end) return;
        int partition = partition(arr, start, end);
        quickSort(arr, start, partition - 1);
        quickSort(arr, partition + 1, end);
    }

    private static int partition(int[] arr, int start, int end) {
        int base = arr[start];
        int i = start, j = end;
        while (i != j) {
            // 右边找到最小的
            while (arr[j] >= base && i < j) {
                j--;
            }

            // 左边找到大的
            while (arr[i] <= base && i < j) {
                i++;
            }

            // 调换
            if (i < j) {
               int temp =  arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
            }
        }

        arr[start] = arr[i];
        arr[i] = base;
        return i;
    }


}
