package com.Bedirhan.CodeWars.WhoLikesIt;

public class Solution {
    public static void main(String[] args) {
        String sf3=String.format("value is %1.12f",32.33434);
        System.out.println(sf3);
    }

    public static String whoLikesIt(String... names) {
        final int sizeOfAnArray = names.length;
        if(   !(sizeOfAnArray >=4)  ){
            if (sizeOfAnArray == 0) {
                return "no one likes this";
            } else if (sizeOfAnArray == 1) {
                return names[0]+" likes this";
            } else if (sizeOfAnArray == 2) {
                return names[0]+" and "+names[1]+" like this";
            }
            else
                return names[0]+", "+names[1]+" and "+names[2]+" like this";
        }
        return names[0]+", "+names[1]+" and "+(sizeOfAnArray-2)+" others like this";
    }

    // Alternative Solutions
//    public static String whoLikesIt(String... names) {
//        switch (names.length) {
//            case 0: return "no one likes this";
//            case 1: return String.format("%s likes this", names[0]);
//            case 2: return String.format("%s and %s like this", names[0], names[1]);
//            case 3: return String.format("%s, %s and %s like this", names[0], names[1], names[2]);
//            default: return String.format("%s, %s and %d others like this", names[0], names[1], names.length - 2);
//        }
//    }
}
