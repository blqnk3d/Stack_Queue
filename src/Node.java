public class Node {
    private static int count = 0;
    private Object data;
    private Node next;

    public Node(Object data, Node next) {
        count++;
        this.data = data;
        this.next = next;
    }

    public Node(Node next) {
    this(null, next);
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public static int getCount() {
        return count;
    }
}
