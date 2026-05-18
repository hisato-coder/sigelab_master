//2つの自然数 m と n を取り，m < n の真理値を返す lt
#include <stdio.h>
int iszero(int m) { return m == 0; }
int pi(int m) { if (m == 0) return 0; return m - 1; }

int lt(int m, int n) {
    if (iszero(n)) {
        return 0; // nが先に0になったら m >= n
    } else if (iszero(m)) {
        return 1; // mが先に0になったら m < n
    } else {
        return lt(pi(m), pi(n));
    }
}

int main() {
    int m, n;
    printf("Enter two numbers: ");
    scanf("%d %d", &m, &n);
    if (lt(m, n)) {
        printf("%d is less than %d.\n", m, n);
    } else {
        printf("%d is not less than %d.\n", m, n);
    }
    return 0;
}