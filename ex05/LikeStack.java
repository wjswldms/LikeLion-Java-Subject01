package main.java.ex05;
import main.java.ex04.LikeList;

public class LikeStack {

    // ex04에서 만든 LikeList 사용
    private static LikeList list;

    // 추가
    public void push(int value) {
        list.insert(0,value);
    }
    // 스택이 비어있다면 true
    public boolean isEmpty() {
        return list.getSize() == 0;
    }
    // 삭제
    public void pop() {
        list.delete(0);
    }
    // 스택의 마지막 값 조회
    public int peek() {
        return list.get(0);
    }


    public static void main(String[] args) {
        LikeStack stack = new LikeStack();
        stack.list = new LikeList();

        System.out.println("스택이 비어있는지 확인: " + stack.isEmpty());

        stack.push(1);
        stack.push(3);
        stack.push(5);

        System.out.print("현재 Stack >>> ");
        list.print();

        System.out.println("stack peek >>> "+stack.peek());
        stack.pop();
        System.out.print("stack pop 후 >>> ");
        list.print();
        System.out.println();

    }
    }
