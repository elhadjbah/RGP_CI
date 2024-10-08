package UserStoriesTest;

import Classes.MachineACafe;
import Classes.Piece;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MachineACafeTest {
    @Test
    public void CasNominal(){
        // ETANT DONNE une machine à café
        var machine = new MachineACafe();

        // QUAND on insère 50cts
        machine.inserer(Piece.cinquanteCentimes);

        // ALORS un café est servi
        var cafesServis = machine.nombreCafesServis;
        assertEquals(1,cafesServis);
        // ET l'argent est encaissé
        var argentEncaisse = machine.argentEncaisseCentimes();
        assertEquals(50,argentEncaisse);
    }

    @Test
    public void CasNominal1Euro(){
        // ETANT DONNE une machine à café
        var machine = new MachineACafe();

        // QUAND on insère 50cts
        machine.inserer(Piece.unEuro);

        // ALORS un café est servi
        var cafesServis = machine.nombreCafesServis;
        assertEquals(1,cafesServis - 1);
        // ET l'argent est encaissé
        var argentEncaisse = machine.argentEncaisseCentimes();
        assertEquals(100,argentEncaisse);
    }

    @Test
    public void CasNominal2fois(){
        // ETANT DONNE une machine à café
        var machine = new MachineACafe();

        // QUAND on insère 50cts
        machine.inserer(Piece.cinquanteCentimes);

        machine.inserer(Piece.cinquanteCentimes);

        // ALORS un café est servi
        var cafesServis = machine.nombreCafesServis;
        assertEquals(2,cafesServis - 2);
        // ET l'argent est encaissé
        var argentEncaisse = machine.argentEncaisseCentimes();
        assertEquals(100,argentEncaisse);
    }

}
