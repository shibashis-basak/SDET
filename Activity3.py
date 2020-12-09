user1 = input("Enter the 1st choice : ")
user2 = input("Enter the 2nd choice : ")

if (user1==user2):
    print("Its a tie")
elif(user1 == "Scissors"):
    if(user2 == "Paper"):
        print("user1 wins")
    else:
        print("user2 wins")
elif(user1 == "Paper"):
    if(user2 == "Rock"):
        print("user1 wins")
    else:
        print("user2 wins")
else:
    if(user2 == "Scissors"):
        print("user1 wins")
    else:
        print("user2 wins")