M = [1,2,2,3,4,5,5]
L = [1,3,4,0,0,2,5,5]


#FOnction de l'exercice d'avant qui va bien servir
def histo(F : list) -> list:
    """Renvoie le nombre d'occurence de chaque entier dans F

    Args:
        F (list): Liste d'entiers

    Returns:
        list: Une liste de longeur max[F]+1 avec pour chaque elements le nombre d'occurence de l'indice de cet element dans F 
        ex : H = [1,0,2] -> Max[F] = 2 , il y a un 0 , aucun 1 et deux 2 dans F.
        """
    H = [0]*len(max(F)+1)

    for i in range(len(F)):
        a = F[i]
        H[a] += 1
    return H



def agencement(nb_emplacement : int,l_objet : list) -> tuple:
    """Avec une liste et un nombre d'objet on revoie un tuple de listes avec des valeurs différentes dans chaque

    Args:
        nb_emplacement (int): nb d'objet possible dans une liste
        l_objet (list): liste d'objet

    Returns:
        tuple: tuple solution
    """
    


    L1 = []
    L2 = []
    tri = []
    for i in range(len(hist)):
        if hist[i] == 2:
            tri.insert(0,i)
            tri.insert(0,i)
    for i in range(len(l_objet)):
        if l_objet[i] not in tri:
            tri.append(l_objet[i])


    for e in tri:
        if e not in L1 and len(L1) < 4:
            L1.append(e)
        else:
            L2.append(e)
            
        
    return (L1,L2)

print(agencement(4,L))
