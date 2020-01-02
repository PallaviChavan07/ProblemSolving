class Stack {

    Node top;

    public class Node{
        Node next;
        int data;

        public Node (int data){
            this.data = data;
        }
    }

    public boolean isEmpty(){
        if(top == null)
            return true;
        else
            return false;
    }

    public void push(int data){
        Node temp = new Node(data);
        temp.next = top;
        top = temp;
    }

    public int pop(){
        int topData = -1;
        if(top != null){
            topData = top.data;
            top = top.next;

        }
        return topData;
    }

    public void printStack(){
        Node curr = top;

        while(curr != null){
            System.out.println(curr.data);
            curr = curr.next;
        }

    }

    public static void main(String[] args) {

        Stack s = new Stack();
        System.out.println(s.isEmpty() ? "Stack is Empty" : "Stack is not Empty");
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.printStack();
        s.pop();
        s.printStack();
    }
}
