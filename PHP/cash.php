<?php
require_once('payment.php');
class Cash extends Payment{
    public $currency;

    public function __construct($id, $value, $currency)
    {
        parent::__construct($id, $value);
        $this->currency = $currency; 
    }
}