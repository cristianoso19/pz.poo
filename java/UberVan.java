import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car {
    Map<String, ArrayList<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;

    public UberVan(String license, Account driver) {
        super(license, driver); // super podra acceder a los parametros y metodos de la clase car
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }
}
