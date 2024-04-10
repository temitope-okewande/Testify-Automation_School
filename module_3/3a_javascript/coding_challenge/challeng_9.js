const string = "How many vowels are in this question?";
let count = 0;

function countVowels(string) {
    
    string = string.toLowerCase();

   
    for (let char of string) {
        if (char === 'a' || char === 'e' || char === 'i' || char === 'o' || char === 'u') {
            count++;
        }
    }

    return count;
}

console.log("Number of vowels: "+ countVowels(string));