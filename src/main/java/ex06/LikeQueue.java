package ex06;

public class LikeQueue {

    // ex04에서 만든 LikeList 사용
    private LikeList list;

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
        if (list.getSize() == 0)
            return true;
        return false;
    }
}