package main.java.ex06;
import main.java.ex04.LikeList;
public class LikeQueue {
        // ex04에서 만든 LikeList 사용
        public static LikeList list;

        // 추가
        public void enqueue(int value) {
            list.insert(0, value);
        }
        // 삭제
        public void dequeue() {
            list.delete(list.getSize() - 1);
        }
        // 큐의 첫번쨰 값 조회
        public int peek() {
            return list.get(list.getSize() - 1);
        }
        // 큐가 비었는지 확인
        public boolean isEmpty() {
            return list.getSize() == 0;
        }

    public static void main (String[] args) {
        LikeQueue queue = new LikeQueue();
        queue.list = new LikeList();
        queue.enqueue(1);
        queue.enqueue(3);
        queue.enqueue(5);
        queue.enqueue(7);
        queue.enqueue(9);

        System.out.print("현재 Queue >>> ");
        list.print();
        System.out.println();

        queue.dequeue();
        System.out.print("Dequeue 후 현재 Queue >>> ");
        list.print();

        System.out.println();
        System.out.println("Queue isEmpty >>> " + queue.isEmpty());
        System.out.println("Queue peek >>> " + queue.peek());
    }

}
