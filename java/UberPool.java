class UberPool extends Car {

    String brand;
    String model;

    public UberPool(String license, Account driver, String brand, String model) {
        super(license,driver); // super podra acceder a los parametros y metodos de la clase car
        this.brand = brand;
        this.model = model;
    }
}
