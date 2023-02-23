<?php
require_once('car.php');
require_once('uberX.php');
require_once('uberPool.php');
require_once('account.php');

$uberX = new UberX("CVB123", new Account("Andres Herrera", "AND123"),"Acura","RTX");
//$car = new Car("AW456", new Account("Andres Herrera", "AMS123"));
$uberX->printDataCar();

$uberPool = new UberPool("PBO1001", new Account("Jenny Portilla", "AND123"),"Audi","R5");
$uberPool->printDataCar();