package yang.sort;

import java.util.Arrays;

/**
 *  <p>
 *      选择排序
 *  </p>
 * @author Mr.Yang
 * @desc SelectionSort
 * @date 2023/5/15 15:09
 */
public class SelectionSort {


    public static void main(String[] args) {
        int[] arr = {133, 2, 5, 55, 23, 45, 97};

        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

        selectionSort2(arr);
        System.out.println(Arrays.toString(arr));
    }


    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
               if(arr[j] < min){
                 min = arr[j];
                 index = j;
               }
            }
            int temp = arr[i];
            arr[i] = min;
            arr[index] = temp;
        }
    }

    private static void selectionSort2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int max = arr[i];
            int index = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] > max){
                    max = arr[j];
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = max;
            arr[index] = temp;
        }
    }




}
