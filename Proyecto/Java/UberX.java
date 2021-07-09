class UberX extends Car {
    String brand;
    String model;//atributos

    public UberX(String license, Account driver, String brand, String model){//constructor
        super(license, driver);
        this.brand = brand;
        this.model = model;

    }

    @Override
    void printDataCar() {//override
        super.printDataCar();
        System.out.println("Modelo: " + model + " Brand: " + brand);
    }
}