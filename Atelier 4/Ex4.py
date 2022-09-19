from copy import deepcopy
import random as r

L = [1,2,3,4,5,6,7,8,9,10]

def extract_element_list(liste : list,elem_to_extract : int = 2):
    """Extrait elem_to_extract nb d'éléments de L

    Args:
        liste (list): _description_
        elem_to_extract (int): _description_

    Returns:
        _type_: _description_
    """
    if elem_to_extract > len(liste)-1:
        elem_to_extract = int(input("Entrez un nombre d'éléments à extraire correct : "))
    ls = []
    cp_liste = deepcopy(liste)
    for i in range(elem_to_extract):
        rd = r.randint(0,len(cp_liste)-1)
        ls.append(cp_liste[rd])
        cp_liste.remove(cp_liste[rd])
        print(cp_liste,ls)
    return ls

print(extract_element_list(L,15))
