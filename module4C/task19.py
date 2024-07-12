class Human:

    leg_count = 4
    can_walk = True

    def get_description(self):
        print("This is human")

    def get_leg_count(self):
        return self.leg_count

# Instantiate the Human class
person = Human()

# Invoke the get_description method
person.get_description()

# Invoke the method that returns the leg count and print the result
print("\nHuman Leg count:", person.get_leg_count())