import java.util.Scanner;

public class Q4_Mod {
    static boolean iszero(int m) { return m == 0; }
    static int pi(int m) { return m == 0 ? 0 : m - 1; }

    static boolean lt(int m, int n) {
        if (iszero(n)) return false;
        else if (iszero(m)) return true;
        else return lt(pi(m), pi(n));
    }

    static int cut_off_sub(int m, int n) {
        if (iszero(n)) return m;
        else return cut_off_sub(pi(m), pi(n));
    }

    static int mod(int m, int n) {
        if (iszero(n)) {
            return -1;
        }
        if (lt(m, n)) {
            return m;
        } else {
            return mod(cut_off_sub(m, n), n);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers (m n): ");
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int result = mod(m, n);
        if (result == -1) {
            System.out.println("Error: Cannot divide by zero.");
        } else {
            System.out.println("The remainder of " + m + " divided by " + n + " is " + result);
        }
    }
}