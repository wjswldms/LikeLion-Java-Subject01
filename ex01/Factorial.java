//입력받은 N의 N!을 재귀함수로 구하기
package ex01;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("정수를 입력하세오: ");
        int n=scanner.nextInt();
        int result=facto(n);
        System.out.println(result);
    }

    public static int facto(int m){
        if (m==1){
            return 1;
        }
        return m*facto(m-1);
    }
}
