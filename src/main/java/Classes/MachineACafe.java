package Classes;

public class MachineACafe {

    private int nombreCafesServis;
    private int montantRecuperes;
    public MachineACafe(int nombreCafe){
        this.nombreCafesServis=nombreCafe;
    }
    public void inserer(int piece){
        montantRecuperes+=piece;
    }

    public int nombreCafesServis(){
        return nombreCafesServis;
    }


    public int argentEncaisseCentimes(){
        return montantRecuperes;
    }
}
