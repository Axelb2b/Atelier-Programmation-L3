import random as r

def gen_random_list(int_sup : int = 10,int_min : int = 0,n : int=10) -> list:
    """Génère une liste d'entiers compris entre deux bornes

    Args:
        int_sup (int, optional): borne sup. Defaults to 10.
        int_min (int, optional): borne inf. Defaults to 0.
        n (int, optional): taille de la liste. Defaults to 10.

    Returns:
        list: liste d'entiers aléatoires
    """
    L = []
    for i in range(n):
        L.append(r.randint(int_min,int_sup))
    return L

print(gen_random_list(15,5,20))
print(gen_random_list())


