/* =========================================================================
   MAILLON 2 — JAVA : le moteur de calcul
   Complétez les quatre méthodes. Les classes Ligne, Resultat et Chargeur
   sont fournies : ne les modifiez pas.
       javac -encoding UTF-8 -d out src/*.java
       java -Dstdout.encoding=UTF-8 -cp out Tests     (les tests)
       java -Dstdout.encoding=UTF-8 -cp out Main      (la production)
   ========================================================================= */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Classement {

    /** Barème officiel des dix premiers. FOURNI — NE PAS MODIFIER. */
    public static final int[] BAREME = {25, 18, 15, 12, 10, 8, 6, 4, 2, 1};

    // 1. pointsPourPosition(position) : points marqués pour cette position.
    //    1 -> 25, 2 -> 18, ..., 10 -> 1. Au-delà de la 10e place : 0.
    //    Un abandon vaut la position 0, donc 0 point.
    public static int pointsPourPosition(int position) {
    // À COMPLÉTER
    return switch (position) {
        case 1 -> 25;
        case 2 -> 18;
        case 3 -> 15;
        case 4 -> 12;
        case 5 -> 10;
        case 6 -> 8;
        case 7 -> 6;
        case 8 -> 4;
        case 9 -> 2;
        case 10 -> 1;
        default -> 0;
    };
}

    // 2. classementPilotes(lignes) : un Resultat par pilote, avec ses points,
    //    ses victoires (position 1) et ses 2e places, trié par :
    //    points décroissants, puis victoires, puis 2e places, puis nom (A→Z).
    public static List<Resultat> classementPilotes(List<Ligne> lignes) {
        // À COMPLÉTER
        Map<String, Resultat> map = new HashMap<>();

for (Ligne ligne : lignes) {
    Resultat trouve = map.get(ligne.pilote());

    if (trouve == null) {
        trouve = new Resultat(ligne.pilote(), ligne.ecurie());
        map.put(ligne.pilote(), trouve);
    }

    trouve.points += pointsPourPosition(ligne.position());

    if (ligne.position() == 1) trouve.victoires++;
    if (ligne.position() == 2) trouve.deuxiemes++;
}

List<Resultat> resultats = new ArrayList<>(map.values());

resultats.sort((a, b) -> {
    if (a.points != b.points) return b.points - a.points;
    if (a.victoires != b.victoires) return b.victoires - a.victoires;
    if (a.deuxiemes != b.deuxiemes) return b.deuxiemes - a.deuxiemes;
    return a.nom.compareTo(b.nom);
});

return resultats;
    }

    // 3. classementEcuries(pilotes) : additionne les points, victoires et
    //    2e places des pilotes de chaque écurie. Même ordre de tri.
    public static List<Resultat> classementEcuries(List<Resultat> pilotes) {
        // À COMPLÉTER
        return null;
    }

    // 4. positionMoyenne(lignes, pilote) : moyenne des positions de ce pilote,
    //    ABANDONS EXCLUS, arrondie à 2 décimales. 0 s'il n'a jamais terminé.
    //    Ex. positions 1, 2 et un abandon -> 1.5
    public static double positionMoyenne(List<Ligne> lignes, String pilote) {
        // À COMPLÉTER
        return 0;
    }
}
