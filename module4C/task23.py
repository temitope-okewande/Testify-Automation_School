# Create a class called User
class User:
    #     Create a private attribute called __password with the value "password" in the User class
    def __init__(self):
        self.__password = "password"

    # Create a method get_password() that returns self.__password in the User class
    def get_password(self):
        return self.__password


#     Create another class called ActiveUser that inherits from the User class
class ActiveUser(User):
    #     Create a method get_password() that returns "********" in the ActiveUser class
    def get_password(self):
        return "********"

# Instantiate an object of the ActiveUser class
active_user = ActiveUser()

# Print the value of get_password() from the object instance
print("Your password is:", active_user.get_password())