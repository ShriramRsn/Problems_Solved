package OOPS.Collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // To retrieve 2 smallest elements from the priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        while(true){
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }
            pq.offer(num);
        }

        List<Integer> Top2 = new ArrayList<>();
        int index = 0;
        while(!pq.isEmpty()){
            if(index == 2){
                break;
            }

            Top2.add(pq.poll());
            index++;
        }
        System.out.println(Top2);
        System.out.println(pq);

        // To retrieve 2 largest elements from the priority queue
        List<Students> ls = new ArrayList<>();
        ls.add(new Students(2, 48));
        ls.add(new Students(3, 65));
        ls.add(new Students(5, 73));
        ls.add(new Students(11, 100));

        PriorityQueue<Students> pq2 = new PriorityQueue<>(ls);
        List<Students> large2 = new ArrayList<>();
        index = 0;
        while(!pq2.isEmpty()){
            if(index == 2){
                break;
            }

            large2.add(pq2.poll());
            index++;
        }
        System.out.println(large2);
        System.out.println(pq2);

        PriorityQueue<Integer> pq3 = new PriorityQueue<>((a , b) -> b - a);
        PriorityQueue<Integer> pq4 = new PriorityQueue<>(new CustomComparator());
        pq3.offer(2);
        pq3.offer(3);
        pq3.offer(5);
        pq3.offer(6);
        List<Integer> TopTwo = new ArrayList<>();
        index = 0;
        while(!pq3.isEmpty()){
            if(index == 2){
                break;
            }

            TopTwo.add(pq3.poll());
            index++;
        }
        System.out.println(TopTwo);
        System.out.println(pq3);

    }
}

class Students implements Comparable<Students>{
    
    private int rollno;
    private int marks;

    public Students(int rollno, int marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    public int getRollno() {
        return rollno;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public int compareTo(Students o) {
        return o.marks - this.marks;
    }

    @Override
    public String toString() {
        return "" + marks;
    }

}

class CustomComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
    
}