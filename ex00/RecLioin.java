package main.java.ex00;

public class RecLioin {
    public static void main(String[]args){
        Helloworld(0);
    }
    public static void Helloworld(int n){
        String num;
        if ( n== 11)
            return;
        else if(n==10){
            num = Integer.toString(n);
        }
        else{
          num = '0'+Integer.toString(n);
        }

        System.out.println("Hello Baby Lion "+num);
        Helloworld(n+1);
    }

}
