public class Q1678_GoalParserInterpretation {
    public String interpret(String command) {
        char[] chars = command.toCharArray();
        int index = 0;
        StringBuilder finalString = new StringBuilder();
        while (index < chars.length) {
            switch (chars[index]) {
                case 'G':
                    finalString.append('G');
                    index++;
                    break;
                case '(':
                    if (chars[index + 1] == 'a') {
                        finalString.append("al");
                        index += 4;
                    } else {
                        finalString.append('o');
                        index += 2;
                    }
            }
        }
        return finalString.toString();
    }
}