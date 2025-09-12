package DSA_Concepts.CustomLinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(23);
        list.addFirst(44);
        list.addLast(12);
        list.display();
        System.out.println();
        list.add(75,1);
        list.display();
        System.out.println();
        list.get(2);
        System.out.println(list.deleteFirst());
        list.display();
        list.addFirst(61);
        System.out.println();
        list.display();
    }
}
