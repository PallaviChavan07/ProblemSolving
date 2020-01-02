public class Graph {
    int vertice;
    SinglyLinkedList[] adacencyList;

    public Graph(int vertice) {
        this.vertice = vertice;
        this.adacencyList = new SinglyLinkedList[vertice];
        for(int i=0; i< vertice; i++){
            adacencyList[i] = new SinglyLinkedList();
        }
    }

    public void addEdge(int source, int destination){
        this.adacencyList[source].append(destination);
    }
    public void printGraph(){
        for(int i = 0; i< vertice; i++){
            SinglyLinkedList.Node node = null;
            if(adacencyList[i] != null){
                System.out.print(i+"->");
                node = adacencyList[i].head;
                while (node != null){
                    System.out.print(node.data+"->");
                    node = node.next;
                }
                System.out.println("null");
            }

        }
    }

    /*public static void main(String[] args) {
        Graph g = new Graph(4);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,3);
        g.addEdge(2,3);
        g.addEdge(3,0);
        g.printGraph();
    }*/
}
