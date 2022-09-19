from copy import deepcopy
import random as r
import matplotlib as plt

L = [2,5,3,7,8,10,1,4,9,6]
T = [170, 45, 75, 90, 2, 24, 802, 66]
I = [2, 20, 61, 997, 1, 619]

def tri_neuneu(L : list) -> list:
    """Fonction qui melange une liste jusqu'à ce qu'elle soit triée (super super long en vrai)

    Args:
        L (list): Liste mélangée

    Returns:
        list: liste triée (Si Dieu le veut)
    """
    essai = 0
    while L != sorted(L):
        r.shuffle(L)
        essai += 1
    return L,essai


def tri_insertion(L : list):
    """Tri insertion ()

    Args:
        L (list): Liste à trier

    Returns:
        _type_: Liste triée
    """
    M = deepcopy(L)
    for i in range(1, len(L)): 
        x = M[i] 
        j = i-1
        while j >= 0 and x < M[j] : 
                M[j + 1] = M[j] 
                j -= 1
        M[j + 1] = x
        
    return M

def tri_selection(tableau : list,n : int)->list:
    liste = tableau.copy()
    for i in range(n-1):
        min = i
        for j in range (i+1,n):
            if liste[j]<liste[min]:
                min = j
        if min != i:
            liste[i],liste[min] = liste[min],liste[i]
    return liste





def triabul(L : list) -> list:
    """tri à bulle

    Args:
        L (list): Liste à trier

    Returns:
        list: Liste triée
    """
    for i in reversed(range(0,len(L)-1)):
        tableau_trie = True
        for j in range(0,len(L)-1):
            if L[j+1] < L[j]:
                L[j],L[j+1] = L[j+1],L[j]
                tableau_trie = False
        if tableau_trie:
            return L


def fusion(A : list, B : list)->list:
    '''
    récupère deux tableaux triés et renvoie un tableau qui contient A et B triés

    Parameters
    ----------
    A : list
        tableau trié.
    B : list
        tableau trié.

    Returns
    -------
    list
        tableau trié de A + B.

    '''
    liste = []

    #Cas A ou B vide
    if A == []: return B
    elif B== []: return A

    elif A[0] <= B[0]: 
        return [A[0]] + fusion(A[1:],B)
    else : 
        return [B[0]] + fusion(A,B[1:])


def tri_fusion(L):
    """coupe la liste en 2

    Args:
        L (_type_): Liste a couper

    Returns:
        _type_: 2 listes
    """
    taille = len(L)
    if taille <= 1:
        return L
    else:
        return fusion(tri_fusion(L[:taille//2]),tri_fusion(L[taille//2:]))









def counting_radix(L : list,ordre : int) -> list:
    """fonction utile au radix final qui va faire le tri à l'ordre "ordre"

    Args:
        L (list): Liste à trier
        ordre (int): selon cet ordre

    Returns:
        list: liste triée par rapport à l'odre
    """
    tab_compteur = [0] * 10 #tableau qui represente la position 

    for i in range(len(L)): 
        place_element = (L[i] // ordre) % 10
        tab_compteur[place_element] += 1
    for i in range(1, 10):
        tab_compteur[i] += tab_compteur[i-1]

    # Reconstructing the output array
    outputArray = [0] * len(L)
    i = len(L) - 1
    while i >= 0:
        place_element = (L[i] // ordre) % 10
        tab_compteur[place_element] -= 1
        newPosition = tab_compteur[place_element]
        outputArray[newPosition] = L[i]
        i -= 1
        
    return outputArray


def radix(L : list) -> list:
    """radix finale

    Args:
        L (list): Liste à trier

    Returns:
        list: liste triée
    """
    M = deepcopy(L)
    max_len = len(str(max(M)))
    ordre = 1
    while max_len > 0:
        M = counting_radix(M,ordre)
        ordre *= 10
        max_len -= 1
        print(M)
    return M







                


