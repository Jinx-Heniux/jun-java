package com.heniux.jinx.demo2;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        System.out.println("请输入数字： ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("输入的数字为: " + num);

        System.out.println("请输入字符串： ");
        String str = sc.next();
        System.out.println("输入的内容为: " + str);
    }
}
