numlist = list(input("Enter the numbers : ").split(", "))
sum=0
for num in numlist:
    sum+=int(num)
print("Sum = "+str(sum))