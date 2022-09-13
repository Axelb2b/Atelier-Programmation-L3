MOT = ["pédiluve","australopithèque","peripeptide","salvateur","mastication","oui","non","ok","bref","intraveineuse"]




def mot_nlettre(lst : list,n : int) -> list:
    lst_n = []
    for e in lst:
        if len(e) == n:
            lst_n.append(e)
    return lst_n



def commence_par(mot : str, pre : str) -> bool:
    """retourne un booleen si le prefixe en paramètre est dans le mot

    Args:
        mot (str): mot
        pre (str): préfixe

    Returns:
        bool: prefixe du mot ou pas 
    """
    pre_mot = ""
    for i in range(len(pre)):
        pre_mot += mot[i]
    if pre_mot == pre:
        return True
    else:
        return False

def finit_par(mot : str,suff : str) ->bool:
    """retourne un booleen si le suffixe du mot etst le même que celui passé en paramètre

    Args:
        mot (str): mot
        suff (str): suffixe

    Returns:
        bool: si le préfixe est dedans ou pas
    """
    suff_mot = ""
    for i in reversed(range(len(suff))):
        suff_mot += mot[-1-i]
    if suff_mot == suff:
        return True
    else:
        return False


def finissent_par(lst_MOT : list, suff : str) -> list:
    """utilise finit_par() pour trouver les mots d'une liste qui finissent par un suffixe passé en paramètre

    Args:
        lst_MOT (list): liste de mot
        suff (str): suffixe recherché

    Returns:
        list: liste contenant les mots avec le suffixe passé en paramètre
    """
    MOT = []
    for e in lst_MOT:
        if finit_par(e,suff):
            MOT.append(e)
    return MOT

def commencent_par(lst_mot : list, pre : str) -> list:
    """idem que finissent_par() pour lespréfixes

    Args:
        lst_mot (list): liste de mot
        pre (str): préfixe

    Returns:
        list: liste de mots contenant le préfixe passé en paramètre
    """
    MOT = []
    for e in lst_mot:
        if commence_par(e,pre):
            MOT.append(e)
    return MOT



def liste_mot(lst_mot : list,pre : str,suff : str,n : int):
    """combine tout pour vérifier si dans une liste de mot quels mots finissent par un prefixe ET un suffixe donnés et qui fait n lettres de long

    Args:
        lst_mot (list): liste de mots
        pre (str): préfixe
        suff (str): suffixe
        n (int): longueur du mot

    Returns:
        _type_: liste de mos remplissant les conditions
    """
    lst_n = mot_nlettre(lst_mot,n)
    lst_pre = commencent_par(lst_n,pre)
    lst_tout = finissent_par(lst_pre,suff)
    return lst_tout


def dictionnaire(fichier):
    """ouvre un fichier passé en paramètre et le lit ligne à ligne

    Args:
        fichier (_type_): un fichier texte
    """
    f = open(fichier)
    c = f.readline()
    print("**LISTE DE MOTS**")
    while c != "":
        print(c)
        c = f.readline()
    print("**FINI**")

dictionnaire("littre.txt")


