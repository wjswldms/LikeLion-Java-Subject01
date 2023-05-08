package ex00;

public class RecLion {

    public static void rec(int dept) {
        if (dept == 10) {
            System.out.println("Hello Baby Lion " + dept);
            return;
        }
        System.out.println("Hello Baby Lion 0" + dept);
        rec(dept + 1);
    }

    public static void main(String[] args) {
        rec(1);
    }
}
