

public class SinglyLinkedList {
    class Node{
        Node next;

        int data;

        public Node(int data){
            this.data = data;
        }
    }
    Node head;
    Node head2;

    public void prepend(int data){
        if(head == null){
            head = new Node(data);
            return;
        }
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }

    public void append(int data){
        if(head == null){
            head = new Node(data);
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = new Node(data);
    }

    public void append2(int data){
        if(head2 == null){
            head2 = new Node(data);
            return;
        }
        Node currentNode = head2;
        while (currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = new Node(data);
    }

    public void printSinglyLinkedList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data+" ");
            currentNode = currentNode.next;
        }


    }

    public void deleteWithData(int data){
        if(head == null){
            return;
        }
        if(head.data == data){
            head = head.next;
            return;
        }
        Node currentNode = head;
        while(currentNode.next != null){
            if(currentNode.next.data == data){
                currentNode.next = currentNode.next.next;
                return;
            }
            currentNode = currentNode.next;
        }

    }

    public void reverseList(){

        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currentNode = head;
        Node prev = null;
        Node next = null;
        while(currentNode != null){
            next = currentNode.next;
            currentNode.next = prev;
            prev = currentNode;
            currentNode = next;

        }
        head = prev;



    }

    public boolean compareLists() {
        if(head == null  || head2 == null){
            return false;
        }
        Node currentNode1 = head;
        Node currentNode2 = head2;
        int list1Count = 0;
        int list2Count = 0;
        while(currentNode1 != null){
            list1Count++;
            currentNode1 = currentNode1.next;
        }
        System.out.println("list1Count1 = "+list1Count);
        while(currentNode2 != null){
            list2Count++;
            currentNode2 = currentNode2.next;
        }
        System.out.println("list2Count2 = "+list2Count);
        if(list1Count != list2Count){
            return false;
        }

        while(currentNode1 != null && currentNode2 != null){
            if(currentNode1.data == currentNode2.data){
                currentNode1 = currentNode1.next;
                currentNode2 = currentNode2.next;
            }else{
                return false;
            }
        }

        return true;

    }
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.append(2);
        singlyLinkedList.append(3);
        singlyLinkedList.append(4);

        //singlyLinkedList.append2(2);
        singlyLinkedList.append2(3);
        singlyLinkedList.append2(4);

        System.out.println(singlyLinkedList.compareLists());
        /*singlyLinkedList.printSinglyLinkedList();
        singlyLinkedList.deleteWithData(2);
        System.out.println("After deleting Node");

        singlyLinkedList.printSinglyLinkedList();
        System.out.println("After deleting Node");
        singlyLinkedList.reverseList();
        singlyLinkedList.printSinglyLinkedList();
*/
    }
}
