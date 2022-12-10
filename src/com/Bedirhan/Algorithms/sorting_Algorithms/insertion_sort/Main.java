package com.Bedirhan.Algorithms.sorting_Algorithms.insertion_sort;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(r.nextInt(10));
        }
    }
    static void sort(int arr[])
    {
        int n = arr.length;
        for (int i=1; i<n; ++i)
        {
            int deger = arr[i];
            int j = i-1;

            while (j>=0 && arr[j] > deger)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = deger;
        }
    }
}
