package com.zheldubovskiy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {3,1,5,4,2};
        System.out.println("Array = " + Arrays.toString(array));
       sort(array);
    }
    public static void sort(int[]arrayToSort) {
        int indexMin;
        for (int index = 0; index < arrayToSort.length - 1; index++){
            indexMin = index;
            for (int indexToScan = index; indexToScan < arrayToSort.length; indexToScan++){
                if (arrayToSort[indexMin] > arrayToSort[indexToScan]){
                    indexMin = indexToScan;
                }
            }
            int temp = arrayToSort[index];
            arrayToSort[index] = arrayToSort[indexMin];
            arrayToSort[indexMin] = temp;
        }
        System.out.println("Array to sort = " + Arrays.toString(arrayToSort));
    }

}
