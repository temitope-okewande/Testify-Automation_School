//Create a length converter function.
function length_converter(inches) {
    //Convert iches to meters
    let meter_value= inches * 0.0254;
    meters = meter_value.toFixed(3)
    
    return meters;
}

console.log(length_converter(3))