package yang.sort;

import java.util.Arrays;

public class QuickSort2 {


    public static void main(String[] args) {
        int[] arr = {23,35,1,33,7,9,0,1,33};
        qs(arr,0,arr.length -1);
        System.out.println(Arrays.toString(arr));
    }


    public static void qs(int[] arr,int start,int end){
        if(start >= end) return;
        int base = arr[start];
        int i = start,j = end;

        while(i<j){

            while(arr[j] >= base && i<j){
                j--;
            }

            while(arr[i] <= base && i<j){
                i++;
            }
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }

        arr[start] = arr[i];
        arr[i] = base;

        qs(arr,start,i-1);
        qs(arr,i+1,end);
    }


}
