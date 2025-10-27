package LinkedList;

public class PracticeLL {
    public static void main(String[] args) {
        LinkedList1 ll=new LinkedList1();
        ll.add(12);
        ll.add(21);
        ll.add(32);
        ll.add(43);
        ll.addHead(1);
        ll.addHead(32);

        ll.print();
        //Fine
//        System.out.println(ll.size);

    }
}
class Node1{
    int data;
    Node1 next;

    public Node1(int data) {
        this.data = data;
        this.next=null;
    }
}
class LinkedList1{
    Node1 head;
    int size=0;
    Node1 tail;

    public void add(int data){
        Node1 node =new Node1(data);

        if(head==null){
            head=node;
            size++;
            return;
        }

        Node1 currentNode=head;
        while (currentNode.next!=null){
            currentNode=currentNode.next;
        }

        currentNode.next=node;
        //tail=node;
        size++;
    }
    public void addHead(int data){
        Node1 node2=new Node1(data);


        node2.next=head;
        head=node2;
        size++;
    }
//    public void addTail(int data){
//
//        //Node1 node2 =new Node1(data);
//        System.out.println(tail.data);
//
//    }
    public void print(){
        Node1 current=head;
        while (current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }
}
