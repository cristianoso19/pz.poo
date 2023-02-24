class Card extends Payment {

    Integer value;
    String cardNumber;
    String secureCode;
    String mark; 

    public Card (Integer value, String cardNumber, String secureCode, String mark, Integer id){
        super(id);
        this.value = value;
        this.cardNumber = cardNumber;
        this.secureCode = secureCode;
        this.mark = mark;
    }
    
}

