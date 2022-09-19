def fun():
    print("Test de la fonction 1 => True")
    return True
    
def lol():
    print("Test de la fonction 2 => False")
    return False

def gag():
    print("Test de la fonction 3 => True")
    return True
    
list_test = [fun(), gag(),lol()]

result = any(list_test)
