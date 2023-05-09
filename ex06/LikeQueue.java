package ex06;
//큐: 선입선출

public class LikeQueue {

    // ex04에서 만든 LikeList 사용
    private LikeList list;
    private static int top; //시작당시 최고위층은 -1층! =인덱스 번호
    private static int bottom; // 최하위층은 0에서 한 층씩 위로 업데이트?
    public LikeQueue(){
        list=new LikeList();
        top = -1;
        bottom = 0;
    }


    public static void main(String[] args) {
        LikeQueue q = new LikeQueue();

        q.enqueue(0);//top=0
        q.enqueue(1);//top=1
        q.enqueue(2); //top=2
        System.out.println("큐의 첫번째값(최하위층의 값)은 "+q.peek());

        q.dequeue();
        q.dequeue();
        q.dequeue();
        System.out.println(q.isEmpty());
    }
        // 추가
    public int enqueue(int value) {
        list.insert(top,value);
        ++top;
        System.out.println(top+"에"+value + " 값을 추가하겠습니다.");
//        list.print(); //확인용 전체리스트 값
        return top;
    }
    // 삭제
    public void dequeue() {
        if(isEmpty()) {
            System.out.println("큐가 비어있습니다.");
        }
        int value = list.get(bottom);
        System.out.println(bottom+"번 째의 값" +value + "을 제거하였습니다.");
        list.delete(bottom);
        list.print(); //확인용 전체리스트 값
    }
    // 큐의 첫번쨰 값 조회
    public int peek() {
        if(isEmpty()) {
            System.out.println("큐가 비어있습니다.");
            return -1;
        }
        return list.get(bottom);
    }
    // 큐가 비었는지 확인
    public boolean isEmpty() {
        return list.get(bottom)==-1; //최하위값이 null일때, get메소드에서 -1 리턴, 이게 참이면 큐가 빈 것.
    }
}
