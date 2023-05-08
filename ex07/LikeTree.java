package main.java.ex07;


public class LikeTree {

    private Node root;

    private class Node {
        int data;
        Node parent;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            parent = null;
            left = null;
            right = null;
        }
    }

    // 삽입 메서드
    public void insert(int data) {
        //루트 노드가 비어있는 경우 -> 아무런 노드를 가지고 있지 않은 경우
        if (root == null) {
            root = new Node(data);
        } else {
            Node nowNode = root; //현재 노드
            Node parent; //삽입할 위치를 찾기 위한 parent Node
            while (true) {
                parent = nowNode;
                if (data < nowNode.data) {
                    nowNode = nowNode.left;
                    if (nowNode == null) {
                        Node newNode = new Node(data);
                        newNode.parent = parent;
                        parent.left = newNode;
                        break;

                    }
                } else if (data > nowNode.data) {
                    nowNode = nowNode.right;
                    if (nowNode == null) {
                        Node newNode = new Node(data);
                        newNode.parent = parent;
                        parent.right = newNode;
                        break;
                    }
                }else {
                        break;
                }

            }
        }
    }
    // 삭제 메서드
    public void delete(int data) {
        Node nowNode = root; //현재 노드
        Node parent = null;

        //삭제할 노드와 부모 노드 찾는 부분
        while(nowNode != null && nowNode.data != data){
            parent = nowNode;
            if(data < nowNode.data){
                nowNode = nowNode.left;
            }
            else{
                nowNode = nowNode.right;
            }
        }
        //이 부분이 지나면 nowNode 는 삭제하려는 노드가됨
        if(nowNode == null) return;
        //삭제할 노드가 자식이 없는 노드인 경우
        if(nowNode.left == null && nowNode.right ==null ){
            if(parent == null) {
                root = null; //삭제 대상 = 루트 노트
            }else if(parent.left == nowNode){
                    parent.left = null;
                }else{
                    parent.right = null;
                }
            }
        //삭제할 노드가 자식 노드 두 개를 가지는 경우
        else if (nowNode.right != null && nowNode.left != null) {
            Node kidParent = nowNode; //삭제하고자 하는 노드
            Node kid = nowNode.left; //삭제하고자 하는 노드의 왼쪽 자식 노드
            //후속 노드 중 가장 작은 값을 찾응 부분
            while(kid.left != null){
                kidParent = kid;
                kid = kid.left;
            }
            //kid는 후속 노드 중 가장 작은 값 갖게됨
            nowNode.data = kid.data;
            //부모랑 연결
            if(kidParent.left == kid){
                kidParent.left = kid.right;
            }
            else{
                kidParent.right = kid.right;
            }

        } else{
            //삭제할 노드의 차수가 1일 경우
            Node child = (nowNode.left != null)? nowNode.left : nowNode.right;
            if(parent == null) {
                root = child;
            }else if(parent.left == nowNode){
                parent.left = child;
            }else{
                parent.right= child;
            }
            if(child != null) {
                child.parent = parent;
            }
        }

    }
    // 전체 노드 출력 메서드
    public void print() {
        if (root == null) {
            System.out.println("Tree is empty.");
        } else {
            System.out.print("Tree elements >>> ");
            print_func(root);
            System.out.println(); // 줄바꿈
        }
        }
    private void print_func(Node node) {
        if (node != null) {
            print_func(node.left);
            System.out.print(node.data + " ");
            print_func(node.right);
        }


    }

    public static void main(String[] args) {
        LikeTree tree = new LikeTree();

        int array [] = {5,10,3,9,2,1,19};
        System.out.println("<<<<<<<< Test 코드 >>>>>>>>>>");

        for  (int i=0; i<array.length; i++){
            tree.insert(array[i]);
        }

        System.out.println("전체 노드 출력  >>> ");
        tree.print();

        tree.delete(3);
        tree.delete(9);
        System.out.println("3, 9 데이터 삭제 >>> ");
        tree.print();

    }
}

