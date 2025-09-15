package DSA_Concepts.CustomDoubleLinkedList;

public class CustomDoubleLinkedList {
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(5);
        list.addLast(13);
        list.add(27,2);
        list.display();
        // list.displayRev();
    }
}

class DoubleLinkedList{
    private Node head;

    public void addFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        } 
        head = node;
    }

    public void addLast(int value){
        Node node = new Node(value);
        Node last = head; 
        node.next = null;
        if(head == null){
            node.prev = null;
            head = node;
            return;
        }
        
        while(last.next != null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;
    }

    public void add(int value, int index){
        Node node = new Node(value);
        Node prev = get(index);
        if(prev == null){
            System.out.print("Does not exist");
        }
        node.next = prev.next;
        prev.next = node;
        node.prev = prev;
        if(node.next != null){
            node.next.prev = node;
        }
    }

    public Node get(int index){
        Node node = head;
        for(int i = 1; i < index; i++){
            node = node.next;
        }
        return node;
    }

    public void display(){
        Node node = head;
        while(node != null){
            System.out.print(node.value + " ");
            node = node.next;
        }
    }

    public void displayRev(){
        Node node = head;
        Node last = null;
        while(node != null){
            last = node;
            node = node.next;
        }
        while(last != null){
            System.out.print(last.value + " ");
            last = last.prev;
        }
    }

    private class Node{
        private int value;
        private Node next;
        private Node prev;

        private Node(int value){
            this.value = value;
        }

        private Node(int value, Node next){
            this.value = value;
            this.next = next;
        }

        private Node(int value, Node next, Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
