import java.util.Scanner;

public class Q3_Lt {
    static boolean iszero(int m) { return m == 0; }
    static int pi(int m) { return m == 0 ? 0 : m - 1; }

    static boolean lt(int m, int n) {
        if (iszero(n)) {
            return false;
        } else if (iszero(m)) {
            return true;
        } else {
            return lt(pi(m), pi(n));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        if (lt(m, n)) {
            System.out.println(m + " is less than " + n + ".");
        } else {
            System.out.println(m + " is not less than " + n + ".");
        }
    }
}