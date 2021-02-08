import java.util.HashMap;
import java.util.Map;

public class Q1309_DecryptStringFromAlphabetToIntegerMapping {
    Map<String, Character> lookUpMap = new HashMap<>();
    {
        lookUpMap.put("1", 'a');
        lookUpMap.put("2", 'b');
        lookUpMap.put("3", 'c');
        lookUpMap.put("4", 'd');
        lookUpMap.put("5", 'e');
        lookUpMap.put("6", 'f');
        lookUpMap.put("7", 'g');
        lookUpMap.put("8", 'h');
        lookUpMap.put("9", 'i');
        lookUpMap.put("10#", 'j');
        lookUpMap.put("11#", 'k');
        lookUpMap.put("12#", 'l');
        lookUpMap.put("13#", 'm');
        lookUpMap.put("14#", 'n');
        lookUpMap.put("15#", 'o');
        lookUpMap.put("16#", 'p');
        lookUpMap.put("17#", 'q');
        lookUpMap.put("18#", 'r');
        lookUpMap.put("19#", 's');
        lookUpMap.put("20#", 't');
        lookUpMap.put("21#", 'u');
        lookUpMap.put("22#", 'v');
        lookUpMap.put("23#", 'w');
        lookUpMap.put("24#", 'x');
        lookUpMap.put("25#", 'y');
        lookUpMap.put("26#", 'z');

    }
    public String freqAlphabets(String s) {
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while (i < s.length()) {
            if (i < s.length() - 2 && s.charAt(i + 2) == '#') {
                sb.append(lookUpMap.get(s.substring(i, i+3)));
                i += 3;
            } else {
                sb.append(lookUpMap.get(s.substring(i, i + 1)));
                i++;
            }
        }
        return sb.toString();
    }
}
