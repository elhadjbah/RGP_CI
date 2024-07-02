package Classes;

public class MachineACafe {

    public static int nombreCafesServis;
    private int montantRecuperes;

    public void inserer(int piece){
        montantRecuperes+=piece;
        nombreCafesServis+=1;
    }

    public int nombreCafesServis(){
        return nombreCafesServis;
    }


    public int argentEncaisseCentimes(){
        return montantRecuperes;
    }
}
