package com.heniux.jinx.demo2;

import java.util.ArrayList;

public class ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<6;i++) list.add(i);
        System.out.println(list);

        printArrayList(list);

    }

    public static void printArrayList(ArrayList<Integer> list){
        for(int i=0;i<list.size();i++){
            if(i==0) {
//                System.out.print("{" + list.get(i));
//                continue;
                System.out.print("{");
            }
            if(i==list.size()-1) {
                System.out.println(list.get(i) + "}");
                continue;
            }
            System.out.print(list.get(i) + "@");
        }
    }
}
