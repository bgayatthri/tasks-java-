public class Fibonacci {

    static int nthFibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int a = 0, b = 1;

        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println("Nth Fibonacci number: " + nthFibonacci(n));
    }
}
