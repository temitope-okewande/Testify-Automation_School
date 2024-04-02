let books = [
    {
        title: "My Book 1",
        description: "Description of  my Book 1",
        numberOfPages: 20,
        author: "Temitope Okewande",
        reading: true
    },
    {
        title: "My Book 2",
        description: "Description of my Book 2",
        numberOfPages: 30,
        author: "Tiaraoluwa Okewande",
        reading: false
    },
    {
        title: "My Book 3",
        description: "Description of my Book 3",
        numberOfPages: 40,
        author: "Oluwabambi Okewande",
        reading: true
    }
];

// Use a for-loop to log books where reading status is true
for (let i = 0; i < books.length; i++) {
    if (books[i].reading === true) {
        console.log(books[i])
    }
}
