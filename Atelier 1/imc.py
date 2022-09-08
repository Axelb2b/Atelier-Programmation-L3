#on regarde ou se situe l'IMC reçue en paramètre
def message_imc(imc : float) -> str:
    """_summary_ : Regarde selon un IMC ou il se situe selon sa valeur

    Args:
        imc (float): Un IMC positif (vérification)

    Returns:
        str: une chaîne de caractère avec un message selon l'IMC
    """
    while imc < 0:
        imc = float(input("Entrez un IMC positif"))
    
    if imc < 16.5:
        mess = "Dénutrition ou famine"
        return mess
    elif 16.5 < imc <= 18.5:
        mess = "maigreur"
        return mess
    elif 18.5 < imc <= 25:
        mess = "Corpulence normale"
        return mess
    elif 25 < imc <= 30:
        mess = "Surpoids"
        return mess
    elif 30 < imc <= 35:
        mess = "obésité modérée"
        return mess
    elif 35 < imc <= 40:
        mess = "obésité sévère"
        return mess
    else:
        mess = "Obésité morbide"
        return mess

#fct test (j'ai pas fait la Docstring pour ça désolé)
def imc(itération : int):
    i = 0
    while i < itération:
        imc = float(input("Entrez un IMC "))
        print(message_imc(imc))

imc(10)

    




