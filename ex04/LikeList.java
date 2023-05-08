package main.java.ex04;
public class LikeList {

    private Node head;
    private int size =0;

    public int getSize(){
        return size;
    }
    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    // 삽입 메서드, index 위치에 노드 추가
    public void insert(int index, int data) {
        if (index ==0){
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
            //자기 자신을 가리키는 head노드 생성
        }
        else{
            Node nowNode= head;
            int nowIndex =0;
            while (nowIndex < index-1 && nowNode.next != null){
                nowNode = nowNode.next;
                nowIndex++;
            }
            Node newNode = new Node(data);
            newNode.next = nowNode.next;
            nowNode.next = newNode;
        }
        size ++;
    }

    // 삭제 메서드, index 위치에 노드 삭제
    public void delete(int index) {
        if(index ==0){
            head = head.next;
        }
        else {
            //삭제할 노드 앞 노드
            Node nowNode= head;
            for (int i = 0; i < index - 1; i++){
                nowNode = nowNode.next;
            }
            nowNode.next = nowNode.next.next;
        }
        size--;
    }

    public int get(int index){
        Node h = this.head;
        if (index >= this.size) {
            System.out.println("index error");
            return -1;
        }
        for (int i=0; i<index; ++i) {
            h = h.next;
        }
        return h.data;


    }

    // 전체 노드 출력 메서드
    public void print() {
        Node nowNode = head;

        while(nowNode != null){
            System.out.print(nowNode.data+" ");
            nowNode= nowNode.next;
        }
        System.out.print("\n");
    }
    public static void main(String[] args) {
    int array [] = {5,10,20,30,40,50};
    System.out.println("<<<<<<<< Test 코드 >>>>>>>>>>");
    LikeList newlist = new LikeList();
    for  (int i=0; i<array.length; i++){
        newlist.insert(i,array[i]);
    }
    System.out.print("5,10,20,30,40,50 추가 >>> ");
    newlist.print();

    newlist.delete(1);
    System.out.print("1번째 인덱스 삭제 >>> ");
    newlist.print();

    }
}



