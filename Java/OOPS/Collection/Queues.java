import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();

        q.offer(2);
        q.offer(3);
        q.offer(5);
        q.offer(7);

        // System.out.println(q.peek());
        // System.out.println(q.poll());
        // System.out.println(q.peek());
        // System.out.println(q.isEmpty());

        Deque<Integer> dq = new ArrayDeque<>();
        dq.offerFirst(2);
        dq.offerFirst(3);
        dq.offerLast(2);

        System.out.println(dq.peekFirst());
        
        System.out.println(dq.peekLast());
        
    }
}
