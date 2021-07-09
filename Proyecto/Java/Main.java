class Main {//clase main
    public static void main(String[] args) {//metodo principal main
        System.out.println("Hola Mundo");
        //instancia de clase uberx hija de Car
        UberX uberX = new UberX("AMQ123", new Account("Joshua Benitez Prudente", "AND123"), "Chevrolet", "Sonic");//objeto de la clase
        //uberx que recibe los parametros delimitados en el constructor.
        uberX.setPassenger(4);//parametro para el metodo set
        uberX.printDataCar();//metodo heredado de la clase car

        UberVan uberVan = new UberVan("FGH345", new Account("Joshua Benitez Prudente", "AND123"));//objeto de la clase UberVan 
        //hijo de car
        uberVan.setPassenger(6);//parametros para el metodo set
        uberVan.printDataCar();//metodo heredado de Car

        /*Car car2 = new Car("QWE567", new Account("Andrea Herrera", "ANDA876"));
        car2.passegenger = 3;
        car2.printDataCar();*/
    }
}