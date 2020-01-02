public class Queue {


    /*
     * To execute Java, please define "static void main" on a class
     * named Solution.
     *
     * If you need more classes, simply define them inline.
     */
        Node head;
        Node tail;

        class Node{
            int data;
            Node next;

            public Node(int data){
                this.data = data;
            }
        }

        public boolean isEmpty(){
            if(head == null && tail == null){
                return true;
            }else
                return false;
        }

        public void add(int data){
            Node temp = new Node(data);
            if(head == null){
                head = temp;
                tail = temp;
            }else{
                tail.next = temp;
                tail = temp;
            }
        }

        public int peek(){
            if(head == null)
                return -1;
            return head.data;
        }

        public int poll(){
            if(head != null){
                int headData = head.data;
                head = head.next;
                return headData;
            }
            return -1;
        }

        public void printQueue(){
            Node curr = head;
            while(curr != null){
                System.out.print(curr.data+" ");
                curr = curr.next;
            }
        }
        public static void main(String [] args){

            Queue queue = new Queue();
            queue.add(1);
            queue.add(2);
            queue.add(3);
            queue.add(4);
            queue.printQueue();
            //System.out.println(queue.peek());
            //System.out.println(queue.poll());
            queue.poll();
            queue.printQueue();
            //System.out.println(queue.poll());
            queue.poll();
            queue.printQueue();
            //System.out.println(queue.poll());
            queue.poll();
            queue.printQueue();
            //System.out.println(queue.poll());
            queue.poll();
            queue.printQueue();
            queue.poll();
            queue.printQueue();
        }


}
