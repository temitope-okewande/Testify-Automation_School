import java.util.*;


public class Challenge5 {
    public static void main(String[] args) {
        String[] input = new String[]{"akka", "akak", "baab", "baba", "bbaa"};
        Map<String, List<String>> anagramBuckets = groupAnagrams(input);

        // Print the anagram buckets
        for (Map.Entry<String, List<String>> entry : anagramBuckets.entrySet()) {
            System.out.println(entry.getValue());

        }
    }

    public static Map<String, List<String>> groupAnagrams(String[] input) {
        // Create a map to hold the anagram buckets
        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String word : input) {
            // Convert the word to a character array and sort it
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);

            // Use the sorted word as the key in the map
            anagramMap.computeIfAbsent(sortedWord, k -> new ArrayList<>()).add(word);
        }
        return anagramMap;
    }
}
