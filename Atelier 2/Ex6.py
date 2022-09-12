L = [1,23,4,5]
M = []


def present(L : list,e : int) -> bool:
    for f in L:
        if f == e:
            return True
    return False   
            

def test_present(present : callable) -> str:
    if present:
        return "Echec , La liste n'est pas vide"
    else: return "Succes , la liste est vide"

print(present(L,4))
print(test_present(present(L,4)))
print(test_present(present(M,4)))





