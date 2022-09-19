import random as r
L = [1,2,3,4,5,6,7,8,9,10]

def choose_element_list(liste : list):
    """Renvoie un élément aléatoire d'une liste 

    Args:
        liste (list): liste d'objets

    Returns:
        objet dans la liste: Un des éléments de la liste
    """
    rd = r.randint(0,len(liste)-1)
    return liste[rd]

print(choose_element_list(L))
