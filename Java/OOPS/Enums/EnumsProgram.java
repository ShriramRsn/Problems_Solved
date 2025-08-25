package OOPS.Enums;

public class EnumsProgram {
    enum Week implements enums{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

        Week(){
            System.out.println("Constructor called " + this);
        }

        @Override
        public void hello() {
            System.out.println("hello from enum");
        }
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
        for(Week day : Week.values()){
            System.out.println(day);
        }
        week.hello();
    }
}

interface enums{
    public void hello();
}
