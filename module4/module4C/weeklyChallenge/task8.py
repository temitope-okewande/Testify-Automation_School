def MyBoolean(number):
    if (number % 10) == 0:
        return True
    else:
        return False


# number = 20
# print(f"Is {number} divisible by 10? {MyBoolean(number)}")
print(f"{MyBoolean(20)}")

