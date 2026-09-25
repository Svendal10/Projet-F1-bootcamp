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


Deuxième étape : Javascript 

1. 
_Pour ne pas modifier la liste d'origine, on commence par en créer une copie avec la syntaxe [...liste].
_On applique un tri décroissant sur la propriété points.
_Si deux entrées ont le même nombre de points, on les départage en regardant le nombre de victoires (celui qui a le plus de victoires passe devant).

2. 
_On récupère l'élément tbody correspondant grâce à document.getElementById(idCorps).
_On vide son contenu avec innerHTML = "" pour s'assurer qu'un nouvel appel remplace bien les anciennes données.
_On parcourt la liste avec une boucle for.
_Pour chaque élément, on calcule le rang (i + 1), on vérifie si la propriété ecurie existe (sinon on met une chaîne vide), et on ajoute une ligne tr contenant l'attribut data-nom ainsi que toutes les cellules td requises.

3.
_On récupère toutes les lignes tr du tableau avec getElementsByTagName('tr').
_On boucle sur l'ensemble de ces lignes.
_Si l'indice est strictement inférieur à 3 (les 3 premières lignes : 0, 1 et 2), on ajoute la classe CSS podium avec classList.add.
_Pour toutes les lignes suivantes, on retire la classe à l'aide de classList.remove.
