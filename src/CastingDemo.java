public class CastingDemo {
    public static void main(String[] args) {
        double myDouble = 10.15;
        int myInt = (int) myDouble;
        double b = 9+ myDouble;
        int c = 9+myInt;
        // Automatic casting: int to double

        System.out.println(myDouble);
        System.out.println(myInt);      // Outputs 9

        System.out.println(b);// Outputs 9.0
        System.out.println(c);// Outputs 9.0
    }
}