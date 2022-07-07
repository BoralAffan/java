package com.Affan.DS.Searching;

public class Find_Minimum {
    public static void main(String[] args) {
        int []arr={10,20,99,8,2,9,5,6,7,8,8,9,4,2,1,0,-122};

        System.out.println(Minimum(arr));
    }
    static int Minimum(int []arr){
        if (arr.length==0){
            return 000;
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {

            if (arr[i]<min){
                min =arr[i];

            }

        }
        return min;
    }
}
