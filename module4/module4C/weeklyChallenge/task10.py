def negative_numbers(arr):
    my_result = []
    for number in arr:
        if number >= 0:
            my_result.append(number)
    return my_result


arr = [-1, 0, 4, 7, -3]
print(f"Your new array is: {negative_numbers(arr)}")
