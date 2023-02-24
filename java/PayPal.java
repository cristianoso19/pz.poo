class PayPal extends Payment{
    
    String email;
    String value;
    public PayPal(Integer id, String email, String value){
        super(id);
        this.email = email;
        this.value = value;
    }

}
