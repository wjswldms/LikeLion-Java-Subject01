package ex02;

import java.util.Scanner;

public class Rabbit {

    public static int rabbi(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return rabbi(n - 1) + rabbi(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(2 * rabbi(sc.nextInt()));
    }
}
