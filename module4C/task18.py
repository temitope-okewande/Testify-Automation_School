class Human:
    leg_count = 4
    can_walk = True

    def __init__(self, name):
        self.name = name


# Instantiate the Human class
person = Human("Temitope")

# Print the leg_count and can_walk attributes
print("Leg count:", person.leg_count)
print("Can walk:", person.can_walk)
