import java.util.Scanner;

public class Q2_Eq {
    static boolean iszero(int m) { return m == 0; }
    static int pi(int m) { return m == 0 ? 0 : m - 1; }

    static boolean eq(int m, int n) {
        if (iszero(m)) {
            return iszero(n);
        } else if (iszero(n)) {
            return false;
        } else {
            return eq(pi(m), pi(n));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        if (eq(m, n)) {
            System.out.println(m + " and " + n + " are equal.");
        } else {
            System.out.println(m + " and " + n + " are not equal.");
        }
    }
}