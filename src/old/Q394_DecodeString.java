package old;

import java.util.Stack;

public class Q394_DecodeString {
    public String decodeString(String s) {
        Stack<String> stringStack = new Stack<>();
        StringBuilder finalString = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                int endIndex = s.indexOf('[', i);
                String substring = s.substring(i, endIndex);
                stringStack.push(substring);
                stringStack.push("[");
                i += substring.length() + 1;
            } else if (c == ']') {
                StringBuilder insideParens = new StringBuilder();
                while (!stringStack.peek().equals("[")) {
                    String toBeAdded = stringStack.pop();
                    insideParens.insert(0, toBeAdded);
                }
                stringStack.pop();
                int times = Integer.parseInt(stringStack.pop());
                while (times-- > 0) {
                    stringStack.push(insideParens.toString());
                }
                i++;
            } else {
                stringStack.push(Character.toString(c));
                i++;
            }
        }
        StringBuilder end = new StringBuilder();
        while (!stringStack.isEmpty()) {
            end.insert(0, stringStack.pop());
        }
        finalString.append(end.toString());
        return finalString.toString();
    }
}
