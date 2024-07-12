# # declare a  variable
myList = [2, 1, 0.98, 59, 29]


# Print the list in console
print("Original list:", myList)

# Sort the list
myList.sort()

print("Sorted list:", myList)

# declare a second variable
myList2 = ["Tope", "Testify"]

# Loop through list2
for x in myList2:

# append to mylist
    myList.append(x)

# Print out the new list
print("Appended list:", myList)


# To insert at postion 0
myList.insert(0,True)
print("Inserted list:", myList)