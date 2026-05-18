//数値の等価演算子 eq
#include <stdio.h>
int iszero(int m) { return m == 0; }
int pi(int m) { if (m == 0) return 0; return m - 1; }

int eq(int m, int n) {
    if (iszero(m)) {
        return iszero(n);
    } else if (iszero(n)) {
        return 0; 
    } else {
        return eq(pi(m), pi(n));
    }
}

int main() {
    int m, n;
    printf("Enter two numbers: ");
    scanf("%d %d", &m, &n);
    if (eq(m, n)) {
        printf("%d and %d are equal.\n", m, n);
    } else {
        printf("%d and %d are not equal.\n", m, n);
    }
    return 0;
}