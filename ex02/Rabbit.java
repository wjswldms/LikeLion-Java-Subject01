//n개월에 토끼 수,피보나치 n번째 항의 값
package ex02;

import java.util.Scanner;

public class Rabbit {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("토끼 수를 알고 싶은 개월을 적으시오: ");
        int n=scanner.nextInt();
        int result=2*fibo(n);
        System.out.println(result);
    }

    public static int fibo(int n) {
        if(n==1){
            return 1;
        }
        else if(n==0){
            return 0;
        }
        else return fibo(n-2)+fibo(n-1);

    }

}

