package ex07;

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
        Node rNode = this.root;
        Node pNode = null;

        while(rNode != null) {
            pNode = rNode;
            if (data < rNode.data) {
                rNode = rNode.left;
            }
            else {
                rNode = rNode.right;
            }
        }

        Node newNode = new Node(data);
        newNode.parent = pNode;
        if (pNode == null) {
            root = newNode;
            return;
        }
        if (data < pNode.data) {
            pNode.left = newNode;
        }
        else  {
            pNode.right = newNode;
        }
    }

    // 삭제 메서드
    public void delete(int data) {
        Node rNode = this.root;
        Node pNode = null;

        while(rNode != null) {
            if (data < rNode.data) {
                pNode = rNode;
                rNode = rNode.left;
            }
            else if (data > rNode.data){
                pNode = rNode;
                rNode = rNode.right;
            }
            else if (data == rNode.data) {
                if (rNode.left == null) {	// (1) or (2)
                    if (pNode.left == rNode) {
                        pNode.left = rNode.right;
                        pNode.left.parent = pNode;
                    }
                    else {
                        pNode.right = rNode.right;
                        pNode.right.parent = pNode;
                    }
                }
                else if (rNode.right == null) {	// (1) or (2)
                    if (pNode.left == rNode) {
                        pNode.left = rNode.left;
                        pNode.left.parent = pNode;
                    }
                    else {
                        pNode.right = rNode.left;
                        pNode.right.parent = pNode;
                    }
                }
                else {
                    Node tmp = rNode.right;
                    while (tmp.left != null) {
                        tmp = tmp.left;
                    }
                    tmp.parent.left = null;
                    if (pNode.left == rNode) {
                        pNode.left = tmp;
                        pNode.left.parent = pNode;
                    }
                    else {
                        pNode.right = tmp;
                        pNode.right.parent = pNode;
                    }
                }
                return;
            }
        }
        System.out.println("data가 존재하지 않습니다.");
    }
    private void recPrint(Node node) {
        if (node == null)
            return;
        System.out.println(node.data);
        recPrint(node.left);
        recPrint(node.right);
    }

    // 전체 노드 출력 메서드
    public void print() {
        recPrint(root);
    }

    public static void main(String[] args) {
        LikeTree lTree = new LikeTree();
        lTree.insert(1);
        lTree.insert(2);
        lTree.insert(3);
        lTree.insert(4);
        lTree.insert(5);
        lTree.insert(6);
        lTree.insert(7);
        lTree.print();
    }
}
