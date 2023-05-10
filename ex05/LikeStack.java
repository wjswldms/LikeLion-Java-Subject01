//스택만들기 Likelist 활용! 후입선출
//수정 ㅇ

 package ex05;

public class LikeStack {
    // ex04에서 만든 LikeList 사용
    private LikeList list;
    private static int top; //시작당시 최고위층은 -1층! =인덱스 번호

    public LikeStack(){ //기본생성자
        list=new LikeList();
        top=-1;
    }
    public static void main(String[] args) {
        LikeStack stack = new LikeStack();
        stack.push(0);//top=0
        stack.push(1);//top=1
        stack.push(2); //top=2
        stack.peek();//top=1

        stack.pop();//top=2->1
        stack.pop();
        stack.pop();
        stack.isEmpty();//false
        System.out.println(stack.isEmpty());

    }
    // 추가
    public int push(int value) {
        ++top;
        list.insert(top,value);
        list.print();
        return top;
    }
    // 삭제
    public int pop() {
        int removedValue=list.get(top);
        list.delete(list.get(top));//최고위층 값을 삭제해야함
        list.print();
        return --top;
    }
    // 스택의 마지막 값 조회
    public int peek() {
        System.out.println("스택의 마지막(최고위층의) 값은 " + list.get(top));
        return list.get(top);
    }
    // 스택이 비어있다면 true
    public boolean isEmpty() {
        return (top==-1);
    }
}
