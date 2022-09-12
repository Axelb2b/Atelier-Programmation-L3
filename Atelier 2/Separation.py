import random as rd

R = []
for i in range(10):
    R.append(rd.randint(-100,100))
R.append(0)
print(R)
def separation(L : list) -> list:
    """Sépare les nombre par rapport a leur signe

    Args:
        L (list): list non triée dans ZZ

    Returns:
        list: liste triée par signe
    """
    LSEP = []
    for i in range(len(R)):
        #met les négatifs à gauche
        if L[i] < 0:
            LSEP.insert(0,L[i])
        #met les positifs à droite
        elif L[i] > 0:
            LSEP.append(L[i])
        #met les 0 entre le dernier négatif et le prmeir positif(comme les nombres s'joutent aux extremes le 0 reste en place)
        else:
            for j in range(len(LSEP)):
                if LSEP[j-1] < 0 and LSEP[j] >= 0:
                    LSEP.insert(j,L[i])
        print(LSEP)
    return LSEP

print(separation(R))
