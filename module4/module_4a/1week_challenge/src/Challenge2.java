public class Challenge2 {
    public static void main(String[] args) {
        String my_words= "I am the best AutomationTester";
        String reversedSentence = reverse(my_words);
        System.out.println("Original Sentence: " + my_words);
        System.out.println("Reversed Sentence: " + reversedSentence);
    }
    public static String reverse(String my_words) {
        // Base case: if the sentence is empty, return it as is
        if (my_words.isEmpty()) {
            return my_words;
        }

        // Find the first space in the sentence
        int spaceCheck = my_words.indexOf(" ");

        // If there is no space, it means we have a single word
        if (spaceCheck == -1) {
            return my_words;
        }

        // Get the first word and the rest of the sentence
        String firstWord = my_words.substring(0, spaceCheck);
        String sentence = my_words.substring(spaceCheck + 1);

        // Recursive case: reverse the remaining sentence and append the first word
        return reverse(sentence) + " " + firstWord;
    }
}
