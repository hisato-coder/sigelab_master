//階乗関数 fac(m) = m!
#include <stdio.h>

int iszero(int m) { return m == 0; }
int pi(int m) { if (m == 0) return 0; return m - 1; }

int fac(int m) {
    if (iszero(m)) {
        return 1;
    } else {
        return m * fac(pi(m));
    }
}

int main() {
    int m;
    printf("Enter a number: ");
    scanf("%d", &m);
    printf("The factorial of %d is %d\n", m, fac(m));
    return 0;
}