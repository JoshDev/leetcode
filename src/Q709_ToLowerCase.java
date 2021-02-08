public class Q709_ToLowerCase {
    public String toLowerCase(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            sb.append(Character.toLowerCase(c));
        }
        return sb.toString();
    }
}
