package OOPS;

import java.util.Arrays;

class Student implements Comparable<Student>{
    int rollno;
    int marks;
    String name;

    public Student(int marks, int rollno, String name) {
        this.marks = marks;
        this.rollno = rollno;
        this.name = name;
    }

    @Override
    public String toString() {
        return marks + " " + name;
    }

    @Override
    public int compareTo(Student o) {
        int diff = (int)(this.marks - o.marks);
        // diff == 0 both have same marks
        // diff < 0 return negative value means o.marks obj has more than this.marks "compareTo(janu)"
        // diff > 0 return positive value means o.marks obj has less than this.marks "ram."
        return diff;
    }



}


public class Comparing {
    public static void main(String[] args) {
        Student ram = new Student(80, 21, "Ram");
        Student janu = new Student(96, 25, "Janu");
        Student[] list = {ram,janu};
        Arrays.sort(list); 
        System.out.println(Arrays.toString(list));

        if(ram.compareTo(janu) < 0){
            System.out.println("janu has more marks ");
        }
        else if(ram.compareTo(janu) == 0){
            System.out.println("Both have same marks");
        }
        else if(ram.compareTo(janu) > 0){
            System.out.println("Ram has more marks");
        }
    }
}
