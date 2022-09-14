
import random as rd
C5 = "|---] "
C4 = "| O "
C3 = "| T "
C2 = "|/ / "
C1 = "|______"
PENDU = [C1,C2,C3,C4,C5]


def place_lettre(lettre : str, mot : str) -> list:
    """prend un mot et une lettre et renvoie la ou les position(s) de la lettre dans le mot

    Args:
        lettre (str): lettre recherchée
        mot (str): mot

    Returns:
        list: places de la lettre dans le mot
    """
    PLACES = []
    for i in range(len(mot)):
        if mot[i] == lettre:
            PLACES.append(i)
    return PLACES

#Questuion 2
def outputStr(mot : str,lpos : list) -> str:
    """REnvoie un chaîne de caractère remplie de "_" remplacés par la vrai lettre en position trouvée dans la liste

    Args:
        mot (str): Le mot "caché"
        lpos (list): liste de positions

    Returns:
        str: un chaine de caractère + ou - obstruée
    """
    chaine = ""
    for i in range(len(mot)):
        if i in lpos:
            chaine += mot[i]
        else:
            chaine += "_"
    return chaine


def Game():
    """Boucle de Jeu DU PENDU 
    """
    #Toute les variables dont le jeu à besoin 
    CHOIX = ['facile','moyen','difficile']
    c = False
    dico = build_dict(L)
    LPOS = []
    LISTE_LETTREU = []
    compteur = 5
    #Choix du mode de jeu et du mot en conséquence
    choix = input("Entrez votre mode de jeu (facile,moyen,difficile) : ")
    while choix not in CHOIX:
        choix = input("Entrez un choix valide (facile,moyen,dur) : ")
    if choix == "facile":
        mot = select_word(dico,rd.randint(len(dico[min(dico)][0]),7))
    elif choix == "moyen":
        mot = select_word(dico,rd.randint(7,9))
    else:
        mot = ""
        while mot == "":
            mot = select_word(dico,rd.randint(8,max(dico)))

    #Début de la boucle de jeu
    while c == False:
        #on montre le mot avec les _ et le dessin du pendu 
        print(outputStr(mot,LPOS))
        print("DESSIN PENDU : ")
        for i in range(5-compteur):
            print(PENDU[i])
        #on montre la liste des lettres utilisées et qui ne sont pas bonnes
        if LISTE_LETTREU == []:
            print("____________________")    
        else :
            print("Mauvaises lettres déjà utilisées : ")
            print(LISTE_LETTREU)

        #On demande la lettre
        lettre = input("Entrez une lettre (il vous reste {} chances) : ".format(compteur))
        #on verifie avec une fonction définie précédemment si la lettre est das le mot
        manche = place_lettre(lettre,mot)
        #Si non : le compteur descend et on ajoute lalettre a la liste
        if manche == []:
            compteur -= 1
            print("Il n'y a pas de {} dans le mot".format(lettre))
            LISTE_LETTREU.append(lettre)
        #Si oui : on dis le nombre de fois ou elle y est 
        else:
            print("il y a {len} {lettre} dans le mot !".format(len = len(manche),lettre = lettre))
            #et on ajoute à la liste des positions de lettre (utile a la fonction d'affichage du mot) la ou les positions des lettre
            for i in range(len(manche)):
                LPOS.append(manche[i])
        #Condition de fin : compteur (défaite) .Print() de message de défaite et c = True
        if compteur == 0:
            print("Perdu !")
            print("LE MOT ÊTAIT {} , C'ÊTAIT POURTANT SIMPLE".format(mot))
            c = True
        #Condition de fin : "_" (Vitoire). Print message victoire et c = True
        elif "_" not in outputStr(mot,LPOS):
            print(mot)
            print("GAGNÊ")
            c = True
        
       




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
    

def select_word(dico : dict,longueur : int) -> str:
    """Selectione un mot dans le dico de mot cle  = longueur valeur = liste de mot

    Args:
        dico (dict): dico de mot
        longueur (int): longueur du mot recherchée

    Returns:
        str: un mot
    """
    if longueur not in dico:
        return ("")
    else:
        num_hasard = rd.randint(0,len(dico[longueur])-1)
        return dico[longueur][num_hasard]




Game()

