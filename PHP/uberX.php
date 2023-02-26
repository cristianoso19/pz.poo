<?php
require_once('car.php');
class UberX extends Car {
    public $brand;
    public $model;

    public function __construct($license, $driver, $brand, $model){
        parent::__construct($license, $driver);
        $this->brand = $brand;
        $this->model = $model;
    }
    public function printDataCar(){
        echo "
            license: $this->license
            conductor: $this->driver->name 
            document: $this->driver->document
            brand: $this->brand;
            model: $this->model;
            ";
    }
}