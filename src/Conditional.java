import java.util.*;
public class Conditional {
    public static void main(String args[]){
        Scanner nt=new Scanner(System.in);
        System.out.println("Enter the cost of product :");
        int a=nt.nextInt();
        if(a>150) {
            System.out.println("can buy both");
            System.out.println("can buy both");
        }

        else if (a<150 && a>=100)
            System.out.println("can buy A");
        else if (a>=50 && a<100)
            System.out.println("can buy B");
        else
            System.out.println("can't buy");
    }
}
