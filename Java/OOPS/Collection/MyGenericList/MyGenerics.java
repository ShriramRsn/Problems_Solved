

public class MyGenerics {
    public static void main(String[] args) {
        GenericList<Integer> list = new GenericList<>();
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(7);

        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for(int i : list){
            System.out.println(i);
        }
    }
}
