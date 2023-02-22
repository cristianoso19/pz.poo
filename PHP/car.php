<?php
class Car{
    public $id;
    public $license;
    public $driver;
    public $passanger;

    public function __construct($license, $driver){
        $this->license = $license;
        $this->driver = $driver;
    }
    
    public function printDataCar(){
        echo "license: " . $this->license . ", conductor: " . $this->driver->name . ", document: " . $this->driver->document;
    }
    /* For run this code execute:
    php -S localhost:8000 -t .
    and go to localhost in a web browser.
 */
}