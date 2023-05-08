package main.java.ex01;

import java.util.Scanner;

public class Factorical {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("n >>> ");
        int num = scanner.nextInt();
        int res = factorial(num);
        System.out.print(res);
    }
    public static int factorial(int n){
        if (n>1)
            return n * factorial(n-1);
        else
            return 1;
    }
}
