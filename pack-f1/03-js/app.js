/* =========================================================================
   MAILLON 3 — JAVASCRIPT : l'interface
   Les données arrivent du maillon Java, dans donnees.js :
     PILOTES = [{nom, ecurie, points, victoires}, ...]
     ECURIES = [{nom, points, victoires}, ...]
   Complétez les trois fonctions, puis ouvrez index.html dans le navigateur.
   ========================================================================= */

// 1. trierParPoints(liste) : renvoie une NOUVELLE liste triée par points
//    DÉCROISSANTS. La liste reçue ne doit pas être modifiée.
//    À points égaux, celui qui a le plus de victoires passe devant.
function trierParPoints(liste) {
  // À COMPLÉTER
  return [...liste].sort((a, b) => {
    if (b.points !== a.points) {
      return b.points - a.points;
    }
    return b.victoires - a.victoires;
  });
}

// 2. remplirTableau(idCorps, liste) : remplit le <tbody> dont l'id est fourni.
//    Une ligne <tr> par entrée, avec dans l'ordre les cellules <td> :
//      rang (1, 2, 3...) | nom | écurie (chaîne vide si absente) | points | victoires
//    Chaque <tr> porte l'attribut data-nom. Un nouvel appel REMPLACE le contenu.
function remplirTableau(idCorps, liste) {
  // À COMPLÉTER
  let corps = document.getElementById(idCorps);
  corps.innerHTML = "";

  for (let i = 0; i < liste.length; i++) {
    let element = liste[i];
    let rang = i + 1;
    let ecurie = element.ecurie ? element.ecurie : "";

    corps.innerHTML += `
      <tr data-nom="${element.nom}">
        <td>${rang}</td>
        <td>${element.nom}</td>
        <td>${ecurie}</td>
        <td>${element.points}</td>
        <td>${element.victoires}</td>
      </tr>
    `;
  }
}

// 3. marquerPodium(idCorps) : ajoute la classe CSS "podium" aux TROIS PREMIÈRES
//    lignes du tableau, et la retire de toutes les autres.
function marquerPodium(idCorps) {
  // À COMPLÉTER
  let corps = document.getElementById(idCorps);
  let lignes = corps.getElementsByTagName("tr");

  for (let i = 0; i < lignes.length; i++) {
    if (i < 3) {
      lignes[i].classList.add("podium");
    } else {
      lignes[i].classList.remove("podium");
    }
  }
}

/* --- FOURNI — NE PAS MODIFIER : affichage de la saison ------------------- */
function afficherSaison() {
  if (typeof PILOTES === "undefined") {
    return;
  }
  remplirTableau("corps-pilotes", trierParPoints(PILOTES));
  marquerPodium("corps-pilotes");
  remplirTableau("corps-ecuries", trierParPoints(ECURIES));
  marquerPodium("corps-ecuries");
}
