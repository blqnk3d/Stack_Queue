public class LinkedStack {
    private int size;
    private Node top;


    /**
     * It pushes an element to the top of the stack.
     *
     * @param data The data that you want to push into the stack.
     */
    public void push(Object data) {
        if (isEmpty()) {
            top = new Node(data, null);
        } else {
            Node temp = top;
            top = new Node(data, temp);
        }
        size++;
    }

    /**
     * If the stack is empty, return null. Otherwise, get the data from the top node, set the top node to the next node,
     * and return the data
     *
     * @return The data of the top node.
     */
    public Object pop() {
        if (top == null) {
            return null;
        }
        Object data = top.getData();

        top = top.getNext();
        size--;
        return data;
    }

    /**
     * If the top of the stack is null, then the stack is empty.
     *
     * @return The top of the stack
     */
    public boolean isEmpty() {
        return top == null;
    }

    /**
     * Returns the number of elements in the list.
     *
     * @return The size of the list.
     */
    public int size() {
        return size;
    }

    /**
     * If the stack is empty, return null. Otherwise, return the data of the top node
     *
     * @return The top element of the stack.
     */
    public Object element() {
        if (top == null) {
            return null;
        }
        return top.getData();

    }

    @Override
    // A method that returns a string representation of the object.
    public String toString() {
        String ret = "";
        Node current = top;
        while (current != null) {
            ret += current.getData() + "\n";
            //System.out.println(current.getData());
            current = current.getNext();
        }
        return ret;
    }

    public static void main(String[] args) {
        LinkedStack stack = new LinkedStack();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println(stack);
        System.out.println();
        stack.pop();
        System.out.println(stack);
    }
}
