package com.heniux.jinx.demo2;
/*
 * Java语法 096 面向对象思想的概述 || 视频 V0004 传智播客 黑马程序员 Java | Java语法基础 558个视频
 * https://www.youtube.com/watch?v=PFvIvaaXNWM
 */

import java.util.Arrays;

public class PrintArray {
    public static void main(String[] args) {
        
        int[] array = {1, 2, 3, 4, 5};

        System.out.print("[");
        for(int i=0;i<array.length;i++){
            if(i == 4){
                System.out.println(array[i] + "]");
                break;
            }
            System.out.print(array[i] + ", ");
        }
        System.out.println("========================");
        System.out.println(Arrays.toString(array));

    }
}
