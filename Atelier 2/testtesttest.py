def modif_entier(x):
    print(id(x))
    x = x+5
    print(id(x))


y = 5
print(id(y),y)
modif_entier(y)
print("y = ",y)