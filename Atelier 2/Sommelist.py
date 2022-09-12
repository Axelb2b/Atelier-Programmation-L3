
from operator import index


L = [10,12,14,14000,14000,20]
M = []


def somme_for(L : list) -> int:
    """Somme d'élements d'une liste avec un structure for

    Args:
        L (list): liste d'entiers (à vérifier)

    Returns:
        int: La somme
    """
    somme = 0
    for i in range(len(L)):
        somme += L[i]
    return somme

def somme_while(L : list) -> int:
    """Somme avec une boucle while

    Args:
        L (list): liste d'entiers

    Returns:
        int: La somme
    """
    somme = 0
    i = 0
    while i < len(L):
        somme += L[i]
        i+=1
    return somme 

def somme_elem(L : list) -> int:
    """Sommme avec for sur les elements

    Args:
        L (list): Liste d'entiers

    Returns:
        int: La somme
    """
    somme = 0
    for e in L:
        somme += e
    return somme

def moyenne(L : list) -> float:
    """Calcul de moyenne

    Args:
        L (list): Liste d'entiers

    Returns:
        float: La moyenne
    """
    if L == []:
        return 0
    else:
        somme = somme_elem(L)
        moyenne = somme/len(L)
        return moyenne

def nb_sup_for_indice(L : list,e : int) -> int:
    """Renvoie le nombre d'élements > e

    Args:
        L (list): Une liste d'entiers
        e (int): l'entier à comparer aux éléments de la liste

    Returns:
        int: le nombre d'éléments > e
    """
    compteur = 0
    for i in range(len(L)):
        if L[i] > e:
            compteur += 1
    return compteur

def list_sup_for_elem(L : list,e : int) -> list:
    """Je me suis permis de récupérer cet fonction pour directment faire une liste des éléments sup au lieu de juste renvoyer leur nombre

    Args:
        L (list): Liste d'entiers
        e (int): Entier à comparer aux autres

    Returns:
        int: Le nombre d'éléments > e
    """
    liste_val = []
    for f in L:
        if f > e:
            liste_val.append(f)
    return liste_val

def moyenne_sup(L : list, e : int) -> float:
    """Retourne la moyenne des éléments supérieurs à e

    Args:
        L (list): Liste d'entier
        e (int): valeur entière

    Returns:
        float: Moyenne des éléments > e
    """
    liste_sup = list_sup_for_elem(L,e)
    return moyenne(liste_sup)

def val_max(L :list) -> int:
    """Trouve la valeur max d'une liste

    Args:
        L (list): liste d'entiers

    Returns:
        int: valeur max
    """
    if L == []:
        return 0
    else:
        val_max = float('-inf')
        for i in range(len(L)):
            if L[i] > val_max:
                val_max = L[i]
        return val_max


def ind_max(L) -> int:
    """Donne l'indice du plus grand entier d'une liste (première apparition)

    Args:
        L (_type_): liste d'entiers

    Returns:
        int: indice
    """
    val_maxi = val_max(L)
    for i in range(len(L)):
        if L[i] == val_maxi:
            return i



