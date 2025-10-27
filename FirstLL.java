package LinkedList;

class Node{
    int data;
    Node next;

    Node(int data){
     this.data=data;
     this.next=null;
    }
}
class LinkedList{
    Node head;

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {   // if list is empty
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {   // go to last node
            current = current.next;
        }
        current.next = newNode;   // link new node at end
    }
    public void print(){
        Node current=head;
        while (current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }
}
public class FirstLL {
    public static void main(String[] args) {

        LinkedList ll=new LinkedList();

        ll.add(12);ll.add(21);ll.add(32);
        ll.print();
    }
}
