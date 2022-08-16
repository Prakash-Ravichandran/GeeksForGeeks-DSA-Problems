class List_Without_Link{
    Node head;
    Node tail;
    
   static class Node{
        String s;
        Node next;
        
        public Node(String x){
            this.s = x;
            this.next = null;
        }
    }
    
     public void printList()
    {
        Node n = head;
        while (n != null) {
            System.out.print(n.s + " \n");
            n = n.next;
        }
    }
    
   public static void main(String[] args){
       List_Without_Link lwl = new List_Without_Link();
       
       // creating nodes
       lwl.head = new Node("First Node value is 1");
       Node second = new Node("Second Node value is 2");
       Node third = new Node("Third Node value is 3");
       
       // adding linkage in main() function
       lwl.head.next = second;
       second.next = third;
       
       // print the list
       lwl.printList();  
   }
    
}