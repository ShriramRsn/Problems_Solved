import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Arraylist {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(2);
        System.out.println("Original List: " + list);
        System.out.println("Index of 3: " + list.indexOf(3));
        System.out.println("Replace list element 5 with 7: " + list.set(list.lastIndexOf(2), 7));

        Integer[] array = list.toArray(new Integer[0]);
        System.out.println("Conversion of ArrayList to Integer Array: ");
        for(int i : array){
            System.out.print(i + " ");
        }
        System.out.println();

        //Copy of an list
        List<Integer> listCopy = new ArrayList<>(list);
        listCopy.add(11);
        System.out.println("Copy of Original List: " + listCopy);

        //copy list at end of listCopy
        listCopy.addAll(list);
        System.out.println("Copied Original list at end: " + listCopy);

        //subarraylist
        System.out.println("Sublist: " + listCopy.subList(5, listCopy.size()));
        //Changing the element in subList  changes the main list as well.

        List<Integer> sublist = new ArrayList<>();
        sublist = listCopy.subList(5, listCopy.size());
        sublist.set(3, 11);
        System.out.println("Sublist of Copy: " + sublist);
        System.out.println("Replacing Sublist will change list its created: " + listCopy);

        List<Integer> Llist = new LinkedList<>();
        Llist.add(10);
        Llist.add(20);
        Llist.add(30);
        ListIterator iterator = Llist.listIterator();
        System.out.println("First next(): " + iterator.next());
        System.out.println("Second next(): " + iterator.next());
        System.out.println("Previous(): " + iterator.previous());


    }
}
