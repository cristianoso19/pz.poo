class Cash extends Payment {
    String value;

    public Cash (String value, Integer id){
        super(id);
        this.value = value;
    }
    
}
