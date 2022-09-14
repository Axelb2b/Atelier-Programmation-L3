


def full_name(nom_prenom : str) -> str:
    """Renvoie le nom en majuscules et le prénom avec la première lettre en majuscule

    Args:
        nom_prenom (str): Nom puis Prénom

    Returns:
        str: NOM Prénom
    """
    TAB = nom_prenom.split(" ")
    nom = TAB[0].upper()
    prenom = TAB[1].capitalize()
    return nom+" "+prenom

def is_mail(mail : str) -> tuple:
    """Verifie à travers plusierus conditions si un mail  est valide 

    Args:
        mail (str): un mail

    Returns:
        tuple: couple d'indices selon l'erreur (si il y en a une)
    """
    tup = (0,0)
    #on sépare ce qu'ily a avant et après le @ 
    TAB_MAIL = mail.split("@")
    print(TAB_MAIL[0])
    #Si il n'y a pas de @ , retorune un tuple erreur
    if len(TAB_MAIL) < 2:
        return (0,2)
    #Si le corps est vide ou si il y a un . au début ou à la fin ou ".."  ou si il y a un caractère non autorisé retourne un tuple erreur 
    if TAB_MAIL[0] != "" and (TAB_MAIL[0][0] and TAB_MAIL[0][-1]) != "." and ".." not in TAB_MAIL[0] and ("/" not in TAB_MAIL[0] and "_" not in TAB_MAIL[0]):
        #rel   atif au domaine 
        TAB_DOM = TAB_MAIL[1].split(".")
        #Si il y a exactement 1 point et qu'il n'est pas à la fin et qu'il n'y a pas de caractères non-autorisés retourne un tuble correct
        if len(TAB_DOM) == 2 and TAB_DOM[1] != "" and("/" not in TAB_DOM[1] and "_" not in TAB_DOM[1]):
            tup = (1,0)
        else:
            #si il n'y a pas de point retourne un tuple erreur
            if len(TAB_DOM) == 1:
                tup = (0,4)
            else:
                #retourne le dernier tuple erreur de domaine
                tup = (0,3)

    else:
        tup = (0,1)
    return tup






print(is_mail("brunelaxel@univ-corse.fr"))
print(is_mail("brune./\%axel@gmail.com"))
print(is_mail("brunelaxel.com"))
print(is_mail("brunelaxel@Gmailcom"))
print(is_mail("brunelaxel@gmail.co/m"))
print(is_mail("g.@fht.fr"))
