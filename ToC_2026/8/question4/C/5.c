// p.51 のカットオフ減算（cut-off subtraction）関数
#include <stdio.h>
int iszero(int m) { return m == 0; }
int pi(int m) { if (m == 0) return 0; return m - 1; }

int cut_off_sub(int m, int n) {
    if (iszero(n)) {
        return m;
    } else {
        return cut_off_sub(pi(m), pi(n));
    }
}

int main() {
    int m, n;
    printf("Enter two numbers (m n): ");
    scanf("%d %d", &m, &n);
    int result = cut_off_sub(m, n);
    printf("The cut-off subtraction of %d and %d is %d\n", m, n, result);
    return 0;
}