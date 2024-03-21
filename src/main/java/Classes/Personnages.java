package Classes;


public class Personnages {
    private int pointsDeVie = 100;
    private boolean estMort = false;

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public boolean estMort() {
        return estMort;
    }

    public void tuer() {
        pointsDeVie = 0;
        estMort = true;
    }
}
