package com.Bedirhan.searching_Algorithms.linear_search;

import java.util.List;

public class LinearSearch {
    public static void main(String[] args) {

    }

    public static <E> int linear_search(List<E> list, E e){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(e))
                return i;
        }
        return -1;
    }
}
