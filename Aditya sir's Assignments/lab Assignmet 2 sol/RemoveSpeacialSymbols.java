public class Main {
    public static void main(String[] args) {
        String s = "He#llo $Wo%rld!";
        String result = removeSpecialCharacters(s);
        System.out.println(result); // Output: HelloWorld
    }

    public static String removeSpecialCharacters(String s) {
        // Regular expression to match special characters
        String regex = "[^a-zA-Z0-9]";

        
        String result = s.replaceAll(regex, "");

        return result;
    }
}
