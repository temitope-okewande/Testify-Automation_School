public class Challenge7 {
    public static void main(String[] args) {
        String word = "TestifyAutomation";
        String reversed = reverse(word);
        System.out.println("Original String: " + word);
        System.out.println("Reversed String: " + reversed);
    }
    public static String reverse(String str) {

        if (str.isEmpty()) {
            return str;
        }

        return reverse(str.substring(1)) + str.charAt(0);
    }
}
