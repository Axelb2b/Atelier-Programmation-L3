import random as rd
from re import A

L = [1, 3, 7, 10, 20, 33, 34, 42, 54, 72]
R = []
for i in range(10):
    R.append(rd.randint(0,10000))
    R.sort()
print(R)
M = []



def position_for(L : list,e : int) -> int:
    """Retourne la position de e dans la liste L

    Args:
        L (list): une liste d'entiers
        e (int): un entier

    Returns:
        int: l'indice de e dans L
    """
    for i in range(len(L)):
        if L[i] == e:
            return i
    return -1


def position_while(L : list,e : int) -> int:
    """Retorune la position de e dans la liste

    Args:
        L (list): Une liste d'entiers
        e (int): L'entier dont l'on souhaite savoir la position

    Returns:
        int: La position de e dans L
    """

    compteur = 0
    while compteur < len(L):
        if L[compteur] == e:
            return compteur
    return -1


def nb_occurence(L : list,e : int) -> int:
    """Retourne le nombre d'occurence d'un entier dans une liste

    Args:
        L (list): Liste
        e (int): Nombre dont on cherche le nombre d'occurences dans L

    Returns:
        int: Nombre d'occurence(s) de e dans L
    """
    compteur = 0
    for elem in L:
        if elem == e:
            compteur += 1
    return compteur

def est_triee_for(L : list) -> bool:
    """Vérifie si une liste est triée

    Args:
        L (list): Une liste

    Returns:
        bool: Vrai ou Faux selon si la liste est triée ou pas
    """
    for i in range (len(L)-1):
        if L[i+1] < L[i]:
            return False
    return True

def est_triee_while(L : list) -> bool:
    """Même principe que celle du dessus

    Args:
        L (list): _description_

    Returns:
        bool: _description_
    """
    compteur = 0
    while compteur < len(L)-1:
        if L[compteur+1] < L[compteur]:
            return False
        compteur += 1
    return True

def position_tri(L : list, e : int) -> int:
    """FOnction qui utilise la dichotomie pour trouver la position d'un élément e dans 
       Pour cela il faut que la liste entrée en paramètre soit déjà triée

    Args:
        L (list): Liste d'entier Triées
        e (int): entier  dont on cherche la position dans la liste
    """
    debut = 0
    fin = len(L)
    milieu = (debut +fin)//2
    while debut < fin:
        if L[milieu] == e:
            return milieu
        elif L[milieu] > e:
            fin = milieu -1
        else:
            debut = milieu + 1
        milieu = (debut+fin)//2
    return -1  



def repetition(L : list) -> bool:
    """Vérifie les doublons d'une liste

    Args:
        L (list): une liste

    Returns:
        bool: Vrai si triée Faux sinon
    """
    T = []
    for i in range (len(L)):
        if L[i] not in T:
            T.append(L[i])
        else:
            return False
    return True

