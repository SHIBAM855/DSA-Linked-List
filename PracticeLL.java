package LinkedList;

public class PracticeLL {
    public static void main(String[] args) {
        LinkedList1 ll=new LinkedList1();
        ll.add(12);
        ll.add(21);
        ll.add(32);
        ll.add(43);
        ll.add(54);
//        ll.addHead(1);
//        ll.addHead(32);
        ll.insertAt(4,34);

        ll.print();

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
            tail=node;
            size++;
            return;
        }


        while (tail.next!=null){
            tail=tail.next;
        }

        tail.next=node;
        //tail=node;
        size++;
    }
    public void addHead(int data){
        Node1 node2=new Node1(data);


        node2.next=head;
        head=node2;
        size++;
    }
    public void insertAt(int index,int data){

        Node1 node2 =new Node1(data);

        Node1 traverse=head;

        //if this two line wrote in side loop then it recersively run node2.next=traverse.next traverse.next=node2;
        for(int i=1;i<index-1;i++){
            traverse=traverse.next;

        }

        node2.next=traverse.next;
        traverse.next=node2;


    }
    public void print(){
        Node1 current=head;
        while (current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }
}
