package com.heniux.jinx.demo2;

import java.util.Random;
import java.util.Scanner;

public class RandomDemo {
    public static void main(String[] args) {
        Random r = new Random();
        int num1 = r.nextInt();
        System.out.println("num1 = " + num1);

        for(int i=0;i<10;i++){
            int num2 = r.nextInt(10);
            System.out.print(i + " -> " + num2 + " | ");
        }
        System.out.println();
        System.out.println();

        int num = r.nextInt(10) + 1; // 1~10
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.println("请输入你猜测的数字： ");
            int yourguess = s.nextInt();
            if(yourguess > num){
                System.out.println("你猜大了，小点儿！");
            } else if (yourguess < num) {
                System.out.println("你猜小了，大点儿！");
            } else {
                System.out.println("恭喜，猜对了！");
                break;
            }
        }
        System.out.println("游戏结束！");
    }
}
