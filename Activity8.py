numlist = list(input("Enter the numbers : ").split(", "))
if int(numlist[0]) == int(numlist[-1]):
    print("first and last are equal")
else:
    print("first and last are not equal")