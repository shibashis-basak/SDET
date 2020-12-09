numlist1 = [1, 2, 3, 4, 5]
numlist2 = [6, 7, 8, 9, 10]
print(numlist1)
print(numlist2)
newlist = []
for num in numlist1:
    if(num%2 != 0):
        newlist.append(num)
for num in numlist2:
    if(num%2 == 0):
        newlist.append(num)
print(newlist)