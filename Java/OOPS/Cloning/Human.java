package OOPS.Cloning;

public class Human implements Cloneable{
    int age;
    String name;
    int[] nums;
    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.nums = new int[]{2, 3, 5, 7, 11};
    }

    public Human(Human other){
        this.age = age;
        this.name = name;
    }

    // public Object clone() throws CloneNotSupportedException {
    //     //this is shallow copy
    //     return super.clone();
    // }

    public Object clone() throws CloneNotSupportedException {
        //this is deep copy
        Human myClone = (Human) super.clone(); //Shallow Copy
        //Deep copy
        myClone.nums = new int[myClone.nums.length];
        // System.arraycopy(this.nums, 0, myClone.nums, 0, myClone.nums.length);
        for(int i = 0; i < myClone.nums.length; i++){
            myClone.nums[i] = this.nums[i];
        }
        return myClone;
    }
    
}
