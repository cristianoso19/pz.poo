<?php
require_once('payment.php');
class PayPal extends Payment{
    public $email;

    public function __construct($id, $value, $email)
    {
        parent::__construct($id, $value);
        $this->email = $email; 
    }

}