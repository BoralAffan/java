package com.Affan.DS.Arrays.LoveBaber_Arrays;
// Q is to find union and intersection of two sorted array
public class Q6_unionIntersection_of_twoSortedArray {
    public static void main(String[] args) {
        int [] arr1={1,3,4,5,7};
        int [] arr2={2,3,5,6};
        System.out.println("Union");
union(arr1,arr2);
        System.out.println();
        System.out.println("intersection");
intersection(arr1,arr2);
    }

    static void union(int [] arr1,int [] arr2){
 int i=0;
 int j=0;
 while (i < arr1.length & j< arr2.length){
     if (arr1[i]<arr2[j]){
         System.out.print(arr1[i] + " ");
         i++;
     }
     else if (arr1[i]>arr2[j]){
         System.out.print(arr2[j] + " ");
         j++;
     }
     else {
         System.out.print(arr1[i] + " ");
         i++;
         j++;
     }
 }
 while (i< arr1.length)
     System.out.print(arr1[i++] + " ");
while (j< arr2.length)
    System.out.print(arr2[j] + " ");
    }



    static void intersection(int [] arr1, int [] arr2){
        int i=0;
        int j=0;
        while (i < arr1.length & j< arr2.length){
            if (arr1[i]<arr2[j]){
                i++;
            }
            else if (arr1[i]>arr2[j]){
                  j++;
            }
            else {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }


    }
}
