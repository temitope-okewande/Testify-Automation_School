//Return the number of vowels in a string.
function count_vowels(words) {
    
    words = words.toLowerCase();

    let vowel_count = 0;

    for (let vowel of words) {
        // Check if the character is a vowel
        if (vowel === 'a' || vowel === 'e' || vowel === 'i' || vowel === 'o' || vowel === 'u') {
            // Increment the count if it is a vowel
            vowel_count++;
        }
    }

    // Return the total count of vowels
    return vowel_count;
}
console.log(count_vowels('Together forever'))