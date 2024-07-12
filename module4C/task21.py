# Create a class called Human
class Human:
    # Add an attribute leg_count with the value of 4
    leg_count = 4

    #Add a method called get_gender() that returns "Unknown" in the Human class
    def get_gender(self):
        return "Unknown"


# Create another class called Man that extends Human
class Man(Human):
    #Man create the method get_gender() which should return "man"
    def get_gender(self):
        return "Man"


# Create another class called Woman that extends Human
class Woman(Human):
    # Woman create the method get_gender() which should return "woman"
    def get_gender(self):
        return "Woman"


# instantiate the Man and Woman classes
man = Man()
woman = Woman()

# Print out the value of get_gender() from the Man and Woman object instances
print("Man's Gender is :", man.get_gender())
print("\nWoman's Gender is : ", woman.get_gender())