package arraylist.project.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

class ArrayListMethodenTest {

    // Helper om snel een ArrayList te maken
    private ArrayList<Integer> lijstVan(int... getallen) {
        ArrayList<Integer> lijst = new ArrayList<>();
        for (int getal : getallen) {
            lijst.add(getal);
        }
        return lijst;
    }

    // --- somVanRij ---

    @Test
    void somVanRij_drieGetallen_geeftJuisteSom() {
        ArrayList<Integer> rij = lijstVan(1, 2, 3);
        assertEquals(6, ArrayListMethoden.somVanRij(rij));
    }

    @Test
    void somVanRij_legeRij_geeftNul() {
        ArrayList<Integer> rij = new ArrayList<>();
        assertEquals(0, ArrayListMethoden.somVanRij(rij));
    }

    @Test
    void somVanRij_eenGetal_geeftDatGetal() {
        ArrayList<Integer> rij = lijstVan(42);
        assertEquals(42, ArrayListMethoden.somVanRij(rij));
    }

    // --- gemiddeldeVanRij ---

    @Test
    void gemiddeldeVanRij_tweegelijke_geeftJuistGemiddelde() {
        ArrayList<Integer> rij = lijstVan(4, 6);
        assertEquals(5.0, ArrayListMethoden.gemiddeldeVanRij(rij), 0.001);
    }

    @Test
    void gemiddeldeVanRij_drieGetallen_geeftJuistGemiddelde() {
        ArrayList<Integer> rij = lijstVan(10, 20, 30);
        assertEquals(20.0, ArrayListMethoden.gemiddeldeVanRij(rij), 0.001);
    }

    // --- maakRijWillekeurigeGetallen ---

    @Test
    void maakRijWillekeurigeGetallen_geeftJuisteGrootte() {
        ArrayList<Integer> rij = ArrayListMethoden.maakRijWillekeurigeGetallen(10, 100);
        assertEquals(10, rij.size());
    }

    @Test
    void maakRijWillekeurigeGetallen_alleGettallenBinnenBereik() {
        ArrayList<Integer> rij = ArrayListMethoden.maakRijWillekeurigeGetallen(50, 10);
        for (int getal : rij) {
            assertTrue(getal >= 1 && getal <= 10,
                    "Getal " + getal + " valt buiten bereik [1, 10]");
        }
    }
}
