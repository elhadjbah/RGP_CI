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

    public void attaquer(Personnages p){
        if(p.getPointsDeVie()>0){
            p.recevoirdegat(25);
        }else{
            p.tuer();
        }
    }

    public void recevoirdegat(int nbdegat){
        pointsDeVie-=nbdegat;
    }


}
