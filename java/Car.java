class Car {
   Integer id;
   String license;
   Account driver;
   Integer passenger; 
   //METODO
   public Car(String license, Account driver) {
      //licence & driver son variables locales
      this.license = license;
      this.driver = driver;

   }
   void printDataCar(){
      System.out.println("License: " + license + " Driver: " + driver.name);
   }
}
