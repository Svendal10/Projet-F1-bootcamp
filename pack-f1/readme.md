Première Etape : Python 


1.
_Si la case est vide, la fonction renvoie None
_Sinon, on sépare les minutes et les secondes avec split(':')
_On multiplie les minutes par 60, on ajoute les secondes, et on arrondit à 3 décimales

2. 
_Pour chaque ligne, on regarde la colonne statut. Si le pilote a abandonné (ABANDON) ou si la position n'est pas renseignée, on fixe sa position à 0. Sinon, on transforme la position en nombre entier
_On convertit le temps au tour avec la fonction de l'étape 1
_On ajoute les données de chaque ligne dans une liste sous forme de dictionnaire, en ignorant l'en-tête du fichier d'origine

3.
_On écrit l'en-tête avec les colonnes demandées : course, pilote, ecurie, position et temps_tour (la colonne statut est bien supprimée).
_Pour chaque ligne, si le temps au tour est présent, on l'écrit avec 3 décimales. S'il vaut None (cas d'un abandon ou d'une valeur manquante), on laisse la case vide.
_On enregistre toutes les lignes dans l'ordre où elles ont été lues.
