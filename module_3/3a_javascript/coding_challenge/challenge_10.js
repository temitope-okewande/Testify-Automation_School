
function negative_numbers(){
    let my_numbers= [1,-2,3,-2,6,-4,99,-50,7,8,]
    let negative_numbers = [];
    for (let i of my_numbers){
        if (i > 0){
            negative_numbers.push(i)
        }   
    }
    console.log(negative_numbers)
}
negative_numbers()