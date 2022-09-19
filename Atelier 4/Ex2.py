from copy import copy, deepcopy
import random as r
L = [1,2,3,4,5,6,7,8,9,10]

def mix_list(liste : list) -> list:
    """mélange une liste

    Args:
        liste (list): liste a melanger

    Returns:
        list: liste mélangée
    """
    nv_list = []
    cp_liste = deepcopy(liste)
    for i in range(len(cp_liste)):
        rd = r.randint(0,len(cp_liste)-1)
        nv_list.append(cp_liste[rd])
        cp_liste.remove(cp_liste[rd])
    return nv_list

print(mix_list(L))
print(L)
