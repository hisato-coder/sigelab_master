//2つの自然数 m と n を取り，m を n で割った余りを返す関数 mod
#include <stdio.h>
int iszero(int m) { return m == 0; }
int pi(int m) { if (m == 0) return 0; return m - 1; }

int lt(int m, int n) {
    if (iszero(n)) return 0;
    else if (iszero(m)) return 1;
    else return lt(pi(m), pi(n));
}

int cut_off_sub(int m, int n) {
    if (iszero(n)) return m;
    else return cut_off_sub(pi(m), pi(n));
}

int mod(int m, int n) {
    if (iszero(n)) {
        return -1; 
    }
    
    if (lt(m, n)) {
        return m;
    } else {
        return mod(cut_off_sub(m, n), n);
    }
}

int main() {
    int m, n;
    printf("Enter two numbers (m n): ");
    scanf("%d %d", &m, &n);
    int result = mod(m, n);
    if (result == -1) {
        printf("Error: Cannot divide by zero.\n");
    } else {
        printf("The remainder of %d divided by %d is %d\n", m, n, result);
    }
    return 0;
}