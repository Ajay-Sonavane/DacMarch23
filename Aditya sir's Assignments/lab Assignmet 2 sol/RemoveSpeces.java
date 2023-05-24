public class RemoveSpaces {
    public static String removeSpaces(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ') {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "The quick brown fox";
        String output = removeSpaces(input);
        System.out.println(output);
    }
}
