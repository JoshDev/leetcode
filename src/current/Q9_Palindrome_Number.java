package current;

import java.util.Stack;

public class Q9_Palindrome_Number {
    public boolean isPalindrome(int x) {
        Stack<Integer> test = new Stack<>();
        int original = x;
        while (x > 0) {
            int digit = x % 10;
            test.push(digit);
            x = x / 10;
        }
        int sum = 0;
        int factor = 1;
        while (!test.isEmpty()) {
            sum += test.pop() * factor;
            factor *= 10;
        }
        return original == sum;
    }

    public static void main(String[] args) {
        System.out.println(new Q9_Palindrome_Number().isPalindrome(121));
    }
}
