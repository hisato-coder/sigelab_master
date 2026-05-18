import java.util.Scanner;

public class Q5_CutOffSub {
    static boolean iszero(int m) { return m == 0; }
    static int pi(int m) { return m == 0 ? 0 : m - 1; }

    static int cut_off_sub(int m, int n) {
        if (iszero(n)) {
            return m;
        } else {
            return cut_off_sub(pi(m), pi(n));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers (m n): ");
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int result = cut_off_sub(m, n);
        System.out.println("The cut-off subtraction of " + m + " and " + n + " is " + result);
    }
}