public class Node {
    private Object data;
    private Node next;

    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(Node next) {
        this(null, next);
    }

    /**
     * This function returns the data stored in the node.
     *
     * @return The data object.
     */
    public Object getData() {
        return data;
    }

    /**
     * This function sets the data of the node to the data passed in.
     *
     * @param data The data to be sent to the server.
     */
    public void setData(Object data) {
        this.data = data;
    }

    /**
     * Returns the next node in the list.
     *
     * @return The next node in the linked list.
     */
    public Node getNext() {
        return next;
    }

    /**
     * This function sets the next node to the node passed in as a parameter.
     *
     * @param next The next node in the list.
     */
    public void setNext(Node next) {
        this.next = next;
    }

}
