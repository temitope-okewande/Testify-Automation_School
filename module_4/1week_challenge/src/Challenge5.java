import java.util.*;


public class Challenge5 {
    public static void main(String[] args) {

        String[] words = new String[]{"akka", "akak", "baab", "baba", "bbaa"};

        Map<String, List<String>> anagramBuckets = groupAnagrams(words);
        for (Map.Entry<String, List<String>> entry : anagramBuckets.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    public static Map<String, List<String>> groupAnagrams(String[] input) {

        Map<String, List<String>> aMap = new HashMap<>();
        for (String word : input) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);
            aMap.computeIfAbsent(sortedWord, k -> new ArrayList<>()).add(word);
        }
        return aMap;
    }
}
