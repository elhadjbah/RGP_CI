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
}

