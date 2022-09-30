package com.heniux.jinx.demo2;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("输入的数字为: " + num);
        String str = sc.next();
        System.out.println("输入的内容为: " + str);
    }
}
