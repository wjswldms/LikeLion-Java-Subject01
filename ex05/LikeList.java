package ex05;
//수정 ㅇ
public class LikeList {
    private static int top=-1;
    public static void main(String[] args) {
        LikeList myList =new LikeList();
        myList.insert(0,0);
        myList.insert(1,1);
        myList.insert(2,2);
        myList.insert(3,99);
        myList.print();
        myList.delete(1);
        System.out.println(myList.get(3));
    }
    private Node head; //head는 연결리스트 맨 앞, 첫번째 노드를 가리킴

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
        top++; //push가 실행되면, 한층 위로 올라감.

        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            int count = 0;
            Node current = head;
            while (count < index - 1 && current.next != null) {
                current = current.next;
                count++;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    // 삭제 메서드, index 위치에 노드 삭제
        //리스트 요소를 삭제하려면, 현재 요소를 다음 인덱스의 요소로 바꿔줌. 삭제할 노드 건너뛰어서 연결 연결 해줘야함
    public void delete(int index) {
        top--; //pop가 실행되면, 한층 아래로 내려감.

        if (head == null) { //리스트가 비어있는 경우
                return;
            }
            else if (index == 0) { //첫번째 노드인 경우
                head = head.next;
            }

            else {
                Node current = head; //현재 노드를 head로
                for (int i = 0; i < index - 1; i++) { //해당 인덱스 전 노드까지 이동
                    current = current.next; //현재 노드 (해당 인덱스 한칸 전 노드)를 다음 노드 (해당인덱스)로 변경
                    if (current == null) { //도착한 노드가 null일 경우
                        return;
                    }
                }
                current.next = current.next.next; //다음 노드(해당 인덱스 노드)는 그 다음 노드(해당인덱스 다음노드)로 바꿔줌 (입력된 해당 인덱스 건너뛰고 연결해줌)
            }
    }

    // 전체 노드 출력 메서드
    public int print() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println(" ");
        return 0;
    }

    //입력된 인덱스의 값을 꺼내줌
    public int get(int index) {
        if (index > top || index < 0) {
            throw new IndexOutOfBoundsException();
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
}}