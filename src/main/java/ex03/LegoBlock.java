package ex03;

import java.util.Scanner;

public class LegoBlock {

    public static void lego(int n, int st, int en, int tmp) {
        if (n == 0) {
            return;
        }
        lego(n - 1, st, tmp, en);
        System.out.println(n + "번 레고를 " + st + "에서 " + en + "로 옮깁니다.");
        lego(n - 1, tmp, en, st);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n, i, j를 입력하세요.");
        int n = sc.nextInt();
        int i = sc.nextInt();
        int j = sc.nextInt();
        lego(n, i, j, 6 - i - j);
    }
}
