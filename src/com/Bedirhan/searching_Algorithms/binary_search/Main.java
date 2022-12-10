package com.Bedirhan.searching_Algorithms.binary_search;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,5,8,7,11,23,35,76,99,122,123,546,1234,12345};
        if (binarySearch(arr,4,0, arr.length-1))
            System.out.println("yeah");
        else
            System.out.println("no");
    }

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
