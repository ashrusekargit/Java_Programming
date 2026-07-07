//creating a node
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
    //inserting values at beginning
    public void insertAtBeginning(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    //inserting values at end
    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        Node temp = head;
        if(head == null){
            head=newNode;
        }
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next=newNode;
    }

    //search for value
    public boolean search(int data){
        Node temp = head;
        while(temp != null){
            if(temp.data == data){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    //delete at start
    public void deleteAtStart(){
        if(head != null){
            head = head.next;
        }
    }

    //delete at end
    public void deleteAtEnd(){
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next; 
        }
        temp.next = null;
    }
}


//linking and adding elements in the node
public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtBeginning(30);
        list.insertAtBeginning(20);
        list.insertAtBeginning(10);
        list.insertAtEnd(40);
        list.deleteAtStart();
        list.deleteAtEnd();
        System.out.println(list.search(30));
        System.out.println(list.search(50));
        Node temp = list.head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
        

    }
}