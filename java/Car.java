class Car {
   Integer id;
   String license;
   Account driver;
   private Integer passenger; 
   //METODO
   public Car(String license, Account driver) {
      //licence & driver son variables locales
      this.license = license;
      this.driver = driver;
   }
   void printDataCar(){
      if (passenger != null){
         System.out.println("License: " + license + " Driver: " + driver.name + " Passengers" +passenger);
      } else {
         System.out.println("Necesitas 4 pasajeros");
      }
   }
   // getters y setters
   public Integer getPassenger(){
      return passenger;
   }
   public void setPassenger(Integer passenger){
      if (passenger == 4){
         this.passenger = passenger;
      }else{
         System.out.println("Necesitas asignar 4 passajeros");
      }
   }
}

