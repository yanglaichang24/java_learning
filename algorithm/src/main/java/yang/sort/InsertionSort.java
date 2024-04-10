package yang.sort;

import java.util.Arrays;

/**
 * <p>
 *     插入排序
 * </p>
 * @author Mr.Yang
 * @desc InsertionSort
 * @date 2023/5/15 15:09
 */
public class InsertionSort {


    public static void main(String[] args) {
        int[] arr = {133, 2, 5, 55, 23, 45, 97};

        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }


    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            //执行向后操作
            for (;j >= 0 && arr[j] > temp; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j+1] = temp;
        }
    }


}
