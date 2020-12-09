name = input("Enter name: ")
age = int(input("Enter your present age: "))
futureAge= int(input("Enter your future age: "))
futureYear = (futureAge-age)+2020
statement = name+" will be {0} years old in the year {1}"
print(statement.format(futureAge, futureYear))