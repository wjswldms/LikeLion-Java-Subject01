package ex01;

import java.util.Scanner;

public class Factorial {
    public static void fac(int dept, int max, int sum) {
        if (max == 0) {
            System.out.println(1);
            return;
        }
        if (dept == max) {
            System.out.println(dept * sum);
            return;
        }
        fac(dept + 1, max, sum * dept);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        fac(1, sc.nextInt(), 1);
    }
}
