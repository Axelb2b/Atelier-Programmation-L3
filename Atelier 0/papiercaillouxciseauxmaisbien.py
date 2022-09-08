import random

#Liste des valeurs accepteés par le jeu
L = ["pierre","papier","ciseaux","puit"]
#score J1
s1 = 0
#score J2
s2 = 0
#Compteur du nombre de parties
np = 0


cpo = input("Voulez-vous jouer contre l'ordinateur (Max 5 parties) O/N ? " )

while cpo != "O" and cpo != "N":
        print("Je n'ai pas compris votre réponse")
        cpo = input("Entrez O ou N pour continuer : ")

#Si on joue contre l'ordi , on demande le nom du joueru et le "2e" joueur incarné par l'ordi prends comme nom Machine
if cpo == 'O':
    n1 = input("Quel est votre nom ? ")
    print("Bienvenu ",n1, " nous allons jouer ensemble \n")
    n2 = 'Machine'
#Ici on demande le nom des 2 joueurs
if cpo == 'N':
    n1 = input("Quel est votre nom ? ")
    print("Bienvenu ",n1, " nous allons jouer ensemble")
    n2 = input("Quel est le nom du deuxième joueur ?")
    print("Bienvenu ",n2, " nous allons jouer ensemble \n")

#Variable qui est la comme condition  de sortie pour la boucle de jeu
c = True


#Début du jeu
while c == True:
    np += 1 
    c1 = input("{nom} faîtes votre choix parmi (pierre, papier, ciseaux,puit): ".format(nom=n1))
    while c1 not in L:
        print("Je n'ai pas compris votre réponse")
        c1 = input("{nom} faîtes votre choix parmi (pierre, papier, ciseaux,puit): ".format(nom=n1))

    if cpo == 'O':
        c2 = L[random.randint(0, 3)]


    if n2 != 'Machine':
        print("Joueur", n2)
        c2 = input("{nom} faîtes votre choix parmi (pierre, papier, ciseaux,puit): ".format(nom=n2))
        while c2 not in L:
            print("Je n'ai pas compris votre réponse")
            c2 = input("{nom} faîtes votre choix parmi (pierre, papier, ciseaux,puit): ".format(nom=n2))

    #On affiche les choix de chacun
    print("Si on récapitule :",n1, c1, "et", n2, c2,"\n")


    #On regarde qui a gagné cette manche selon les cas on calcule les points et on affiche le résultat
    if c1 == c2 :
        draw = "aucun de vous, vous être ex æquo"
        print("le gagnant est",draw)
        print("Les scores à l'issue de cette manche sont donc",n1, s1, "et", n2, s2, "\n")

    elif c1 == 'pierre' and c2 == 'papier' or c2 == 'puit' :
        s2 = s2 + 1
        print("le gagnant est",n2)
        print("Les scores à l'issue de cette manche sont donc",n1, s1, "et", n2, s2, "\n")

    elif c1 == 'pierre' and c2 == 'ciseaux' :
        s1 = s1 + 1
        print("le gagnant est",n1)
        print("Les scores à l'issue de cette manche sont donc",n1, s1, "et", n2, s2, "\n")

    elif c1 == 'papier' and c2 == 'ciseaux' :
        s2 = s2 + 1
        print("le gagnant est",n2)
        print("Les scores à l'issue de cette manche sont donc",n1, s1, "et", s2, s2, "\n")

    elif c1 == 'papier' and c2 == 'pierre' or c2 == 'puit' :
        s1 = s1 + 1
        print("le gagnant est",n1)
        print("Les scores à l'issue de cette manche sont donc",n1, s1, "et", n2, s2, "\n")

    elif c1 == 'ciseaux' and c2 == 'pierre' or c2 == 'puit' :
        s2 = s2 + 1
        print("le gagnant est",n2)
        print("Les scores à l'issue de cette manche sont donc",n1, s1, "et", n2, s2, "\n")

    elif c1 == 'ciseaux' and c2 == 'papier' :
        s1 = s1 + 1
        print("le gagnant est",n1)
        print("Les scores à l'issue de cette manche sont donc",n1, s1, "et", n2, s2, "\n")

    elif c1 == 'puit' and c2 == 'papier':
        s2 = s2 + 1
        print("le gagnant est",n2)
        print("Les scores à l'issue de cette manche sont donc",n1, s1, "et", n2, s2, "\n")
    
    elif c1 == 'puit' and c2 != 'papier':
        s1 = s1 + 1
        print("le gagnant est",n1)
        print("Les scores à l'issue de cette manche sont donc",n1, s1, "et", n2, s2, "\n")

    if np > 4:
        c = False
    else :
        go = input("Souhaitez vous refaire une partie {} contre {} ? (O/N) ".format(n1,n2))
        if go == 'O':
            c = True
        elif go == 'N':
            c = False
        else:
            while go != 'O' or go != 'N':
                go = input("Souhaitez vous refaire une partie {} contre {} ? (O/N) ".format(n1,n2))

                
        
    
if c == False :
    print("Merci d'avoir joué ! A bientôt")