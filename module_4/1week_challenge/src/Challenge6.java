import java.util.Arrays;

public class Challenge6 {
    // Method to normalize and sort a string
    private static String normalizeAndSort(String input) {
        // Remove spaces and convert to lowercase
        char[] chars = input.replaceAll("\\s+", "").toLowerCase().toCharArray();
        // Sort the character array
        Arrays.sort(chars);
        // Convert the sorted character array back to a string
        return new String(chars);
    }
    // Method to check if two strings are anagrams
    public static boolean areAnagrams(String str1, String str2) {
        // Normalize and sort both strings
        String sortedStr1 = normalizeAndSort(str1);
        String sortedStr2 = normalizeAndSort(str2);
        // Compare the normalized, sorted strings
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
