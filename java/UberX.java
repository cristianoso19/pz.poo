class UberX extends Car {

    String brand;
    String model;

    public UberX(String license, Account driver, String brand, String model) {
        super(license,driver); // super podra acceder a los parametros y metodos de la clase car
        this.brand = brand;
        this.model = model;
    }
    @Override
    void printDataCar() {
        super.printDataCar();
        System.out.println("Modelo: "  + model + " Brand :" + brand);
    }
}
