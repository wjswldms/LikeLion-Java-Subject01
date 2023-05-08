package main.java.ex03;

import java.util.Scanner;

public class LegoBlock {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("레고의 개수 >>>");
        int n= scanner.nextInt();
        System.out.println("출발지 >>>");
        int i= scanner.nextInt();
        System.out.println("목적지 >>>");
        int j= scanner.nextInt();
        int k =0;

        if ((i == 1 && j ==2)||(i == 2 && j ==1)) k=3;
        else if ((i == 1 && j ==3)||(i == 3 && j ==1)) k=2;
        else if ((i == 2 && j ==3)||(i == 3 && j ==2)) k=2;

        hanoi(n,i,j,k);
    }
    public static void hanoi(int n,int start, int end,int sub){
        if (n==1){
            move(1,start,end);


        }else{
            hanoi(n-1,start,sub,end);
            move(n,start,end);
            hanoi(n-1,sub,end,start);
        }

    }
    public static void move(int n,int i,int j){
        System.out.println(n+"번 블럭을 "+i+"에서"+j+"로 이동");

    }
}
