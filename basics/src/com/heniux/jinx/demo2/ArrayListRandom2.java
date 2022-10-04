package com.heniux.jinx.demo2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class ArrayListRandom2 {
    public static void main(String[] args) {
        ArrayList<Integer> num_list = new ArrayList<>();
        Random rd = new Random();
        for(int i=0;i<20;i++){
            num_list.add(rd.nextInt(100) + 1);
        }
        System.out.println(num_list);

        ArrayList<Integer> oushu_list = getOuShuList(num_list);
        System.out.println(oushu_list);
    }

    public static ArrayList<Integer> getOuShuList(ArrayList<Integer> list){
        ArrayList<Integer> oushu_list = new ArrayList<>();
        for(int i=0;i<list.size();i++){
            int num = list.get(i);
            if(num % 2 == 0) oushu_list.add(num);
        }
        return oushu_list;
    }
}
