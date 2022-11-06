#List creation and searching
End=False
names  = []
for x in range(0,10):
    Name = input("Enter a name:")
    names.append(Name)
print (names)

print("Search for name or type End to end the game")
while(End!=True):
    search=input("Enter search here:")
    if search in names:
        print(search, "name was found")
    elif search == "End":
        print("End of Program")
        End=True
    else:
        print (search, "name was not found")
    
        
    

