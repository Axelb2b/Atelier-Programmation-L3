import time
import matplotlib.pyplot as plt
import numpy as np


import random as r
from Ex2 import mix_list


L = [1,2,3,4,5,6,7,8,9,10]


n = 10000000

start_pc = time.perf_counter()
for i in range(n):
    None
end_pc = time.perf_counter()
elapsed_time_pc = end_pc-start_pc





def perf_mix(fonction_1 : callable,fonction_2 : callable,liste_int : list,nb : int = 10) -> tuple:
    """Prends deux fonctions et fait un graphe avec leur temps d'éxecution en moyenne selon le nombre de fois que l'on execute

    Args:
        fonction_1 (callable): Fonction
        fonction_2 (callable): Fonction
        liste_int (list): liste du nombre d'éléments de la liste
        nb (int, optional): nombre de fois on l'on va répéter la focntion. Defaults to 10.

    Returns:
        tuple: tuple de dico contenant les moyennes des temps d'éxecution selon le nopbre d'éléments dan sla liste
    """

    
    moy_temps_1 = {}
    for e in liste_int:
        L = []
        for i in range(e):
            L.append(i)
        temps_passage = []
        start_pc = time.perf_counter()
        for i in range(nb):
            fonction_1(L)
            end_pc = time.perf_counter()
            temps_passage.append(end_pc-start_pc)
            
        somme = sum(temps_passage)
        moy = somme / 10
        moy_temps_1[e] = moy

    moy_temps_2 = {}   
    for e in liste_int:
        L = []
        for i in range(e):
            L.append(i)
        temps_passage = []
        start_pc = time.perf_counter()
        for i in range(nb):
            fonction_2(L)
            end_pc = time.perf_counter()
            temps_passage.append(end_pc-start_pc)
            


        somme = sum(temps_passage)
        moy = somme / 10
        moy_temps_2[e] = moy



    myList = moy_temps_1.items()
    myList_shuffle = moy_temps_2.items()
    x, y = zip(*myList) 
    x1,y1 =zip(*myList_shuffle)
    
    plt.plot(x, y)
    plt.plot(x1,y1)
    plt.show()

    return (moy_temps_1,moy_temps_2)




    

