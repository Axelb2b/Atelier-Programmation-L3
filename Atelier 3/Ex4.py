#Fonction utile de la question 2
def mot_nlettre(lst : list,n : int) -> list:
    """renvoie les mots d'une liste ayant n lettres
    Args:
        lst (list): une liste de mots
        n (int): le nom bre de lettres du mot

    Returns:
        list: une liste de mot de longueur n 
    """
    lst_n = []
    for e in lst:
        if len(e) == n:
            lst_n.append(e)
    return lst_n
#Fonction de la question 3
def build_dict(liste : list) -> dict:
    """Retour un dico longueur : mot

    Args:
        liste (list): liste de mots

    Returns:
        dict: dico longueur mot : mot
    """
    dico = {}

    for i in range(len(max(liste,key=(len)))):
        IT = []
        for e in liste:
            if len(e) == i:
                IT.append(e)
                dico[i] = IT
    return dico

#fonction utile question 3
def build_in(fichier : str) -> list:
    """Construis une liste à partir d'un fichier txt

    Args:
        fichier (str): Fichier .txt

    Returns:
        list: liste des éléments ligne à ligne du fichier
    """
    LISTE_CAPITALES = []
    f = open(fichier)
    c = f.readline()
    while c != "":
        LISTE_CAPITALES.append(c.split("\n")[0].lower())
        c = f.readline()
    f.close
    return LISTE_CAPITALES

L = build_in("capitales.txt")
dico = build_dict(L)
    







def mot_correspondant(mot : str,motif : str) -> bool:
    """fonciton qui regarde dans un mot si il contient les caractères contenu dans motif

    Args:
        mot (str): un mot
        motif (str): un motif 

    Returns:
        bool: Vrai si le motif correspond au mot
        faux sinon
    """
    if len(mot) == len(motif):
        for i in range(len(mot)):
            if motif[i] != "." and mot[i] != motif[i]:
                return False
        return True
    else:
        return False

def presente(lettre : str,mot : str) -> list:
    """Parcours un mot pour voir si une lettre est présente dedans et si oui en quelle position

    Args:
        lettre (str): la lettre recherchée
        mot (str): un mot

    Returns:
        list: liste des positions de lettre dans mot
    """
    L = []
    for i in range(len(mot)):
        if lettre == mot[i]:
            L.append(i)
    return L

def mot_possible(mot : str,lettres : str) -> bool:
    """Pas exactement comme dans la consigne , je 'arrive pas a utiliser la fonction précédente

    Args:
        mot (str): un mot
        lettres (str): une suite de lettre

    Returns:
        _type_: Vrai si on peut faire mot avec lettres , Faux sinon
    """
    comp = ""
    for i in range(len(lettres)):
        if lettres[i] in mot:
            comp += lettres[i]
    if len(comp) >= len(mot):
        for c in mot:
            if c not in comp:
                return False
        else:
            return True
    else:
        return False


def mot_optimaux(dico : dict,lettres : str) -> list:
    """renvoie une liste de mots pouvant être faits avec le plus de lettres dans "lettres" possible

    Args:
        dico (dict): dico de mot 
        lettres (str): suite de lettres

    Returns:
        list: liste des mots optimaux
    """
    MOT_POSSIBLES = []
    for i in reversed(range(len(lettres))):
        if i not in dico:
            pass
        else:
            for j in range(len(dico[i])):
                if mot_possible(dico[i][j],lettres):
                    MOT_POSSIBLES.append(dico[i][j])
        if MOT_POSSIBLES != []:
                    return MOT_POSSIBLES

    return MOT_POSSIBLES


print(mot_optimaux(dico,"ijoaizruotebxjncqofeoio"))








