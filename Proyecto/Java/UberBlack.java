import java.util.ArrayList;
import java.util.Map;
//librerias arraylist y map
class UberBlack extends Car {//clase hijo de Car 
    Map<String, ArrayList<String,Integer>> typeCarAccepted;//atributos 
    ArrayList<String> seatsMaterial;

    public UberBlack(String license, Account driver, //metodo constructor
    Map<String, ArrayList<String,Integer>> typeCarAccepted,
    ArrayList<String> seatsMaterial){
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }
}