public class Stack {
    private Node top ;



    public Stack() {
    }
    public void push(Object data){
        if(top == null){
            top = new Node(data,null);
        }else {
            Node temp = top;
            top = new Node(data,temp);
        }
    }
    public Object pop(){
        Object data = top.getData();
        top = top.getNext();
        return  data;
    }
    public boolean isEmpty(){
        return top == null;
    }
    public int size(){
       return Node.getCount();
    }
    public Object element(){
        return top.getData();
    }

    @Override
    public String toString() {
        Node current = top;
        while (current != null){
            System.out.println(current.getData());
            current = current.getNext();
        }
        return "";
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.toString();
        System.out.println(stack.size());
        stack.pop();
        stack.toString();
    }
}
