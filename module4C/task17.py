class Human:
    name = "Temitope"
    student = True
    gender = "Female"

    def display_info(self):
        print(f"Name: {self.name}")
        print(f"Age: {self.student}")
        print(f"Gender: {self.gender}")


# Create an instance of the Human class
person = Human()

# Display the information of the created instance
print(person.name, person.student, person.gender)
