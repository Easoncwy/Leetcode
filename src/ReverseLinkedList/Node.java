package ReverseLinkedList;

/**
 * Created by eason on 2017/2/18.
 */
public class Node {
    int value;
    Node nextNode;
    public Node(int value, Node nextNode){
        super();
        this.value = value;
        this.nextNode = nextNode;
    }

    public static Node init(int num){
        Node node = new Node(0, null);
        Node cur = null;
        Node temp = null;
        for (int i = 1; i < num; i++) {
            temp = new Node(i, null);
            if (i == 1){
                node.nextNode = temp;
            }else {
                cur.nextNode = temp;
            }
            cur = temp;
        }
        return node;
    }

    public static void out(Node head) {
        Node tempNode = head;
        while (tempNode != null){
            System.out.println(tempNode.value);
            tempNode = tempNode.nextNode;
        }
    }
    private static Node reverseLinkedList(Node head){
        if (head == null)
            return head;
        Node pre = null;
        while (head != null){
            Node temp = head.nextNode;
            head.nextNode = pre;
            pre = head;
            head = temp;

        }
        return pre;




    }





    public static void main(String[] args) {
        Node head = init(10);
        out(head);
    }
}

