package com.Bedirhan.searching_Algorithms.binary_search;

public class Main {

    public static boolean binarySearch(int[] arr,int target,int low,int high){
        if (low > high)
            return false;
        else {
            int mid =(low +high)/2;
            if (target == arr[mid])
                return true;
            else if (target>arr[mid]) {
                return binarySearch(arr, target, mid+1, high);
            }else {
                return binarySearch(arr, target, low, mid-1);
            }
        }
    }
}
