<?php
require_once('payment.php');
class Card extends Payment{
    public $cardNumber;
    public $secureCode;
    public $mark;

    public function __construct($id, $value, $cardNumber, $secureCode, $mark ){
        parent::__construct($id, $value);
        $this->cardNumber = $cardNumber;
        $this->secureCode = $secureCode;
        $this->mark = $mark;
    }
}