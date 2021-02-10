
public class Q415_AddStrings {

    // First we want to fix the strings to accommodate for decimal points no appearing in one string.
    // Second we want to Pad the string with zeros both before and after the decimal point. This ensures the lengths of the strings are the same
    // Then we want to add the strings
    // Finally we want to remove all leading and trailing zeros
    public static String addStrings(String string1, String string2) {
        StringBuilder firstString = new StringBuilder(string1);
        StringBuilder secondString = new StringBuilder(string2);

        fixStrings(firstString, secondString);
        padStringRight(firstString, secondString);
        padStringLeft(firstString, secondString);

        StringBuilder finalString = add(firstString, secondString);
        cleanUp(finalString);

        return finalString.toString();
    }

    // Handles the case when one is an integer and the other is a double.
    private static void fixStrings(StringBuilder firstString, StringBuilder secondString) {
        if (firstString.indexOf(".") > 0 && secondString.indexOf(".") < 0) {
            secondString.append(".");
        } else if (firstString.indexOf(".") < 0 && secondString.indexOf(".") > 0) {
            firstString.append(".");
        }
    }

    // Pads the strings after the decimal point in zeros to match in length
    private static void padStringRight(StringBuilder firstString, StringBuilder secondString) {
        if (firstString.indexOf(".") == -1) {
            return;
        }
        int firstLengthAfterDecimal = firstString.length() - firstString.indexOf(".");
        int secondLengthAfterDecimal = secondString.length() - secondString.indexOf(".");
        if (firstLengthAfterDecimal < secondLengthAfterDecimal) {
            int times = secondLengthAfterDecimal - firstLengthAfterDecimal;
            for (int i = 0; i < times; i++) {
                firstString.append("0");
            }
        } else if (firstLengthAfterDecimal > secondLengthAfterDecimal) {
            int times = firstLengthAfterDecimal - secondLengthAfterDecimal;
            for (int i = 0; i < times; i++) {
                secondString.append("0");
            }
        }
    }

    // pads the numbers with zeros to the left fo the decimal points to match in length
    private static void padStringLeft(StringBuilder firstString, StringBuilder secondString) {
        if (firstString.length() < secondString.length()) {
            int times = secondString.length() - firstString.length();
            for (int i = 0; i < times; i++) {
                firstString.insert(0, "0");
            }
        } else if (firstString.length() > secondString.length()) {
            int times = firstString.length() - secondString.length();
            for (int i = 0; i < times; i++) {
                secondString.insert(0, "0");
            }
        }
    }

    // Adds two strings, assuming that they are the same length with apdding before and after decimal point
    private static StringBuilder add(StringBuilder firstString, StringBuilder secondString) {
        StringBuilder finalString = new StringBuilder();
        for (int i = 0; i < firstString.length(); i++) {
            finalString.append("0");
        }

        int lastCarryOver = 0;
        for (int i = firstString.length() - 1; i >= 0; i--) {
            if (firstString.charAt(i) == '.') {
                finalString.setCharAt(i, '.');
            } else {
                int a = firstString.charAt(i) - '0';
                int b = secondString.charAt(i) - '0';
                int result = a + b + lastCarryOver;
                if (result >= 10) {
                    result = result % 10;
                    lastCarryOver = 1;
                } else {
                    lastCarryOver = 0;
                }
                finalString.setCharAt(i, (char) (result + '0'));
            }
        }

        if (lastCarryOver == 1) {
            finalString.insert(0, '1');
        }
        return finalString;
    }

    //remove all leading or trailing zeros
    private static void cleanUp(StringBuilder finalString) {
        while (finalString.length() > 0 && finalString.charAt(0) == '0') {
            finalString.deleteCharAt(0);
        }
        while (finalString.length() > 0 && finalString.charAt(finalString.length() - 1) == 0) {
            finalString.deleteCharAt(finalString.length() - 1);
        }
        if (finalString.length() == 0) {
            finalString.append("0");
        }
    }

    public static void main(String[] args) {

//        System.out.println(Q415_AddStrings.addStrings("0", "0"));
        System.out.println(addStrings("9133", "0"));
        System.out.println(addStrings("1234", "1234"));
        System.out.println(addStrings("1234.23", "1234.41"));
        System.out.println(addStrings("1234.2", "001234"));
    }
}
