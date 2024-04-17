package com.cbfacademy.sort;

public class QuickSort {
    
    void sort(int[] arr, int startIndex, int endIndex){
        
        if (startIndex < endIndex){
            
        }
    }

    boolean linearSearch(Object[] array, Object find){
        for(int i = 0; i < array.length; i++){
            if(array[i].equals(find)) {
                return true;
            }
        }
        return false;
    }

    int binarySearch(int[] array, int find){
        int mid = array.length / 2;
        
        while(true) {
            if(array[mid] == find) {
                return mid;
            } else if (find < array[mid]) {
                mid = mid / 2;
            } else if (find > array[mid]) {
                mid = mid + ((array.length - mid) / 2);
            } else {
                return -1;
            }
        }
    }
}
