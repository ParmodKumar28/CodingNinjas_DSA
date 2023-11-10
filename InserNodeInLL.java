public class InserNodeInLL {

}

class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
    }
}

class Solution {

    public static Node<Integer> insert(Node<Integer> head, int pos, int data) {
        // Your code goes here
        if (head == null) {
            return head;
        }

        Node<Integer> newNode = new Node<>(data);
        if (pos == 0) {
            newNode.next = head;
            return newNode;
        } else {
            Node<Integer> prev = head;

            while (pos > 1 && prev != null) {
                prev = prev.next;
                pos--;
            }

            if (prev != null) {
                newNode.next = prev.next;
                prev.next = newNode;

            }

        }
        return head;

    }
}
