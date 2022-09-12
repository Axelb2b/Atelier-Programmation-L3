import matplotlib.pyplot as plt
import random as rd
S = [0,1,2,3,4,5,6,7,8,9,10]
R = []
for i in range(5):
    R.append(rd.randint(0,10))
R.append(0)



# QUestion 1

def histo(F : list) -> list:
    """Renvoie le nombre d'occurence de chaque entier dans F

    Args:
        F (list): Liste d'entiers

    Returns:
        list: Une liste de longeur max[F]+1 avec pour chaque elements le nombre d'occurence de l'indice de cet element dans F 
        ex : H = [1,0,2] -> Max[F] = 2 , il y a un 0 , aucun 1 et deux 2 dans F.
        """
    H = []
    for i in range(max(F)+1):
        H.append(0)
    for i in range(len(F)):
        a = F[i]
        H[a] += 1
    return H

def est_injective(F : list) -> bool:
    """se sert de histo() pour dire si une fonction faite avec une liste est injective ou pas 

    Args:
        F (list): Liste correspondant a une fontion

    Returns:
        bool: Vrai si injectif , faux sinon
    """
    H = histo(F)
    for i in range(len(H)):
        if H[i] > 1:
            return False
    return True

def est_surjective(F : list) -> bool:
    """se sert de histo() pour dire si une fonction est bijective

    Args:
        F (list): Liste correspondant a une fonction

    Returns:
        bool: Vrai si surjectif Faux sinon
    """
    H = histo(F)
    for i in range(len(H)):
        if H[i] == 0:
            return False
    return True

def est_bijective(F : list) -> bool:
    """se sert de la surjéctivité et de l'injectivité pour dire si la fonction est bijective

    Args:
        F (list): liste representative de la fonction

    Returns:
        bool: Vrai si bijective , Faux sinon
    """
    if est_injective(F) and est_surjective(F) == True:
        return True
    else:
        return False
        
# Question 2

#faire le schéma à la main...

#Question 3

def histogramme(L : list) :
    """Retourne avec la libraire matplotlib un histogramme bien propre

    Args:
        L (list): Liste avec l'histogramme de base 
    """
    plt.hist(L, range = (0, max(L)), bins = 5, color = 'yellow',edgecolor = 'red')
    plt.xlabel('valeurs')
    plt.ylabel('nombres')
    plt.title('Exemple d\' histogramme simple')
    plt.show()
    

