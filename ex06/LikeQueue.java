package ex06;
//큐: 선입선출
//수정 ㅇ

public class LikeQueue {

    // ex04에서 만든 LikeList 사용
    private LikeList list;
    private static int top; //시작당시 최고위층은 -1층! =인덱스 번호
    public LikeQueue(){
        list=new LikeList();
        top = -1;
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
        ++top;
        list.insert(top,value);
        list.print(); //확인용 전체리스트 값
        return top;
    }
    // 삭제
    public void dequeue() {
        if(isEmpty()) {
            System.out.println("큐가 비어있습니다.");
        }
        list.delete(0);
        list.print(); //확인용 전체리스트 값
    }
    // 큐의 첫번쨰 값 조회
    public int peek() {
        if(isEmpty()) {
            System.out.println("큐가 비어있습니다.");
            return -1;
        }
        
        return list.get(0);
    }
    // 큐가 비었는지 확인
    public boolean isEmpty() {
        return list.get(0)==-1; //최하위값이 null일때, get메소드에서 -1 리턴, 이게 참이면 큐가 빈 것.
    }
}
