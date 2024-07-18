myVowels = ["a", "e", "i", "o", "u", "A", "E", "I", "O", "U"]


def no_of_vowels(word):
    count = 0
    for i in word:
        if i in myVowels:
            count += 1
    return count


word = "Book"
print(f"The numbers of vowels is {no_of_vowels(word)}")
