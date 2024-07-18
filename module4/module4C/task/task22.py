# Create a class called Hunt
class Hunt:
    # Create a private attribute called __weapon with the value "Assault Rifle" in the Hunt class
    __weapon = "Assault Riffle"

    #     Create a method get_weapon() that returns "Not Available" in the Hunt class
    def get_weapon(self):
        return "Not Available"


# Instantiate an object of the Hunt class
hunt = Hunt()
# Print the value of get_weapon() from the object instance
print("Is weapon available: ", hunt.get_weapon())
