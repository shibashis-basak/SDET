num = int(input("Enter the number: "))
str = "{} x {} = {}"
for i in range (1,11):
    print(str.format(num, i, num*i))