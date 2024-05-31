import java.util.Arrays;

public class Challenge6 {

    private static String normalizeAndSort(String input) {
        char[] chars = input.replaceAll("\\s+", "").toLowerCase().toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public static boolean areAnagrams(String str1, String str2) {
        String sortedStr1 = normalizeAndSort(str1);
        String sortedStr2 = normalizeAndSort(str2);
        return sortedStr1.equals(sortedStr2);
    }

    public static void main(String[] args) {
        String str1 = "Despite commuting at the peek hour";
        String str2 = "she was able to keep to time";

        if (areAnagrams(str1, str2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }
}
