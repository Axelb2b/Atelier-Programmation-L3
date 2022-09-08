from datetime import date

#fonction qui vérifie si une date entrée est valide grâce a la fonction date 
def date_est_valide(jour : int,mois : int, annee : int) -> bool:
    """Vérifie si une date est valide grace a la fonction date() importé de 'date'
        (une date est forcément valide si cette fonction fonctionne avec ces infos)

    Args:
        jour (int): Les jours
        mois (int): le mois
        annee (int): l'année  

    Returns:
        bool: Booléen qui prend une valeur selon si la date est valide ou pas
    """
    try:
        date(int(annee),int(mois),int(jour)) 
        return True
    except (ValueError or TypeError or NameError):
        return False
#se sert de la fonctionn de vérification pour faire entrer une date valide à l'utilisateur     
def saisie_date_naissance() -> date:
    """Demande la saisie d'une date de naissance valide (verification)

    Returns:
        date: une date au format jj-mm-aaaa
    """
    jour = input("Entrez votre jour de naissance (JJ) : ")
    mois = input("Entrez votre mois de naissance (MM) : ")
    annee = input("Entrez votre annee de naissance (AAAA) : ")
    while date_est_valide(jour,mois,annee) != True:
        print("Erreur dans la saisie de votre date de naissance.")
        jour = input("Entrez votre jour de naissance (JJ) : ")
        mois = input("Entrez votre mois de naissance (MM) : ")
        annee = input("Entrez votre annee de naissance (AAAA) : ")
    return date(int(annee),int(mois),int(jour))

#regarde l'âge en jours à la date actuelle
def age(date_naissance : date) -> int:
    """donne l'âge selon une date

    Args:
        date_naissance (date): une date de naissance

    Returns:
        int: l'âge selon la date
    """
    today = date.today()
    delta = today - date_naissance
    return delta.days//365

#verifie    
def est_majeur(age : int) -> bool:
    """Vérifie selon un age si la personne est majeure 

    Args:
        age (int): un age

    Returns:
        bool: Vrai ou Faux selon si age >= 18
    """
    if age >= 18 :
        return True
    else:
        return False

def test_acces() -> str:
    """Se sert de toutes les autres fonctions pour voir si quelqu'un est majeur 

    Returns:
        str: un message selon si la personne est majeure ou pas 
    """
    date_naissance = saisie_date_naissance()
    age_utilisateur = age(date_naissance)
    if est_majeur(age_utilisateur):
        return "Bonjour, vous avez {} ans.\nAccès autorisé.".format(age_utilisateur)
    else:
        return "Désolé , vous avez {} ans , \n Accès refusé.".format(age_utilisateur)

print(test_acces())

