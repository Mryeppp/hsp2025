package org.mryep.a;

public class L {
    public static void main(String[] args) {

        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");

        Node head = a;
        Node tail  = c;
        a.next = b;b.next = c;
        b.prev = a;c.prev = b;

        while(head != null) {
            System.out.print( head.data + " " );
            head = head.next;
        }

    }
}

class Node {
    public Object data; //真正存放数据
    public Node prev; //指向前一个结点
    public Node next; //指向后一个结点
    public Node(Object data) {
        this.data = data;
    }
    public String toString() {
        return "Node name=" + data;
    }
}
