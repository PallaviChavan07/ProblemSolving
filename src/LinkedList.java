import java.util.HashSet;

public class LinkedList {


    /*
     * To execute Java, please define "static void main" on a class
     * named Solution.
     *
     * If you need more classes, simply define them inline.
     */



        static Node head;

        class Node{
            int data;
            Node next;

            public Node(int data){
                this.data = data;
            }
        }
        public void prepend(int data){
            Node temp = new Node(data);
            if(head == null){
                head = temp;
                return;
            }
            temp.next = head;
            head = temp;

        }

        public void append(int data){
            Node temp = new Node(data);
            if(head == null){
                head = temp;
                System.out.println("list was empty and head has been created");
            }
            else{
                Node curr = head;
                while(curr.next != null){
                    curr = curr.next;
                }
                curr.next = temp;
                System.out.println("List was not empty and new node has beed appended");
            }
        }

        public void delete(int data){
            if(head == null){
                return;
            }
            if(head.data == data){
                head = head.next;
                return;
            }
            Node curr = head;

            while(curr.next != null){
                if(curr.next.data == data){
                    if(curr.next.next == null){
                        curr.next = null;
                        return;
                    }else{
                        curr.next = curr.next.next;
                    }

                }

                curr = curr.next;

            }

        }

        public void printList(){
            if(head == null){
                System.out.println("List is Empty");
            }else{
                Node curr = head;
                do{
                    System.out.print( curr.data+" -> ");
                    curr = curr.next;
                }while(curr != null);


            }
        }


    public void reverseLinkedList(){
        Node prev = null;
        Node curr = head;
        Node next = null;
        if(head == null || head.next == null){
            return;
        }
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void removeDuplicates(){
        Node current = head;
        HashSet uniqueSet = new HashSet();
        if(head == null){
            return;
        }
        uniqueSet.add(head.data);
        while(current != null && current.next != null){
            if(uniqueSet.contains(current.next.data)){
                current.next = current.next.next;
            }else{
                uniqueSet.add(current.next.data);
            }
            current = current.next;
        }
    }
    public boolean checkLoop(){
            boolean isLoopePresent = false;
            if(head == null || head.next == null){
                return isLoopePresent;
            }
            Node current = head.next;
            while(current != null){
                Node prev = head;
                while (prev != current){
                    if(current.next == prev){
                        isLoopePresent = true;
                        return isLoopePresent;
                    }
                    prev = prev.next;
                }
                current = current.next;
            }
            return isLoopePresent;
    }

//        public static void reverseLinkedList1(java.util.LinkedList<Integer> inbuiltList){
//        ListIterator<Integer> it1 = inbuiltList.listIterator(0);
//        ListIterator<Integer> it2 = inbuiltList.listIterator(inbuiltList.size()-1);
//
//        while (it1.nextIndex())
//        {
//            int temp = it1.next();
//            it1.set(it2.next());
//            it2.set(temp);
//
//            it1.nextIndex();
//            it2.previousIndex();
//
//            System.out.println(it1.next()+ "||" + it2.next());
//            System.out.println("");
//        }
//
//        System.out.println(inbuiltList);
//        }

        public static void main(String[] args) {
            java.util.LinkedList<Integer> inbuiltList = new java.util.LinkedList<Integer>();
            inbuiltList.add(5);
            inbuiltList.add(6);
            inbuiltList.add(7);
            LinkedList ll = new LinkedList();
            ll.append(1000);
            ll.append(5);
            ll.append(4);
            ll.append(2321);
            ll.append(55);
            ll.append(1000);
            ll.printList();
            ll.removeDuplicates();
            System.out.println("After removing duplicates #");
            ll.printList();
            //ll.printList();
            //ll.delete(4);*/
            //reverseLinkedList(inbuiltList);
            //ll.reverseLinkedList();
            //System.out.println(ll.checkLoop());
            //ll.printList();

        }




}
