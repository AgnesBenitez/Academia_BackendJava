class UberPool extends Car {//clase hijo de car
    String brand;
    String model;//atributos

    public UberPool(String license, Account driver, String brand, String model){
        super(license, driver);
        this.brand = brand;//constructor
        this.model = model;

    }
}