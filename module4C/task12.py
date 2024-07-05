# Declare a global variable
language = "Python"

# Define a function that declares a local variable with the same name
def language():
    # Declare a local variable with the same name
    language = "Java"
    # Print the local variable
    print("Inside the function, language:", language, "\n")

# Invoke the function
language()

# Print the global variable
print("Outside the function, language:", language)