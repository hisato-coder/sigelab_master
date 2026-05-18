import java.util.Scanner;

public class Q1_Fac {
    static boolean iszero(int m) { return m == 0; }
    static int pi(int m) { return m == 0 ? 0 : m - 1; }

    static int fac(int m) {
        if (iszero(m)) {
            return 1;
        } else {
            return m * fac(pi(m));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int m = scanner.nextInt();
        System.out.println("The factorial of " + m + " is " + fac(m));
    }
}