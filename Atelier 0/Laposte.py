
#Listes contenant les destinations et les types de courrier
L = ["verte", "prioritaire" , "eco-pli"]
ST = ["France","Monaco","Andorre"]
OM1 = ["Guyane","Guadeloupe","Martinique","La Reunion","St Pierre et Miquelon","St Barthelemy","St Martin","Mayotte"]
OM2 = ["Nouvelle Caledonie","Polynesie Francaise","Wallis et Futuna"]






def main():
    """Va demander poids destination et type et va se servir des fonctions pour calculer le prix de l'envoi
    """
    #Demande les trois infos
    poids = float(input("Entrez le poids de votre courier (en g) : "))
    type = input("quelle est votre type de lettre ? (verte , prioritaire ou eco-pli) : ")
    destination = input("Vers ou se dirige le courrier ? : ")
    #vérifiaction de validité
    while type not in L:
        type = input("entrez un type correct (verte , prioritaire ou eco-pli) : ")
    prix = calcul_aff_lettre(poids,type,destination)
    #vérification
    while destination not in (ST and OM1 and OM2):
        destination = input("Cette destination n'est pas prise en compte par les services postaux. Entrez une destination valide")
    calcul_aff_lettre(poids,type,destination)

def calcul_aff_lettre(poids : int,type : str,destination : str):
    match type:
        case "verte":
            prix = calcul_verte(destination,poids)
        case "prioritaire":
            prix = calcul_prioritaire(destination,poids)
        case "eco-pli":
            prix = calcul_ecopli(destination,poids)
    print("L'envoi de votre courrier coutera la modique somme de ",prix," €")

def calcul_verte(destination : str,poids : float) -> float:
    if destination in OM1:
        comp = 0.05
    elif destination in OM2:
        comp = 0.11
    else :
        comp = 0

    match poids:
        case 20:
            prix = 1.16 + (poids//10)*comp
        


    
    
    



