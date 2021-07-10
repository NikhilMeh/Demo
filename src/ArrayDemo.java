import java.lang.reflect.Array;
import java.util.*;
public class ArrayDemo {

    public static void main (String a[])
    {
        int[] marks = {90,96,98,97,94};
        int[][] marks2 ={{90,96,98,97,94},{90,98,97,96,95}};
        System.out.println(marks[4]);
        System.out.println(marks2[1][4]);
        System.out.println(Array.getLength(marks));
    }
}
