package PersonnageTest;

import Classes.Personnages;
import org.junit.Test;

import static org.junit.Assert.*;

import Classes.Personnages;
import org.junit.Test;
import static org.junit.Assert.*;

public class PersonnageTest {

    @Test
    public void testHpInitiaux() {
        Personnages personnage = new Personnages();
        assertEquals(100, personnage.getPointsDeVie());
        //assertEquals(true,true);
    }

    @Test
    public void testInitialementVivant() {
        Personnages personnage = new Personnages();
        assertFalse(personnage.estMort());
    }

    @Test
    public void testMort() {
        Personnages personnage = new Personnages();
        personnage.tuer();
        assertEquals(0, personnage.getPointsDeVie());
        assertTrue(personnage.estMort());
    }


    @Test
    public void attaque2() {
        Personnages personnage1 = new Personnages();
        Personnages personnage2 = new Personnages();

        personnage1.attaquer(personnage2);
        assertEquals(75, personnage2.getPointsDeVie());

        personnage1.attaquer(personnage2);
        assertEquals(50, personnage2.getPointsDeVie());

        personnage1.attaquer(personnage2);
        assertEquals(25, personnage2.getPointsDeVie());

        personnage1.attaquer(personnage2);
        assertEquals(0, personnage2.getPointsDeVie());
        //assertTrue(personnage2.estMort());
    }

    @Test
    public void recevoirdegat() {
        Personnages personnage = new Personnages();
        personnage.recevoirdegat(1);
        assertEquals(99, personnage.getPointsDeVie());
        assertFalse(personnage.estMort());
    }
}

