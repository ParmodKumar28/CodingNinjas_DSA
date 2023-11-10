/**
 * PrintithNode
 */
public class PrintithNode {

}

class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
    }
}

class Solution {

    public static void printIthNode(Node<Integer> head, int i) {
        if (head == null) {
            return;
        }

        Node<Integer> prev = head;
        int count = 0;
        while (count < i && prev != null) {
            count++;
            prev = prev.next;
        }

        if (prev != null) {
            System.out.println(prev.data);
        }

    }
}