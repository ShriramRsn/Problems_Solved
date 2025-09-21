public class NewInstance{
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        Student s = (Student) Class.forName("Student").newInstance();
        System.out.println(s.age);
    }
}

class Student {
    public Student(){
        System.out.println("Student Obj Created");
    }
    int age = 5;
}