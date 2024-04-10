package yang.sort;

import java.util.Arrays;

/**
 * <p>
 *     冒泡排序
 * </p>
 * @author Mr.Yang
 * @desc BubbleSort
 * @date 2023/5/15 14:37
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {133, 2, 5, 55, 23, 45, 97};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        bubbleSort2(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void bubbleSort2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}
