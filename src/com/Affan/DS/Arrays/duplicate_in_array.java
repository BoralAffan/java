package com.Affan.DS.Arrays;

public class duplicate_in_array {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,1,4,5,6,7};
        findDuplicate(arr);
    }

    static void findDuplicate(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i]==arr[j]){
                    System.out.println("Duplicate found in array  : "+arr[i] );
                }

            }

        }

    }

}
