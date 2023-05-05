package ex05;

public class LikeList {

    private Node head;

    private int size = 0;

    public int getSize() {
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
        Node h = this.head;
        Node prevH = null;

        if (index > this.size) {
            System.out.println("index error");
            return;
        }
        for (int i=0; i<index; ++i) {
            prevH = h;
            h = h.next;
        }
        Node newNode = new Node(data);
        if (prevH == null) {
            newNode.next = this.head;
            this.head = newNode;
        }
        else {
            newNode.next = prevH.next;
            prevH.next = newNode;
        }
        this.size++;
    }

    // 삭제 메서드, index 위치에 노드 삭제
    public void delete(int index) {
        Node h = this.head;
        Node prevH = null;

        if (index >= this.size) {
            System.out.println("index error");
            return;
        }
        for (int i=0; i<index; ++i) {
            prevH = h;
            h = h.next;
        }
        if (prevH == null) {
            this.head = null;
        }
        else {
            prevH.next = h.next;
        }
    }

    public int get(int index) {
        LikeList.Node h = this.head;

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
        Node h = this.head;
        int idx = 0;
        while (h != null) {
            System.out.println("idx: " + idx + " data: " + h.data);
            h = h.next;
            idx++;
        }
    }
}