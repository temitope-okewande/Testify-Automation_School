class Human:
    leg_count = 4

    def get_gender(self):
        return "Unknown"


class Man(Human):
    pass


class Woman(Human):
    pass


# Instantiate the Man and Woman classes

man = Man()
woman = Woman()

# Print the values of the get_gender() method in each object instance

print("Man's gender:", man.get_gender())
print("\nWoman's gender:", woman.get_gender())
