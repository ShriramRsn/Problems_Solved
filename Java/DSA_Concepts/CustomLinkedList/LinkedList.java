public class Main{
    public static void main(String[] args){
        SinglyList list = new SinglyList();
        
        list.addFirst(23);
        list.addFirst(48);
        list.addLast(100);
        list.add(9,2);
        list.addFirst(67);
        list.deleteFirst();
        list.deleteLast();
        list.display();
    }
}

public class SinglyList{
    
    private Node head;
    private Node tail;
    private int size;
    
    public SinglyList(){
        this.size = 0;
    }
    
    public void addFirst(int value){
        Node node = new Node(value);
        if(head == null){
            tail = node;
        }
        node.next = head;
        head = node;
        size++;
    }
    
    public void add(int value, int index){
        Node node = head;
        for(int i = 1; i < index; i++){
            node = node.next;
        }
        Node temp = new Node(value, node.next);
        node.next = temp;
        size++;
    }
    
    public void addLast(int value){
        Node node = new Node(value);
        if(tail == null){
            addFirst(value);
            return;
        }
        tail.next = node;
        tail = node;
        size++;
    }
    
    public int deleteFirst(){
        if(head == null){
            tail = null;
        }
        int value = head.value;
        head = head.next;
        size--;
        return value;
    }
    
    public int deleteLast(){
        if(size <= 1){
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int value = tail.value;
        tail = secondLast;
        tail.next = null;
        return value;
    }
    
    public Node get(int index){
        Node temp = head;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp;
    }
    
    public void display(){
        Node node = head;
        while(node != null){
            System.out.print(node.value + " ");
            node = node.next;
        }
    }
    
    private class Node{
        private int value;
        private Node next;
        
        private Node(int value){
            this.value = value;
        }
        
        private Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}