package OOPS.Cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human sriram = new Human(0, "Sriram");
        // Human myClone = new Human(sriram);

        Human myClone = (Human) sriram.clone();
        System.out.println(myClone.age + " \n" + myClone.name + " \n" + Arrays.toString(myClone.nums));
        sriram.nums[1] = 100;
        sriram.name = "ello";
        System.out.println(myClone.age + " \n" + myClone.name + " \n" + Arrays.toString(myClone.nums));
        
    }
}
/*  Shallow Copy:
 *      Primitive Fields values are copied
 *      References are copied, not the actual objectsd
 */

/*  Deep Copy:
 *      In addition to copying primitives, 
 *      it also makes separate copies of referenced objects.
 */