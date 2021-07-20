import java.util.*;
public class StudentPerSwitch {
    public static void main(String args[]){
        Scanner st=new Scanner(System.in);
        System.out.println("Enter the %");
        int a=st.nextInt();
        if (a<=100) {
            int b = a / 10;
            switch (b) {
                case 9:
                    System.out.println("A+");
                    break;
                case 8:
                    System.out.println("A");
                    break;
                case 7:
                    System.out.println("B");
                    break;
                case 6:
                    System.out.println("C");
                    break;
                case 5:
                    System.out.println("D");
                    break;
                case 4:
                    System.out.println("E");
                    break;
                default:
                    System.out.println("Fail");
            }
        }
        else
            System.out.println("Don't Try to be over Smart,Enter the percentage below 100");
    }
}
