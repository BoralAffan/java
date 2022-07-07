package com.Affan.DS.Arrays;

import java.util.*;

public class delete_duplicate_fromArrays {
    public static void main(String[] args) {

        int [] arrWithDuplicate={1,2,3,44,55,6,66,55,44};
        System.out.println("Original array :");
        for (int i = 0; i < arrWithDuplicate.length; i++) {
            System.out.print(arrWithDuplicate[i] + " ");
        }
        System.out.println();
   delete_duplicate_using_set(arrWithDuplicate);


        HashMap<Integer,Integer> map=new HashMap<>();

//         map.put("Affan",1);
//         map.put("Adil",2);
//         map.put("ayyan",3);
//
//        System.out.println(map);
//
//        System.out.println(map.size());
//        System.out.println(map.get("Affan"));
//
//        if (map.containsKey("Adil")){
//            int a=map.get("Adil");
//            System.out.println("key of \"Adil\" is " + a);
//        }

        for (int i = 0; i < arrWithDuplicate.length; i++) {
            if (map.containsKey(arrWithDuplicate[i])){
                map.put(arrWithDuplicate[i],map.get(arrWithDuplicate[i])+1);
            }
            else {
             map.put(arrWithDuplicate[i],1);
            }
        }

        map.forEach((k,v) -> System.out.print(k + " "));

    }

static void delete_duplicate_using_set(int [] arr){
    Set<Integer> st= new HashSet<>();

    for (int i = 0; i < arr.length ; i++) {
        st.add(arr[i]);
    }

    st.forEach(elem -> System.out.print(elem + " "));
    System.out.println();
}
}


