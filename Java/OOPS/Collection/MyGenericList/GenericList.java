import java.util.Iterator;

public class GenericList <T> implements Iterable<T>{
    private T[] items;
    private int size;
    
    public GenericList(){
        size = 0;
        items =(T[]) new Object[100];
    }

    public void add(T item){
        items[size++] = item;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyGenericsIterator(this);
    }

    private class MyGenericsIterator implements Iterator<T>{
        private GenericList<T> list;
        private int index = 0;

        public MyGenericsIterator(GenericList<T> list){
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return index < list.size;
        }

        @Override
        public T next() {
            return list.items[index++];
        }

        
    }
}
