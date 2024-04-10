package yang.sort;

import java.util.Arrays;

/**
 * <p>
 * 希尔排序
 * </p>
 *
 * @author Mr.Yang
 * @desc ShellSort
 * @date 2023/5/15 16:16
 */
public class ShellSort {


    public static void main(String[] args) {
        int[] arr = {133, 2, 5, 55, 23, 45, 97};
        shellSort2(arr);
        System.out.println(Arrays.toString(arr));

        shellSort2(arr);
        System.out.println(Arrays.toString(arr));
    }


    private static void shellSort(int[] arr) {
        for (int i = arr.length / 2; i > 0; i /= 2) {
            System.out.println(i);
            for (int j = i; j < arr.length; ++j) {
                for (int k = j - i; k >= 0; k -= i) {
                    if (arr[k + i] >= arr[k]) {
                        break;
                    } else {
                        // swap the value
                        int temp = arr[k];
                        arr[k] = arr[k + i];
                        arr[k + i] = temp;
                    }
                }
            }
        }
    }

    private static void shellSort2(int[] arr) {
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                int j = i;
                int curr = arr[i];
                while (j - gap >= 0 && curr < arr[j - gap]) {
                    arr[j] = arr[j - gap];
                    j = j - gap;
                }
                arr[j] = curr;
            }
        }
    }


}
