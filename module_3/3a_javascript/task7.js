// Initialize three variables side1, side2, and side3
let side1 = 3;
let side2 = 3;
let side3 = 3;

// Check if all sides are equal
if (side1 === side2 && side2 === side3) {
    console.log("Equilateral triangle");
} 
// Check if any two sides are equal
else if (side1 === side2 || side1 === side3 || side2 === side3) {
    console.log("Isosceles triangle");
} 
// If no sides are equal
else {
    console.log("Scalene triangle");
}