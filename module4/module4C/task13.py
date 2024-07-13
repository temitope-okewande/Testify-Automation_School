# Global variable to control recursion depth
recursion_depth = 0

def hello():
    global recursion_depth
    # Base condition to prevent infinite recursion
    if recursion_depth < 5:
        print("Hello World")
        recursion_depth += 1
        # Invoke the function within its own body
        hello()

# Invoke the function outside the function block
hello()