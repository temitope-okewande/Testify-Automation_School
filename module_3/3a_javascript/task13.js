const book ={
    title : 'My book',
    description :'My book description', 
    numberOfPages : 2,
    authour : 'Temitope Okewande',
    reading : true,
    toggleReadingStatus : function(){
        if (book.reading === true){
            book.reading = false
        }
        else{
            book.reading = true
        }

    }

}
console.log(book)