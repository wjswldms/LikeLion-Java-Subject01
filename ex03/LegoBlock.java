//하노이탑

package ex03;

import java.util.Scanner;

public class LegoBlock {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("레고의 개수를 입력하시오: ");
        int n=scanner.nextInt();
        System.out.print("처음엔 몇 번째 발판에 쌓아둘까요(1~3): ");
        int i=scanner.nextInt();
        System.out.print(i+"번째 발판을 몇 번째 발판으로 옮길까요(1~3): ");
        int j=scanner.nextInt();
        int m=Math.abs(j-i); //가운데 발판 (i>j일 경우 대비, 절댓값 메소드 사용)
        LegoLetsgo(n,i,j,m);
    }

    public static void LegoLetsgo(int n, int i, int j,int m) {
        if (n==0)
            return;
        LegoLetsgo(n-1,i,m,j);
        System.out.println(n+"번 레고를"+i+"에서"+j+"로 옮깁니다.");
        LegoLetsgo(n-1,m,j,i);
    }

}



