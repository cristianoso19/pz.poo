import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car {
    Map<String, Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;
    private Integer passenger; 

    public UberVan(String license, Account driver) {
        super(license, driver); // super podra acceder a los parametros y metodos de la clase car
    }
    
    public UberVan(String license, Account driver, 
    Map<String, Map<String,Integer>> typeCarAccepted,
    ArrayList<String> seatsMaterial){
        super(license, driver); // super podra acceder a los parametros y metodos de la clase car
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }

    //Polimorfismo 
    //Sobreescribimos este metodo que proviene de la superclase CAR
    //🚀🚀🚀 ESTO ES POLIMORFISMO 🤘🤘🤘
    @Override
    public void setPassenger(Integer passenger) {
        if ( passenger== 6) {
            this.passenger = passenger;
        } else {
            System.out.println("Necesitas asignar 6 pasajeros");
        }
    }
}
