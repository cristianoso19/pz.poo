<?php
class Payment{
    public $id;
    public $value;
     public function __construct($id, $value){
        $this->value = $value;
        $this->id = $id;
    }
}