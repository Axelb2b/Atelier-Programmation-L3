import math


def discriminant(a : float,b : float, c : float) -> float:
    """Calcul du  discriminant d'un trinôme du 2nd degré

    Args:
        a (float): coefficient devant x^2
        b (float): coefficient devant x
        c (float): réel

    Returns:
        float: discriminant du trinôme
    """
    discriminant = b**2 - (4*a*c)
    return discriminant

#calcul racine double (delta = 0)

def racine_unique(a : float, b : float) -> float:
    """Calcul de racine double (si delta = 0)

    Args:
        a (float): coefficient devant x^2
        b (float): coefficient devant x

    Returns:
        float: la solution double du trinôme associé
    """
    racine = -b / (2*a)
    return racine 


def racine_double(a : float, b : float,delta : float,num : int) -> float:
    """Calcul de l'une des racines d'un trinôme du second degré (delta > 0)

    Args:
        a (float): coefficient devant x^2
        b (float): coefficient devant x
        delta (float): réel
        num (int): Soit 1 soit 2 (vérification) selon que l'on veuille la première ou la 2nd racine

    Returns:
        float: Une solution réel de l'équation
    """
    while num != 1 and num != 2:
        num = int(input("Entrez 1 ou 2"))

    if num == 1:
        racine = (-b + math.sqrt(delta))/(2*a)
        return racine
    else :
        racine = (-b - math.sqrt(delta))/(2*a)
        return racine

#Mise en str de l'équation !!! trouver un moyen d'optimisier (prise en compte du 0 , 1 et adaptation du signe)
def str_equation(a : float, b : float, c: float) -> str:
    """Fait une chaîne de caractère avec un trinôme

    Args:
        a (float): coefficient devant x^2
        b (float): coefficient devant x
        c (float): réel

    Returns:
        str: une chaîne qui montre le trinôme 'bien présenté'
    """
    return "{a}X^2 + ({b}X) + ({c}) = 0".format(a = a,b = b, c= c)

#fonction qui va mettre bout à bour le autres     
def solution_equation(a : float, b: float, c :float) -> str:
    """Programme qui selon les coefficient renvoie une chaîne avec le trinome et possiblement sa ou ses solutions

    Args:
        a (float): coefficient devant x^2
        b (float): coefficient devant x
        c (float): coefficient réel

    Returns:
        str: une chaîne avec les informations du trinôme (affichage delta racine(s)(si existante(s)))
    """
    rep = "Solution de l'équation {equation} \n".format(equation = str_equation(a,b,c))
    delta = discriminant(a,b,c)
    if delta < 0:
        return rep+"Pas de solutions dans R à l'équation"
    elif delta == 0:
        x = racine_unique(a,b)
        return rep+"Racine unique : {x}".format(x = x)
    elif delta > 0:
        x1 = racine_double(a,b,delta,1)
        x2 = racine_double(a,b,delta,2)
        return rep+"Deux racines : \n x1 = {x1} , x2 = {x2}".format(x1 = x1,x2 = x2)

#fonction de test avec toutes les fonctions
def equation():
    """procédure qui demande les coeff et se sert des autres fonctions
    """
    a = float(input("Entrez votre premier coeff (=/= 0): "))
    if a == 0:
        a = float(input("J'ai dis =/= 0 ! : "))
    b = float(input("Le second : "))
    c = float(input("Et enfin le dernier : "))
    print("delta = {delta}".format(delta = discriminant(a,b,c)))
    print(solution_equation(a,b,c))

equation()

    
    

