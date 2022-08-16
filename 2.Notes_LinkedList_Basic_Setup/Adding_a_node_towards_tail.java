class List {
    Node h;
    Node t;
    // class to create a Node
    class Node{
        double data;
        Node n;
        
        Node(int d){
            this.data = d;
            this.n = null;
        }
    }
    
    public void addElementToNode(int d){
        Node new_node = new Node(d);
        new_node.n = t;
        t = new_node;
    }
    
    public void printList(){
        Node temp = t;
        while(temp!= null){
            System.out.print( "->" +temp.data );
			temp = temp.n;
        }
    }
    
    public static void main(String[] args) {
       System.out.println("Printing from the tail \n");
       List l = new List();
       l.addElementToNode(1);
       l.addElementToNode(2);
       l.printList();
    }
}