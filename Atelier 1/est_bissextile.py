def est_bissextile(annee : int) -> bool:
    """Vérifie si une année est bissextile 

    Args:
        annee (int): une année (#rajouter une verification sur le type de variable reçue en paramètre)

    Returns:
        bool: Un Booléen (True si bissextile , False sinon)
    """
    if (annee%4 == 0 and annee%100 != 0) or (annee%400 == 0) :
        return True
    else:
        return False


def bissextile() -> str:
    """Fonction qui se sert de est_bissextile pour formet des messages selon son résultat

    Returns:
        str: Un message qui informe si l'année est bissextile (ou pas)
    """
    annee = int(input("Entrez une année pour savoir si elle est bissextile ! : ") )
    if est_bissextile(annee) == True:
        return "{annee} est une année bissextile !".format(annee = annee)
    else:
        return "{annee} n'est pas une année bissextile...".format(annee = annee)


bissextile()