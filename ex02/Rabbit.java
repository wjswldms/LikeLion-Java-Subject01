package main.java.ex02;

import java.util.Scanner;

public class Rabbit {
    public static void main(String[]args){
        System.out.print("N 개월 >>> ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int res = rabbit(n);
        System.out.println(n+ " Month Later >>> "+res);
    }
    public static int rabbit(int n){
        if (n>2)
            return 2*(rabbit(n-2) + rabbit(n-1));
        else
            return 1*2;

    }
}

