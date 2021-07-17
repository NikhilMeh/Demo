import java.util.*;
import java.lang.*;

public class Calculator {
    public static void main(String args[]) {
        Perform p = new Perform();
      char c;
        do {
            System.out.println("=============Enter your choice=============");
            System.out.println("For addition press'1'");
            System.out.println("For subtraction press'2'");
            System.out.println("For multiplication press'3'");
            System.out.println("For division press'4'");
            System.out.println("Enter your choice");
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();


            switch (n) {
                case 1:
                    System.out.println("Enter the first number: ");
                    double a = sc.nextInt();
                    System.out.println("Enter the second number: ");
                    double b = sc.nextInt();
                    p.add(a, b);
                    break;
                case 2:
                    System.out.println("Enter the first number: ");
                    double ae = sc.nextInt();
                    System.out.println("Enter the second number: ");
                    double be = sc.nextInt();
                    p.subtraction(ae, be);
                    break;
                case 3:
                    System.out.println("Enter the first number: ");
                    int af = sc.nextInt();
                    System.out.println("Enter the second number: ");
                    int bf = sc.nextInt();
                    p.multi(af, bf);
                    break;
                case 4:
                    System.out.println("Enter the first number: ");
                    int ad = sc.nextInt();
                    System.out.println("Enter the second number: ");
                    int bd = sc.nextInt();
                    p.div(ad, bd);
                    break;
                default:
                    System.out.println("Invalid Choice");


            }
            System.out.println("Do you want to continue(y/n");
             c= sc.next().charAt(0);
        }while(c=='y'||c=='Y');
    }


}
 class Perform {
     public static void add(int a,int b) {
         System.out.println(a + b);
     }
     public static void add(double a,double b) {
         System.out.println(a + b);
     }
     public static void subtraction(int a,int b) {
         System.out.println(a - b);
     }
     public static void subtraction(double a,double b) {
         System.out.println(a - b);
     }
     public static void multi(int a,int b) {
         System.out.println(a * b);
     }
     public static void div(int a,int b) {
         System.out.println(a / b);
     }
}
