// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class LinkedList {
    
    Node head;
    // create a node 
    class Node {
        int data;
        Node next;
        public Node(int d){
            this.data = d;
            this.next = null;
        }
    }
    
    public void pushNode(int d){
       Node new_node = new Node(d);
       new_node.next = head;
       head = new_node;
    }
    
   	public void printNode()
	{
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.print("Null"+"\n");
	}
    
    public static void main(String[] args) {
     //   System.out.println("Hello, World!");
        LinkedList list = new LinkedList();
        list.pushNode(5);
        list.pushNode(3);
        list.printNode();
    }
}