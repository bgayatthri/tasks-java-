import java.util.*;

interface PerformOperation {
    boolean check(int a);
}

public class Solution {

    static PerformOperation isOdd() {
        return n -> (n & 1) == 1;
    }

    static PerformOperation isPrime() {
        return n -> {
            if (n <= 1) return false;
            for (int i = 2; i * i <= n; i++)
                if (n % i == 0) return false;
            return true;
        };
    }

    static PerformOperation isPalindrome() {
        return n -> {
            int rev = 0, x = n;
            while (x > 0) {
                rev = rev * 10 + x % 10;
                x /= 10;
            }
            return rev == n;
        };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int ch = sc.nextInt(), num = sc.nextInt();
            PerformOperation op = (ch == 1) ? isOdd() : (ch == 2) ? isPrime() : isPalindrome();

            String result =
                    (ch == 1) ? (op.check(num) ? "ODD" : "EVEN") :
                    (ch == 2) ? (op.check(num) ? "PRIME" : "COMPOSITE") :
                               (op.check(num) ? "PALINDROME" : "NOT PALINDROME");

            System.out.println(result);
        }
        sc.close();
    }
}
