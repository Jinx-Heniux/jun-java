package com.heniux.jinx.demo2;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListRandom1 {
    public static void main(String[] args) {
        ArrayList<Integer> intAl = new ArrayList<Integer>();
        Random rd = new Random();
        for(int i=0;i<6;i++){
            int num = rd.nextInt(33) + 1;
            intAl.add(num);
        }

        for(int i=0;i<intAl.size();i++){
            System.out.println("第" + (i+1) + "个数字为： " + intAl.get(i));
        }
    }
}
