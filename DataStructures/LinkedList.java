package DataStructures;

public class LinkedList {

    public static void main(String[] args) {
        LL obj = new LL();
        
        obj.insertStart(5);
        obj.insertStart(4);
        obj.insertEnd(7);
        obj.insertEnd(8);
        obj.insertEnd(9);
        obj.insertAny(3,1);
        
        obj.display();

        System.out.println();

       obj.deleteMiddle(2);
       obj.deleteEnd();
       obj.deleteStart();

       obj.display();
        
    }


}
class Node{
    int value;
    Node next;

    public Node(int value){
        this.value=value;
        this.next=null;
    }

    public Node(int value,Node next){
        this.value=value;
        this.next=next;
    }
}

class LL{

    Node head;
    Node tail;
    int size;

    public LL(){
        this.size=0;
    }

    public void insertStart(int value){
        Node node = new Node(value);
        node.next = head;
        head=node;
        if (tail==null){
            tail=head;
        }
        size++;
    }

    public void insertEnd(int value){
        if(tail==null){
            insertStart(value);
            return;
        }
        Node node = new Node(value);
        tail.next=node;
        tail=node;
        size++;
    }

    public void insertAny(int value,int index){
        if(index==0){
            insertStart(value);
            return;
        }
        if(index==size){
            insertEnd(value);
            return;
        }
        Node temp = head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next=node;
    }
    
    public int deleteStart(){
        if(head==null)
            tail=null;
        int val = head.value;
        head = head.next;
        size--;
        return val;        
    }

    public int deleteEnd(){
        Node temp = head;
        for(int i=0;i<size-1;i++){
            temp=temp.next;
        }
        int val = tail.value;
        tail=temp;
        tail.next=null;
        size--;
        return val;
    }

    public int deleteMiddle(int index){
        Node prev =head;
        for(int i=0;i<index;i++){
            prev=prev.next;
        }
        int val=prev.next.value;
        prev.next=prev.next.next;
        //prev.next.next=null;
        size--;
        return val;
    }

    public Node find(int val){
        Node node=head;
        while(node!=null){
            if(node.value==val)
                return node;
            node=node.next;
        }
        return null;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+"---->");
            temp=temp.next;
        }
    }

}
