import java.util.*;

public class StackEx {
    // reverse a string using Stack
    public static String reverseString(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        String rs = "";
        while (! stack.empty()) {
            rs += stack.pop();
        }
        return rs;
    }

    public static void main(String[] args) {
        System.out.println(reverseString("123456"));
    }

}