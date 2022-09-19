from copy import deepcopy
from Ex5 import perf_mix

L = [2,5,3,4,1,9,6,10,7,8]





def sort_moi(liste : list) -> list:
    """trie une liste de nombres

    Args:
        liste (list): liste à trier

    Returns:
        list: une liste triée
    """
    r=[]
    l = deepcopy(liste)
    while l:
        mini=min(l)
        l.remove(mini)
        r.append(mini)
    return r

print(sort_moi(L),L)
print(perf_mix(sort_moi,sorted,[10, 500, 5000,10000]))



