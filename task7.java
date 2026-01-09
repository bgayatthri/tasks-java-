import java.util.*;
public class DigitSumEven {

    static int digitSumEven(int n) {
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;

            if ((digit & 1) == 0) {   // checks even digit
                sum += digit;
            }

            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 248731;
        System.out.println("Sum of even digits: " + digitSumEven(n));
    }
}
