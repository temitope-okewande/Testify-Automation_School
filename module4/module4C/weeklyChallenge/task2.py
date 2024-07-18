def LengthConverter():
    print("Welcome to Temitope length converter calculator")
    users_request = int(input("Enter your value in m: "))
    parameter = input("\nWhat unit do you want to convert to (cm,dm,km,mm): ")
    centimeter_length = users_request * 100
    decimeter_length = users_request * 10
    kilometer_length = users_request / 1000
    millimeter_request = users_request * 1000
    if parameter == "cm":
        print("\nYour answer is ", centimeter_length, "cm")
    elif parameter == "dm":
        print("\nYour answer is ", decimeter_length, "dm")
    elif parameter == "km":
        print("\nYour answer is ", kilometer_length, "km")
    elif parameter == "mm":
        print("\nYour answer is ", millimeter_request, "mm")
    else:
        print("\nIncorrect input")


LengthConverter()
