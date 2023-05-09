// Hello Baby Lion 00~10 출력하기

package ex00;

public class RecLion {
    public static void main(String[] args){
        hello(0);
    }

    public static void hello(int n) {
        if(n==11){
            return;
        }
        else if (n==10){
            System.out.println("Hello Baby Lion "+n);
        }
        else System.out.println("Hello Baby Lion 0"+n);
        hello(n+1);
    }
}
