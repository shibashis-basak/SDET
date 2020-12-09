user1name = input("Enter the 1st player's name : ")
user2name = input("Enter the 2nd player's name : ")
repeat="yes"

while repeat == "yes":
    user1 = input("Enter the "+user1name+"'s choice : ")
    user2 = input("Enter the "+user2name+"'s choice : ")

    if (user1==user2):
        print("Its a tie")
    elif(user1 == "Scissors"):
        if(user2 == "Paper"):
            print(user1name+" wins")
        else:
            print(user2ame+" wins")
    elif(user1 == "Paper"):
        if(user2 == "Rock"):
            print(user1name+" wins")
        else:
            print(user2name+" wins")
    else:
        if(user2 == "Scissors"):
            print(user1name+" wins")
        else:
            print(user2name+" wins")
    repeat = input("Do you want to play agian (yes/no) : ")
else:
    raise SystemExit